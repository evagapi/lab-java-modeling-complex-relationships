package com.ironhack.labjavamodelingcomplexrelationships.model;

import com.ironhack.labjavamodelingcomplexrelationships.model.users.Member;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Entity
@Table(name = "chapters")
@Data
@NoArgsConstructor
public class Chapter {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String district;

    @OneToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "president_id", referencedColumnName = "id")
    private Member president;

    @OneToMany(mappedBy = "chapter")
    private List<Member> members;

    public Chapter(String name, String district, Member president, List<Member> members) {
        this.name = name;
        this.district = district;
        this.president = president;
        this.members = members;
    }
}
