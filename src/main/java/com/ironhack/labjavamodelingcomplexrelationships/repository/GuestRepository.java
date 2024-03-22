package com.ironhack.labjavamodelingcomplexrelationships.repository;

import com.ironhack.labjavamodelingcomplexrelationships.model.users.Guest;
import com.ironhack.labjavamodelingcomplexrelationships.model.users.GuestStatus;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.Optional;

@Repository
public interface GuestRepository extends JpaRepository<Guest, Integer> {
    Optional<Guest> findByName(String name);
    Optional<Guest> findByGuestStatus(GuestStatus guestStatus);
}
//private String name;
// private GuestStatus status;