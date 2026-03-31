package org.petsfactory;

public class DogFactory implements PetFactory {
    public Pet createPet() {
        return new Dog();
    }
    public PetFood createPetFood() {
        return new DogFood();
    }
}
