package com.ironhack.labjavamodelingcomplexrelationships.controller;

import com.ironhack.labjavamodelingcomplexrelationships.model.Chapter;
import com.ironhack.labjavamodelingcomplexrelationships.service.ChapterService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ChapterController {

    @Autowired
    private ChapterService chapterService;

    @GetMapping("/chapters")
    public List<Chapter> getAllChapters() { return chapterService.getAllChapters(); }
    @PostMapping("/chapters")
    public Chapter addNewChapter(@RequestBody Chapter chapter) { return chapterService.addNewChapter(chapter); }
}
