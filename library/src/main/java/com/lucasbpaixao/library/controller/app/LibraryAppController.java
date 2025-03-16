package com.lucasbpaixao.library.controller.app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
public class LibraryAppController {
    @RequestMapping("/")
    public String index() {
        return "index.html";
    }

    @RequestMapping("/category")
    public String category() {
        return "category.html";
    }

}
