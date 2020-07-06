package ro.ubb.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ubb.core.model.Owner;
import ro.ubb.core.repository.OwnerRepository;

import java.util.List;


@Service
public class OwnerServiceImpl implements OwnerService {


    @Autowired
    OwnerRepository ownerRepository;

    @Override
    public List<Owner> getAllOwners() {
        List<Owner> result = ownerRepository.findAll();
        return result;
    }

    @Override
    public Owner getOwnerWithAnimals(Long ownerid) {
        return null;
    }

    @Override
    public Owner addAnimal(Long ownerId, Long animalId) {
        return null;
    }

    @Override
    public void deleteOwner(Long ownerid) {

    }
}
