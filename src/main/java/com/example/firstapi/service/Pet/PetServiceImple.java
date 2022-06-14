package com.example.firstapi.service.Pet;

import com.example.firstapi.dto.request.Pet.PetDTOUpdate;
import com.example.firstapi.dto.request.Pet.PetDTOreq;
import com.example.firstapi.dto.response.Pet.PetDTO;

import java.util.List;

public class PetServiceImple implements PetService {
    @Override
    public PetDTO getPetById(int idPet) {
        return null;
    }

    @Override
    public List<PetDTO> getAllPets() {
        return null;
    }

    @Override
    public PetDTO createPet(PetDTOreq petDTOreq) {
        return null;
    }

    @Override
    public PetDTO updatePet(PetDTOUpdate petDTOUpdate) {
        return null;
    }

    @Override
    public void deletePetById(int idPet) {

    }
}
