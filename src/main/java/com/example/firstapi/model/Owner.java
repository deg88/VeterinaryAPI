package com.example.firstapi.model;


import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;

@Entity
@Table(name = "owner")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class Owner {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_owner", unique = true, nullable = false)
    private Integer idOwner;

    @Column(name = "name_owner", nullable = false)
    private String nameOwner;

    @Column(name = "local_date_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime dateOwner;

    @Column(name = "email_owner", nullable = false)
    private String emailOwner;

    @Column(name = "username", nullable = false, unique = true)
    private String userNameOwner;

    @Column(name = "password_owner", nullable = false, unique = true)
    private String passwordOwner;

    @Column(name = "addres_owner", unique = true, nullable = false)
    private String addresOwner;

    @Column(name = "cel_owner", unique = true, nullable = false)
    private Integer celOwner;

    @ManyToOne
    @JoinColumn(name = "id_identification",nullable = false)
    private Identification identification;

    @OneToMany(mappedBy = "owner")
    private List<Pet> pets;
}
