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
    @Column(name = "id_tipo", unique = true, nullable = false)
    private Integer idTipo;

    @OneToMany(mappedBy = "Identification")
    private List<Owner> owners;

    @OneToMany(mappedBy = "Identification")
    private List<Veterinary> veterinaries;
}
