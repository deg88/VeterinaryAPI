package com.example.firstapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "places")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Place {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_place", unique = true, nullable = false)
    private Integer idPlace;

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "phone", unique = true, nullable = false)
    private Integer phone;

    @Column(name = "addres", unique = true, nullable = false)
    private String addres;

    @OneToMany(mappedBy = "place")
    private List<Veterinary> veterinaries;

    @OneToMany(mappedBy = "place")
    private List<Pet> pets;


}
