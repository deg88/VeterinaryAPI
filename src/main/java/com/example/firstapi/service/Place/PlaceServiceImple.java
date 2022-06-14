package com.example.firstapi.service.Place;

import com.example.firstapi.dto.request.Place.PlaceDTOUpdate;
import com.example.firstapi.dto.request.Place.PlaceDTOreq;
import com.example.firstapi.dto.response.Place.PlaceDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PlaceServiceImple implements PlaceService{
    @Override
    public PlaceDTO getPlaceById(int idPlace) {
        return null;
    }

    @Override
    public List<PlaceDTO> getAllPlace() {
        return null;
    }

    @Override
    public PlaceDTO createPlace(PlaceDTOreq placeDTOreq) {
        return null;
    }

    @Override
    public PlaceDTO updatePlace(PlaceDTOUpdate placeDTOUpdate) {
        return null;
    }

    @Override
    public void deletePlaceById(int idPlace) {

    }
}
