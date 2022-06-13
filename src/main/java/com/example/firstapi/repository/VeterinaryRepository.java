package com.example.firstapi.repository;

import com.example.firstapi.model.Veterinary;
import org.springframework.data.jpa.repository.JpaRepository;

public interface VeterinaryRepository extends JpaRepository<Veterinary, Integer> {
}
