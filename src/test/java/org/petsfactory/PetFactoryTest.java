package org.petsfactory;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class PetFactoryTest {
    @Test
    public void testDogFactory() {
        PetFactory factory = new DogFactory();
        PetClient client = new PetClient(factory);
        Assertions.assertEquals("Au Au", client.getPetSound());
        Assertions.assertEquals("Ração de cachorro", client.getPetFoodType());
    }

    @Test
    public void testCatFactory() {
        PetFactory factory = new CatFactory();
        PetClient client = new PetClient(factory);
        Assertions.assertEquals("Miau", client.getPetSound());
        Assertions.assertEquals("Ração de gato", client.getPetFoodType());
    }
}

