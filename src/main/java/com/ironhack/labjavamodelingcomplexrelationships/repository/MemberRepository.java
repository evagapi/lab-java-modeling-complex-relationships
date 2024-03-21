package com.ironhack.labjavamodelingcomplexrelationships.repository;

import com.ironhack.labjavamodelingcomplexrelationships.model.Member;
import com.ironhack.labjavamodelingcomplexrelationships.model.Status;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface MemberRepository extends JpaRepository<Member, Integer> {
    Optional<Member> findByName(String name);
    Optional<Member> findByStatus(Status status);
}
