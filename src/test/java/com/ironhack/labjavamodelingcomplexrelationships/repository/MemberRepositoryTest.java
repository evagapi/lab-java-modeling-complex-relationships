package com.ironhack.labjavamodelingcomplexrelationships.repository;

import com.ironhack.labjavamodelingcomplexrelationships.model.Member;
import com.ironhack.labjavamodelingcomplexrelationships.model.Status;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Date;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class MemberRepositoryTest {

    @Autowired
    MemberRepository memberRepository;

    @BeforeEach
    void setUp() {
        Member member1 = new Member("Alicia", Status.ACTIVE, new Date());
        memberRepository.save(member1);
    }

    @AfterEach
    void tearDown() {
        memberRepository.deleteAll();
        memberRepository.flush();
    }

    @Test
    public void findByNameTest() {
        Optional<Member> member = memberRepository.findByName("Alicia");
        assertTrue(member.isPresent());
        assertEquals(member.get().getName(), "Alicia");
    }

    @Test
    public void findByStatusTest() {
        Optional<Member> member = memberRepository.findByStatus(Status.ACTIVE);
        assertTrue(member.isPresent());
        assertEquals(member.get().getStatus(), Status.ACTIVE);
    }

}