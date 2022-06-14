package com.example.firstapi.service.Veterinary;

import com.example.firstapi.dto.request.Pet.PetDTOUpdate;
import com.example.firstapi.dto.request.Pet.PetDTOreq;
import com.example.firstapi.dto.request.Veterinary.VeterinaryDTOUpdate;
import com.example.firstapi.dto.request.Veterinary.VeterinaryDTOreq;
import com.example.firstapi.dto.response.Pet.PetDTO;
import com.example.firstapi.dto.response.Veterinary.VeterinaryDTO;

import java.util.List;

public interface VeterinaryService {

    VeterinaryDTO getVeterinaryById(int idVeterinary);

    List<VeterinaryDTO> getAllVeterinaries ();

    VeterinaryDTO createVeterinary (VeterinaryDTOreq veterinaryDTOreq);

    VeterinaryDTO updateVeterinary (VeterinaryDTOUpdate veterinaryDTOUpdate);

    void deleteVeterinaryById(int idVeterinary);
}
