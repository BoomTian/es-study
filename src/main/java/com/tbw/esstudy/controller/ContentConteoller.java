package com.tbw.esstudy.controller;

import com.tbw.esstudy.service.ContentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;
import java.util.Map;

@RestController
public class ContentConteoller {

    @Autowired
    private ContentService contentService;

    @GetMapping("/parse/{keyword}")
    public boolean parse(@PathVariable("keyword") String keyword) throws IOException {
        return contentService.parse(keyword);
    }
    @GetMapping("/search/{keyword}/{pageNo}/{pageSize}")
    public List<Map<String,Object>> search(@PathVariable String keyword,
                                           @PathVariable int pageNo,
                                           @PathVariable int pageSize) throws IOException {
        return contentService.search(keyword,pageNo,pageSize);
    }
}
