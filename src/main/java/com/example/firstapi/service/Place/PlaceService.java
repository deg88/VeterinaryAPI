package com.example.firstapi.service.Place;

import com.example.firstapi.dto.request.Pet.PetDTOUpdate;
import com.example.firstapi.dto.request.Pet.PetDTOreq;
import com.example.firstapi.dto.request.Place.PlaceDTOUpdate;
import com.example.firstapi.dto.request.Place.PlaceDTOreq;
import com.example.firstapi.dto.response.Pet.PetDTO;
import com.example.firstapi.dto.response.Place.PlaceDTO;

import java.util.List;

public interface PlaceService {

    PlaceDTO getPlaceById(int idPlace);

    List<PlaceDTO> getAllPlace ();

    PlaceDTO createPlace (PlaceDTOreq placeDTOreq);

    PlaceDTO updatePlace (PlaceDTOUpdate placeDTOUpdate);

    void deletePlaceById(int idPlace);
}
