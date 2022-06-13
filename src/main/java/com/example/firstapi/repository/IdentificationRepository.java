package com.example.firstapi.repository;

import com.example.firstapi.model.Identification;
import org.springframework.data.jpa.repository.JpaRepository;

public interface IdentificationRepository extends JpaRepository<Identification,Integer> {


}
