package com.example.firstapi.dto.response.Place;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.databind.PropertyNamingStrategy;
import com.fasterxml.jackson.databind.annotation.JsonNaming;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@JsonNaming(PropertyNamingStrategy.SnakeCaseStrategy.class)
public class PlaceDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer idPlace;

    private String namePlace;

    private String addres;

    private String phonePlace;
}
