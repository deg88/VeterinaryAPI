package com.example.firstapi.service.Pet;

import com.example.firstapi.dto.request.Pet.PetDTOUpdate;
import com.example.firstapi.dto.request.Pet.PetDTOreq;
import com.example.firstapi.dto.response.Pet.PetDTO;

import java.util.List;

public interface PetService {

    PetDTO getPetById(int idPet);

    List<PetDTO> getAllPets ();

    PetDTO createPet (PetDTOreq petDTOreq);

    PetDTO updatePet (PetDTOUpdate petDTOUpdate);

    void deletePetById(int idPet);
}
