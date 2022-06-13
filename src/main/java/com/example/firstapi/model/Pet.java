package com.example.firstapi.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

@Entity
@Table(name = "pets")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Pet {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_pet", unique = true, nullable = false)
    private Integer idPet;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "local_date_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime date;

    @Column(name = "breed", nullable = false)
    private String breed;

    @Column(name = "reason", nullable = false)
    private String reason;

    @Column(name = "intern", nullable = false)
    private Boolean intern;

    @ManyToOne()
    @JoinColumn(name = "veteriray", nullable = false)
    private Veterinary veterinary;

    @ManyToOne()
    @JoinColumn(name = "owner", nullable = false)
    private Owner owner;

    @ManyToOne()
    @JoinColumn(name = "place", nullable = false)
    private Place place;




}
