package ro.ubb.core.service;

import org.springframework.beans.factory.annotation.Autowired;
import ro.ubb.core.model.Animal;
import ro.ubb.core.model.Owner;
import ro.ubb.core.repository.AnimalRepository;

import java.util.List;

public class AnimalServiceImpl implements AnimalService {
    @Autowired
    private AnimalRepository animalRepository;

    @Override
    public List<Animal> getAllAnimals() {
        List<Animal> result = animalRepository.findAll();
        return result;
    }

    @Override
    public List<Animal> getAnimalsByTypeAgeAndName(String type, int age, String name) {
        return null;
    }

    @Override
    public void addAnimal(Animal animal) {

    }

    @Override
    public List<Animal> topNAnimals(int n) {
        return null;
    }

    @Override
    public void deleteAnimal(Long animalId) {

    }
}
