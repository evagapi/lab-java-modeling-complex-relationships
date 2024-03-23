package com.ironhack.labjavamodelingcomplexrelationships.model.users;

import com.ironhack.labjavamodelingcomplexrelationships.model.events.Conference;
import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@Table(name = "speakers")
public class Speaker extends User {
    private String presentationDuration;

    @ManyToOne
    @JoinColumn(name = "conference_id")
    private Conference conference;
}
