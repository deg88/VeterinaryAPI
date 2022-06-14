package com.example.firstapi.dto.response.Owner;

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

public class OwnerDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    private Integer idOwner;

    private String nameOwner;

    private String lastNameOwner;

    private LocalDateTime dateOwner;

    private String addresOwner;

    private String celOwner;

    private String emailOwner;

    private String passwordOwner;

    private String usernameOwner;
}
