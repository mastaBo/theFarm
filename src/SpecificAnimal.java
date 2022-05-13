import java.util.ArrayList;
import java.util.List;

class SpecificAnimal implements Animals{

    private int itemsProduced = 0;
    private String itemName;

    @Override
    public int produced() {
        return itemsProduced;
    }

//    public List<SpecificAnimal> SpecificAnimal(int items) {
//        ArrayList<SpecificAnimal> result = new ArrayList<SpecificAnimal>();
//        int i=0;
//        while (i < items){
//            result.add(new SpecificAnimal());
//            i++;
//        }
//        return result;
//    }

    public SpecificAnimal(int production, String nameOfTheItem) {
        itemsProduced = production;
        itemName = nameOfTheItem;
    }
}