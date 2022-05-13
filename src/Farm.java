import java.util.Collections;
import java.util.List;

public class Farm {
    private List<SpecificAnimal> ourAnimals;

    public Farm(List<SpecificAnimal> animals){
        ourAnimals = animals;
    }

    public List<SpecificAnimal> getFarmEnimals(){
        return ourAnimals;
    }

}
