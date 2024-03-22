package com.ironhack.labjavamodelingcomplexrelationships.model.events;

import com.ironhack.labjavamodelingcomplexrelationships.model.users.Speaker;
import jakarta.persistence.DiscriminatorValue;
import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Entity
@Setter
@Getter
@DiscriminatorValue("conference")
public class Conference extends Event {
    @OneToMany(mappedBy = "conference")
    List<Speaker> speakers;

    public Conference(String date, String duration, String location, String title) {
        super(date, duration, location, title);
    }

    public Conference() {
    }
}
