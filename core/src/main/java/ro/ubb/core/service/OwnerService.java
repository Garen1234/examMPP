package ro.ubb.core.service;

import ro.ubb.core.model.Owner;

import java.util.List;

public interface OwnerService  {

    List<Owner> getAllOwners();
    Owner getOwnerWithAnimals(Long ownerid);
    Owner addAnimal(Long ownerId , Long animalId);
    void deleteOwner(Long ownerid);
}
