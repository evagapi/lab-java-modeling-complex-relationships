package com.ironhack.labjavamodelingcomplexrelationships.model;

import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;

@Entity
@Table(name = "members")
@Data
@NoArgsConstructor
public class Member {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    @Enumerated(EnumType.STRING)
    private Status status;
    private Date renewalDate;

    @ManyToOne
    @JoinColumn(name = "chapter_id")
    private Chapter chapter;

    public Member(String name, Status status, Date renewalDate) {
        this.name = name;
        this.status = status;
        this.renewalDate = renewalDate;
    }
}
