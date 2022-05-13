import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Farm {
    private List<SpecificAnimal> ourAnimals;

    public Farm(List<SpecificAnimal> animals){
        ourAnimals = animals;
    }

    public List<SpecificAnimal> getFarmEnimals(){
        return ourAnimals;
    }

    public String weeklyFarmProduction(){
        HashMap<String, Integer> animalsProductionMap = new HashMap<String, Integer>();
        for (SpecificAnimal animal : ourAnimals) {
            if(animalsProductionMap != null) {
                Integer theValue = animalsProductionMap.get(animal.getType());
                if (theValue != null) {
                    theValue += animal.produced();
                    animalsProductionMap.put(animal.getType(), theValue);
                }
                else {
                    animalsProductionMap.put(animal.getType(), animal.produced());
                }
            }
            else {
                animalsProductionMap.put(animal.getType(), animal.produced());
            }
        }
        StringBuffer outputBuffer = new StringBuffer();
        for (Map.Entry<String, Integer> set :
                animalsProductionMap.entrySet()) {
            outputBuffer.append(set.getKey() + " = " + set.getValue() + "; ");
        }
        return outputBuffer.toString();
    }

}
