package org.example.bootblog.controller;

import lombok.RequiredArgsConstructor;
import org.example.bootblog.model.dto.DiaryForm;
import org.example.bootblog.model.entity.Diary;
import org.example.bootblog.service.DiaryService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller // Spring context
@RequestMapping("/diary")
@RequiredArgsConstructor
public class DiaryController {
    private final DiaryService diaryService;


    @GetMapping
    public String list(Model model) {
        model.addAttribute("message", "리스트임");
        model.addAttribute("list", diaryService.getAllDiaryList());
        return "diary/list";
    }

    @GetMapping("/new")
    public String form(Model model) {
        model.addAttribute("message", "폼임");
        model.addAttribute("form", new DiaryForm("", "", null));
        return "diary/form";
    }

    @PostMapping("/new")
    public String save(DiaryForm form, RedirectAttributes redirectAttributes) {
        Diary diary = new Diary();
        diary.setTitle(form.title());
        diary.setContent(form.content());
        Diary result = diaryService.createDiary(diary);
        redirectAttributes.addFlashAttribute("message", result.getUuid());
        return "redirect:/diary/list";
    }
}
