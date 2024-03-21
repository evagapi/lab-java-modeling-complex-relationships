package com.ironhack.labjavamodelingcomplexrelationships.controller;

import com.ironhack.labjavamodelingcomplexrelationships.model.Member;
import com.ironhack.labjavamodelingcomplexrelationships.service.MemberService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class MemberController {

    @Autowired
    private MemberService memberService;

    @GetMapping("/members")
    public List<Member> getAllMembers() { return memberService.getAllMembers(); }
    @PostMapping("/members")
    public Member addNewMember(@RequestBody Member member) { return memberService.addNewMember(member); }
}
