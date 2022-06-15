package com.example.firstapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "veterinary")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Veterinary {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_veterinary", unique = true, nullable = false)
    private Integer idveterinary;

    @Column(name = "name_veterinary", nullable = false)
    private String nameVeterinary;

    @Column(name = "local_date_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime dateVeterinary;

    @Column(name = "specialization_veterinary", nullable = false)
    private String specializationVeterinary;

    @Column(name = "email_veterinary", nullable = false)
    private String emailVeterinary;

    @Column(name = "user_name_veterinary", nullable = false, unique = true)
    private String userName;

    @Column(name = "password_veterinary", nullable = false, unique = true)
    private String passwordVeterinary;

    @Column(name = "addres_veterinary", unique = true, nullable = false)
    private String addresVeterinary;

    @Column(name = "cel_veterinary", unique = true, nullable = false)
    private Integer celVeterinary;

    @ManyToOne()
    @JoinColumn(name = "identification", nullable = false)
    private Identification identification;

    @ManyToOne()
    @JoinColumn(name = "place", nullable = false)
    private Place place;

    @OneToMany(mappedBy = "veterinary")
    private List<Pet> pets;


}
