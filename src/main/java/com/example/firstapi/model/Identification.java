package com.example.firstapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity()
@Table(name = "Identification")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Identification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_identification", unique = true, nullable = false)
    private Integer idIdentification;

    @Column(name = "type_identification", nullable = false)
    private Integer typeIdentification;


    @OneToMany(mappedBy = "identification")
    private List<Owner> owners;

    @OneToMany(mappedBy = "identification")
    private List<Veterinary> veterinaries;
}
