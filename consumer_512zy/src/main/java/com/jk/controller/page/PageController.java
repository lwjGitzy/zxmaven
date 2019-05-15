package com.jk.controller.page;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("page")
public class PageController {



    @RequestMapping("tomain")
    public String main() {
        return "main";
    }
}