package com.example.demo;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class DogRepository {

    List<Dog> dogs = new ArrayList<>();


    public void addDog (List<Dog> dogs) {
        dogs.add(new Dog(7, "Bruno", AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 1, Breed.LABRADOR));
        dogs.add(new Dog(13, "Glennart", AdoptionStatus.URGENT, AgeCategory.SENIOR, 2, Breed.PITBULL));
        dogs.add(new Dog(3, "Fido", AdoptionStatus.RESERVED, AgeCategory.PUPPY,3, Breed.GOLDEN_RETREIVER));
        dogs.add(new Dog(10, "Buster", AdoptionStatus.AVAILABLE, AgeCategory.SENIOR, 4, Breed.STAFFORDSHIRE_TERRIER));
        dogs.add(new Dog(6, "Gregory", AdoptionStatus.URGENT, AgeCategory.ADULT, 5, Breed.MIXED));
        dogs.add(new Dog(2, "GullePlutten", AdoptionStatus.RESERVED, AgeCategory.PUPPY, 6, Breed.GREYHOUND));
        dogs.add(new Dog(11, "Apple", AdoptionStatus.AVAILABLE, AgeCategory.SENIOR, 7, Breed.LABRADOR));
        dogs.add(new Dog(8, "Max", AdoptionStatus.RESERVED, AgeCategory.ADULT, 8, Breed.MIXED));
        dogs.add(new Dog(4, "Lucy", AdoptionStatus.RESERVED, AgeCategory.PUPPY, 9, Breed.CHIHUAHUA));
        dogs.add(new Dog(14, "Augustus", AdoptionStatus.URGENT, AgeCategory.SENIOR, 10, Breed.MIXED));

    }





}
