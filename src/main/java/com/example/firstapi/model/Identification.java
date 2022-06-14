package com.example.firstapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Entity()
@Table(name = "IdentificationDTOpost")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Identification {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_type", unique = true, nullable = false)
    private Integer idType;

    @OneToMany(mappedBy = "IdentificationDTOpost")
    private List<Owner> owners;

    @OneToMany(mappedBy = "IdentificationDTOpost")
    private List<Veterinary> veterinaries;
}
