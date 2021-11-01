package com.bc.c_parameter;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    // 针对于基本类型，客户端必须传递参数，否则会报错
    @RequestMapping("f1")
    public String f1(byte b, short s, int i, long l, float f, double d, boolean bb, char c) {
        System.out.println(b);
        System.out.println(s);
        System.out.println(i);
        System.out.println(l);
        System.out.println(f);
        System.out.println(d);
        System.out.println(bb);
        System.out.println(c);
        return "c";
    }
}
