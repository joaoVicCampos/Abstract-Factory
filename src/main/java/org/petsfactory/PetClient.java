package org.petsfactory;

public class PetClient {
    private Pet pet;
    private PetFood food;

    public PetClient(PetFactory factory) {
        pet = factory.createPet();
        food = factory.createPetFood();
    }

    public String getPetSound() {
        return pet.makeSound();
    }

    public String getPetFoodType() {
        return food.getType();
    }
}
