package com.example.demo;

import java.util.ArrayList;
import java.util.List;

public class DogRepository {
    private List<Dog> dogs = new ArrayList<>();

    public DogRepository() {
        dogs.add(new Dog("Bruno", 7, "Brown", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 1, Breed.LABRADOR, "test.jpg"));
        dogs.add(new Dog("Simba", 10, "Brown", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 1, Breed.LABRADOR, "test.jpg"));
        dogs.add(new Dog("Tintin", 3, "Brown", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 1, Breed.LABRADOR, "test.jpg"));
        dogs.add(new Dog("Freddie", 4, "Brown", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 1, Breed.LABRADOR, "test.jpg"));
    }

    public List<Dog> getAllDogs() {

        return dogs;
    }
}
