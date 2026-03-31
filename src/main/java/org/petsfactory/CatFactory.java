package org.petsfactory;

public class CatFactory implements PetFactory {
    public Pet createPet() {
        return new Cat();
    }
    public PetFood createPetFood() {
        return new CatFood();
    }
}
