package com.ironhack.labjavamodelingcomplexrelationships.model.events;

import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;


@Entity
@DiscriminatorValue("exposition")
public class Exposition extends Event {
    public Exposition(String date, String duration, String location, String title) {
        super(date, duration, location, title);
    }
}
