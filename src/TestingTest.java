import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class TestingTest {

    @Test
    public void twoCowsShouldProduce6litresOfMilk() {
        int resultingLiters = 6;
        SpecificAnimal cow = new SpecificAnimal(3, "liters");
        List<SpecificAnimal> animalList = new ArrayList<>();

        animalList.add(cow);
        animalList.add(cow);

        int tmpResult = 0;
        for (SpecificAnimal animal : animalList) {
            tmpResult += animal.produced();
        }
        assert resultingLiters == tmpResult;
    }

    @Test
    public void fiveChickensShouldProduce30Eggs() {
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

        assertEquals(ourFarm.getFarmEnimals().size(), 2);
    }

    @Test
    public void animalHasType() {
        SpecificAnimal chicken = new SpecificAnimal("chicken",6, "eggs");
        assertEquals(chicken.getType(), "chicken");
    }

    @Test
    public void thereAreAlsoAPigs() {
        SpecificAnimal chicken = new SpecificAnimal("chicken",6, "eggs");
        SpecificAnimal cow = new SpecificAnimal("cow",3, "liters");
        SpecificAnimal pig = new SpecificAnimal("pig",2, "kg");

        Farm ourFarm = new Farm(Arrays.asList(cow, chicken, pig));

        assertEquals(ourFarm.getFarmEnimals().size(), 3);
    }

    @Test
    public void sortedEnimalsMap() {
        SpecificAnimal chicken = new SpecificAnimal("chicken",6, "eggs");
        SpecificAnimal cow = new SpecificAnimal("cow",3, "liters");
        SpecificAnimal pig = new SpecificAnimal("pig",2, "kg");

        // in this case our farm has 1 cow, 1 chicken and one pig
        Farm ourFarm = new Farm(Arrays.asList(cow, chicken, pig));

        System.out.println(ourFarm.weeklyFarmProduction());
    }
}


