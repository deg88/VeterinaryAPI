package com.example.firstapi.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.time.LocalDateTime;

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

    @Column(name = "name", nullable = false)
    private String name;

    @Column(name = "local_date_time", columnDefinition = "TIMESTAMP")
    private LocalDateTime date;

    @Column(name = "specialization", nullable = false)
    private String specialization;

    @Column(name = "email", nullable = false)
    private String email;

    @Column(name = "identification", nullable = false, unique = true)
    private String identification;

    @Column(name = "user_name", nullable = false, unique = true)
    private String userName;

    @Column(name = "password", nullable = false, unique = true)
    private String password;

    @Column(name = "addres", unique = true, nullable = false)
    private String addres;

    @Column(name = "cel", unique = true, nullable = false)
    private Integer cel;
}
