package com.example.firstapi.dto.response.Veterinary;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.time.LocalDateTime;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class VeterinaryDTO {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer idVeterinary;

    private String nameVeterinary;

    private String lastNameVeterinary;

    private LocalDateTime dateVeterinary;

    private String especilization;

    private String emailVeterinary;

    private String usernameVeterinary;

    private String passwordVeterinary;

    private String addresVeterinary;

    private String celVeterinary;






}
