package org.example.bootblog.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/diary")
public class DiaryController {
    @GetMapping
    public String list(Model model) {
        model.addAttribute("message", "리스트임");
        return "diary/list";
    }

    @GetMapping("/new")
    public String form(Model model) {
        model.addAttribute("message", "폼임");
        return "diary/form";
    }
}
