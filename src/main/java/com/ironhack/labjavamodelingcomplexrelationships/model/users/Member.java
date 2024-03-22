package com.ironhack.labjavamodelingcomplexrelationships.model.users;

import com.ironhack.labjavamodelingcomplexrelationships.model.Chapter;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

import java.util.Date;

@Entity
@Table(name = "members")
@NoArgsConstructor
public class Member extends User {
    @Enumerated(EnumType.STRING)
    private MemberStatus status;
    private Date renewalDate;

    @ManyToOne
    private Chapter chapter;

    public Member(String alicia, MemberStatus memberStatus, Date date) {
    }
}
