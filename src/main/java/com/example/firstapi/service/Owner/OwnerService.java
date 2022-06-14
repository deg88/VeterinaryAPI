package com.example.firstapi.service.Owner;

import com.example.firstapi.dto.request.Owner.OwnerDTOUpdate;
import com.example.firstapi.dto.request.Owner.OwnerDTOreq;
import com.example.firstapi.dto.response.Owner.OwnerDTO;

import java.util.List;

public interface OwnerService {

    OwnerDTO getOwnerById(int idOwner);

    List<OwnerDTO> getAllOwners ();

    OwnerDTO createOwner (OwnerDTOreq ownerDTOreq);

    OwnerDTO updateOwner (OwnerDTOUpdate ownerDTOUpdate);

    void deleteOwnerById(int idOwner);
}
