package com.bc.b_simple;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping("user")
public class UserController{
    @RequestMapping("save")
    public ModelAndView save(){
        System.out.println("save");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("a");
        return modelAndView;
    }

    @RequestMapping("delete")
    public ModelAndView delete(){
        System.out.println("delete");
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("b");
        return modelAndView;
    }
}
