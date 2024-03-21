package com.ironhack.labjavamodelingcomplexrelationships.service;

import com.ironhack.labjavamodelingcomplexrelationships.model.Chapter;
import com.ironhack.labjavamodelingcomplexrelationships.repository.ChapterRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ChapterService {

    @Autowired
    private ChapterRepository chapterRepository;

    public List<Chapter> getAllChapters() { return chapterRepository.findAll(); }
    public Chapter addNewChapter(Chapter chapter) { return chapterRepository.save(chapter); }
}
