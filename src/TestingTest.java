import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingTest {

    //hello!
//    @Test
//    public void failingTest() {
//        assertEquals(1,2);
//    }

    @Test
    public void twoCowsShouldProduce6litresOfMilk() {
//        assertEquals(1,2);
        int resultingLiters = 6;
        SpecificAnimal cow = new SpecificAnimal(3, "liters");
//        SpecificAnimal chicken = new SpecificAnimal(6);
        List<SpecificAnimal> animalList = new ArrayList<>();

        animalList.add(cow);
        animalList.add(cow);

        int tmpResult = 0;
        for (SpecificAnimal animal : animalList) {
            tmpResult += animal.produced();
        }
        assert resultingLiters == tmpResult;
//        Farm ourFarm = new Farm(animals);
//        resultingLiters = ourFarm.ourAnimals().each().produced();
    }

    @Test
    public void fiveChickensShouldProduce30Eggs() {
//        assertEquals(1,2);
        int resultingEggs = 30;
        int numberOfAnimals = 5;
        SpecificAnimal chicken = new SpecificAnimal(6, "eggs");
        List<SpecificAnimal> animalList = new ArrayList<>();


        for (int i =0; i < numberOfAnimals; i++) {
            animalList.add(chicken);
        }

        int tmpResult = 0;
        for (SpecificAnimal animal : animalList) {
            tmpResult += animal.produced();
        }
        assert resultingEggs == tmpResult;
//        Farm ourFarm = new Farm(animals);
//        resultingLiters = ourFarm.ourAnimals().each().produced();
    }

    @Test
    public void twoAnimalsOnTheFarm() {
        SpecificAnimal chicken = new SpecificAnimal(6, "eggs");
        SpecificAnimal cow = new SpecificAnimal(3, "liters");
        //Arrays.asList("Hello", "World!", "How", "Are", "You");
        Farm ourFarm = new Farm(Arrays.asList(cow, chicken));

        assert ourFarm.getFarmEnimals().size() == 2;
    }
}

