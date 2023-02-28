package com.example.demo;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class DogRepository {
    List<Dog> dogs = new ArrayList<>();


    public void addDog (List<Dog> dogs) {
        dogs.add(new Dog("Bruno",7,  AdoptionStatus.AVAILABLE, AgeCategory.ADULT, 1, Breed.LABRADOR));
        dogs.add(new Dog("Glennart",13,  AdoptionStatus.URGENT, AgeCategory.SENIOR, 2, Breed.PITBULL));
        dogs.add(new Dog("Fido",3,  AdoptionStatus.RESERVED, AgeCategory.PUPPY,3, Breed.GOLDEN_RETREIVER));
        dogs.add(new Dog("Buster",10,  AdoptionStatus.AVAILABLE, AgeCategory.SENIOR, 4, Breed.STAFFORDSHIRE_TERRIER));
        dogs.add(new Dog("Gregory",6,  AdoptionStatus.URGENT, AgeCategory.ADULT, 5, Breed.MIXED));
        dogs.add(new Dog("GullePlutten",2,  AdoptionStatus.RESERVED, AgeCategory.PUPPY, 6, Breed.GREYHOUND));
        dogs.add(new Dog("Apple",11,  AdoptionStatus.AVAILABLE, AgeCategory.SENIOR, 7, Breed.LABRADOR));
        dogs.add(new Dog("Max",8,  AdoptionStatus.RESERVED, AgeCategory.ADULT, 8, Breed.MIXED));
        dogs.add(new Dog("Lucy",4,  AdoptionStatus.RESERVED, AgeCategory.PUPPY, 9, Breed.CHIHUAHUA));
        dogs.add(new Dog("Augustus",14,  AdoptionStatus.URGENT, AgeCategory.SENIOR, 10, Breed.MIXED));

    }





}
