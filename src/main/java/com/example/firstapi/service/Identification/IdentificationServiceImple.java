package com.example.firstapi.service.Identification;

import com.example.firstapi.dto.request.Identification.IdentificationDTOUpdate;
import com.example.firstapi.dto.request.Identification.IdentificationDTOpost;
import com.example.firstapi.dto.response.Identification.IdentificationDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class IdentificationServiceImple implements IdentificationService{


    @Override
    public IdentificationDTO getIdentificationById(int idIdentification) {
        return null;
    }

    @Override
    public List<IdentificationDTO> getAllIdentification() {
        return null;
    }

    @Override
    public IdentificationDTO createIdentification(IdentificationDTOpost tipoIdentificacionDTOPost) {
        return null;
    }

    @Override
    public IdentificationDTO updateTipoIdentificacion(IdentificationDTOUpdate identificacionDTOPost) {
        return null;
    }

    @Override
    public void deleteIdentificationById(int idIdentification) {

    }
}
