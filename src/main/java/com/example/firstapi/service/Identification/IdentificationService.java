package com.example.firstapi.service.Identification;

import com.example.firstapi.dto.request.Identification.IdentificationDTOUpdate;
import com.example.firstapi.dto.request.Identification.IdentificationDTOpost;
import com.example.firstapi.dto.response.Identification.IdentificationDTO;

import java.util.List;

public interface IdentificationService {

    IdentificationDTO getIdentificationById(int idIdentification);

    List<IdentificationDTO> getAllIdentification();

    IdentificationDTO createIdentification(IdentificationDTOpost tipoIdentificacionDTOPost);

    IdentificationDTO updateTipoIdentificacion(IdentificationDTOUpdate identificacionDTOPost);

    void deleteIdentificationById(int idIdentification);


}
