package com.ironhack.labjavamodelingcomplexrelationships.service;

import com.ironhack.labjavamodelingcomplexrelationships.model.Member;
import com.ironhack.labjavamodelingcomplexrelationships.repository.MemberRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class MemberService {

    @Autowired
    private MemberRepository memberRepository;

    public List<Member> getAllMembers() { return memberRepository.findAll(); }
    public Member addNewMember(Member member) { return memberRepository.save(member); }
}
