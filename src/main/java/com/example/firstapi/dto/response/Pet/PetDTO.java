package com.example.firstapi.dto.response.Pet;

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
public class PetDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer idPet;

    private String namePet;

    private LocalDateTime datePet;

    private String breed;

    private String reason;

    private String inter;
}
