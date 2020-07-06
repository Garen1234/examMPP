package ro.ubb.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import ro.ubb.core.model.Animal;
import ro.ubb.core.model.Owner;
import ro.ubb.core.repository.AnimalRepository;
import ro.ubb.core.repository.OwnerRepository;

import java.util.List;
import java.util.Optional;


@Service
public class OwnerServiceImpl implements OwnerService {


    @Autowired
    OwnerRepository ownerRepository;
    @Autowired
    AnimalRepository animalRepository;

    @Override
    public List<Owner> getAllOwners() {
        List<Owner> result = ownerRepository.findAll();
        return result;
    }

    @Override
    public Owner getOwnerWithAnimals(Long ownerid) {
        Owner n = new Owner();
        Owner owner = ownerRepository.findById(ownerid).orElse(n);
        List<Animal> animals = animalRepository.findAll();

        for(Animal animal : animals )
            if(animal.getOwnerId() == ownerid)
        {
            owner.setAnimals( owner.getAnimals() +animal.toString() );
        }

        return owner;
    }

    @Override
    public Owner addAnimal(Long ownerId, Long animalId) {
        return null;
    }

    @Override
    public void deleteOwner(Long ownerid) {

    }
}
