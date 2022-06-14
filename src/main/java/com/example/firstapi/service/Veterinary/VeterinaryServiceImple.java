package com.example.firstapi.service.Veterinary;

import com.example.firstapi.dto.request.Veterinary.VeterinaryDTOUpdate;
import com.example.firstapi.dto.request.Veterinary.VeterinaryDTOreq;
import com.example.firstapi.dto.response.Veterinary.VeterinaryDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VeterinaryServiceImple implements VeterinaryService{
    @Override
    public VeterinaryDTO getVeterinaryById(int idVeterinary) {
        return null;
    }

    @Override
    public List<VeterinaryDTO> getAllVeterinaries() {
        return null;
    }

    @Override
    public VeterinaryDTO createVeterinary(VeterinaryDTOreq veterinaryDTOreq) {
        return null;
    }

    @Override
    public VeterinaryDTO updateVeterinary(VeterinaryDTOUpdate veterinaryDTOUpdate) {
        return null;
    }

    @Override
    public void deleteVeterinaryById(int idVeterinary) {

    }
}
