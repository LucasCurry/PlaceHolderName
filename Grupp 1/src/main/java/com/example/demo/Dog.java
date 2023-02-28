package com.example.demo;

public class Dog {
    private int age;
    private String name;
    private AdoptionStatus status;
    private AgeCategory ageCategory;
    private int id;
    private Breed breed;
    private String description;

    public Dog(int age, String name, AdoptionStatus status, AgeCategory ageCategory, int id, Breed breed) {
        this.age = age;
        this.name = name;
        this.status = status;
        this.ageCategory = ageCategory;
        this.id = id;
        this.breed = breed;
        this.description = "I am a dog, woof woof!";
    }


    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AdoptionStatus getStatus() {
        return status;
    }

    public void setStatus(AdoptionStatus status) {
        this.status = status;
    }

    public AgeCategory getAgeCategory() {
        return ageCategory;
    }

    public void setAgeCategory(AgeCategory ageCategory) {
        this.ageCategory = ageCategory;
    }

    public int getID() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Breed getBreed() {
        return breed;
    }

    public void setBreed(Breed breed) {
        this.breed = breed;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
