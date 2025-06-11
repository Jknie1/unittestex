package tests;

import org.junit.jupiter.api.*;
import animals.AnimalType;
import animals.petstore.pet.attributes.Breed;
import animals.petstore.pet.attributes.Gender;
import animals.petstore.pet.attributes.Skin;
import animals.petstore.pet.types.Snake;

import static org.junit.jupiter.api.Assertions.assertEquals;

@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class SnakeTests {

    private static Snake actualSnake;

    @BeforeAll
    public static void createAnimals()
    {
        actualSnake = new Snake(AnimalType.DOMESTIC, Skin.SCALES, Gender.UNKNOWN, Breed.UNKNOWN);
    }

    @Test
    @Order(1)
    @DisplayName("Animal Test Type Tests Domestic")
    public void animalTypeTests()
    {
        assertEquals(AnimalType.DOMESTIC, actualSnake.getAnimalType(), "Animal Type Expected[" + AnimalType.DOMESTIC
                + "] Actual[" + actualSnake.getAnimalType() + "]");
    }

    @Test
    @Order(1)
    @DisplayName("Snake Speak Hiss Tests")
    public void snakeGoesHissTest()
    {
        assertEquals("The snake goes hiss! hiss!", actualSnake.speak(), "I was expecting hiss! hiss!");
    }

//    @Test
//    @Order(1)
//    @DisplayName("Snake Fur is it Hypoallergenic")
//    public void snakeHypoallergenicTests()
//    {
//        assertEquals("The snake is not hyperallergetic!", actualSnake.snakeHypoallergenic(),
//                "The snake is not hyperallergetic!");
//    }

    @Test
    @Order(1)
    @DisplayName("Snake has legs Test")
    public void legTests()
    {
        Assertions.assertNotNull(actualSnake.getNumberOfLegs());
    }

    @Test
    @Order(2)
    @DisplayName("Snake Gender Test Male")
    public void genderTestMale()
    {
        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN, Gender.MALE, Breed.UNKNOWN);
        assertEquals(Gender.MALE, actualSnake.getGender(), "Expecting Male Gender!");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Breed Test Grass")
    public void snakeBreedTest() {
        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN, Gender.FEMALE, Breed.GRASS);
        assertEquals(Breed.GRASS, actualSnake.getBreed(), "Expecting Breed Maltese!");
    }

    @Test
    @Order(2)
    @DisplayName("Snake Speak Rattle Tests")
    public void snakeGoesRattleTest()
    {
        actualSnake = new Snake(AnimalType.WILD, Skin.UNKNOWN, Gender.UNKNOWN, Breed.UNKNOWN);
        assertEquals("The snake goes rattle! rattle!", actualSnake.speak(), "I was expecting rattle");
    }
//
//    @Test
//    @Order(2)
//    @DisplayName("Snake Speak Bark Tests 1")
//    public void snakeGoesBarkTest()
//    {
//        actualSnake = new Snake(AnimalType.UNKNOWN, Skin.UNKNOWN, Gender.UNKNOWN, Breed.UNKNOWN);
//        assertEquals("The snake goes Bark! Bark!", actualSnake.speak(), "I was expecting bark");
//    }
}
