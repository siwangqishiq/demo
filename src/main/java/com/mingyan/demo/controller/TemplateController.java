package com.mingyan.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 */
@RestController
@RequestMapping("/tmp")
public class TemplateController {
    @RequestMapping("/welcome")
    public ModelAndView welcomeTemplate() {
        ModelAndView mv = new ModelAndView("welcome");
        mv.addObject("message","哈哈哈哈 我试试看哈23");
        System.out.println("XXXXXX------XXXXXXXXXXXX");
        return mv;
    }
}//end class
