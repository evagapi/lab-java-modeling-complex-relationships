package com.ironhack.labjavamodelingcomplexrelationships.repository;

import com.ironhack.labjavamodelingcomplexrelationships.model.Chapter;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface ChapterRepository extends JpaRepository<Chapter, Integer> {
    Optional<Chapter> findByName(String name);
    Optional<Chapter> findByDistrict(String name);
}
