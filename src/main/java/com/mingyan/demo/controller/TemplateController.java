package com.mingyan.demo.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 *
 */
@RestController
public class TemplateController {
    @RequestMapping("/welcome")
    public ModelAndView welcomeTemplate() {
        ModelAndView mv = new ModelAndView("welcome");
        mv.addObject("message","哈哈哈哈 我试试看哈");
        return mv;
    }
}//end class
