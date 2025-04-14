package org.example.bootblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class DiaryController {
    @GetMapping
    public String index(Model model) {
        model.addAttribute("message", "메세지");
        return "index";
    }
}
