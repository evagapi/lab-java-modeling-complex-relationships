package com.ironhack.labjavamodelingcomplexrelationships.model.users;

import com.ironhack.labjavamodelingcomplexrelationships.model.events.Conference;
import jakarta.persistence.*;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "guests")
@NoArgsConstructor
public class Guest extends User {
    @Enumerated(EnumType.STRING)
    private GuestStatus guestStatus;

    @ManyToOne
    private Conference event;
}
