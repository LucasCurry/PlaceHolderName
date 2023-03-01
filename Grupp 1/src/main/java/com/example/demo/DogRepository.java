package com.example.demo;

import org.springframework.stereotype.Service;


import java.util.ArrayList;
import java.util.List;

@Service
public class DogRepository {
    List<Dog> dogs = new ArrayList<>();


    public DogRepository() {
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
        dogs.add(new Dog("Mats",14,  AdoptionStatus.URGENT, AgeCategory.SENIOR, 11, Breed.MIXED));
        dogs.add(new Dog("Lily",14,  AdoptionStatus.URGENT, AgeCategory.SENIOR, 12, Breed.PITBULL));
        dogs.add(new Dog("Gösta",14,  AdoptionStatus.URGENT, AgeCategory.SENIOR, 13, Breed.MIXED));
        dogs.add(new Dog("Katus",14,  AdoptionStatus.URGENT, AgeCategory.SENIOR, 14, Breed.MIXED));
        dogs.add(new Dog("Lillen",14,  AdoptionStatus.URGENT, AgeCategory.SENIOR, 15, Breed.MIXED));
        dogs.add(new Dog("Musse",14,  AdoptionStatus.URGENT, AgeCategory.SENIOR, 16, Breed.MIXED));
        dogs.add(new Dog("Knekten",14,  AdoptionStatus.URGENT, AgeCategory.SENIOR, 17, Breed.MIXED));
        dogs.add(new Dog("Zlatan",14,  AdoptionStatus.URGENT, AgeCategory.SENIOR, 18, Breed.MIXED));
        dogs.add(new Dog("Hoppsan",14,  AdoptionStatus.URGENT, AgeCategory.SENIOR, 19, Breed.MIXED));
        dogs.add(new Dog("Mimmi",14,  AdoptionStatus.URGENT, AgeCategory.SENIOR, 20, Breed.MIXED));

    }

    public Dog getDog(int id) {
        for (Dog d : dogs) {
            if (d.getId() == id) {
                return d;
            }
        }
        return null;
    }

    public List<Dog> getDogs() {
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
