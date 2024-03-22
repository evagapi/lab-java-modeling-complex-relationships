package com.ironhack.labjavamodelingcomplexrelationships.model.events;

import com.ironhack.labjavamodelingcomplexrelationships.model.users.Guest;
import jakarta.persistence.*;
import lombok.AccessLevel;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@DiscriminatorColumn(name = "type")
public abstract class Event {
    @Setter(AccessLevel.NONE)
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String date;
    private String duration;
    private String location;
    private String title;

    @OneToMany(mappedBy = "event")
    private List<Guest> guests;

    public Event() {
    }
    public Event(String date, String duration, String location, String title) {
        this.date = date;
        this.duration = duration;
        this.location = location;
        this.title = title;
    }

}
