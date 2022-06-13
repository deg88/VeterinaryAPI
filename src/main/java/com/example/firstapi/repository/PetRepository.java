package com.example.firstapi.repository;

import com.example.firstapi.model.Pet;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PetRepository extends JpaRepository<Pet,Integer> {

}
