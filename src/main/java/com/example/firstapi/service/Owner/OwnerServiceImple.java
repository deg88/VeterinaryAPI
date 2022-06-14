package com.example.firstapi.service.Owner;

import com.example.firstapi.dto.request.Owner.OwnerDTOUpdate;
import com.example.firstapi.dto.request.Owner.OwnerDTOreq;
import com.example.firstapi.dto.response.Owner.OwnerDTO;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImple implements OwnerService{
    @Override
    public OwnerDTO getOwnerById(int idOwner) {
        return null;
    }

    @Override
    public List<OwnerDTO> getAllOwners() {
        return null;
    }

    @Override
    public OwnerDTO createOwner(OwnerDTOreq ownerDTOreq) {
        return null;
    }

    @Override
    public OwnerDTO updateOwner(OwnerDTOUpdate ownerDTOUpdate) {
        return null;
    }

    @Override
    public void deleteOwnerById(int idOwner) {

    }
}
