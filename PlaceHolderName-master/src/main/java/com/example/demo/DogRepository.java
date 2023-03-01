package com.example.demo;

import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
@Service
public class DogRepository {
    private List<Dog> dogs = new ArrayList<>();

    public DogRepository() {
        dogs.add(new Dog("Bruno", 7, "Brown", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 1, Breed.LABRADOR, "test.jpg", "The dog"));
        dogs.add(new Dog("Simba", 10, "Brown", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 2, Breed.LABRADOR, "test.jpg", "The dog"));
        dogs.add(new Dog("Tintin", 3, "Brown", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 3, Breed.LABRADOR, "test.jpg", "The dog"));
        dogs.add(new Dog("Freddie", 4, "Brown", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 4, Breed.LABRADOR, "test.jpg", "The dog"));
        dogs.add(new Dog("Charlie", 2, "Grey", AdoptionStatus.AVAILABLE, AgeCategory.PUPPY, 5, Breed.BORZOI, "test.jpg", "The dog"));
    }

    public Dog getDog(int id) {
        for (Dog d : dogs) {
            if (d.getId() == id) {
                return d;
            }
        }
        return null;
    }
    public List<Dog> getAllDogs() {

        return dogs;
    }

    public List<Dog> getPage(int page, int pageSize) {
        int from = Math.max(0,page*pageSize);
        int to = Math.min(dogs.size(),(page+1)*pageSize);

        return dogs.subList(from, to);
    }

    public int numberOfPages(int pageSize) {
        return (int)Math.ceil((double)dogs.size() / pageSize);
    }
}
