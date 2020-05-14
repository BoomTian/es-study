package com.tbw.esstudy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

/**
 * @author tbw
 */
@Controller
public class IndexController {

    @GetMapping({"/","/index"})
    public String index(){
        return "index2";
    }
}
