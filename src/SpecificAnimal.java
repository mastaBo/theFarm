
class SpecificAnimal implements Animals{

    private int itemsProduced = 0;
    private String itemName;
    private String type;

    @Override
    public int produced() {
        return itemsProduced;
    }

    public SpecificAnimal(int production, String nameOfTheItem) {
        this.itemsProduced = production;
        this.itemName = nameOfTheItem;
    }

    public SpecificAnimal(String type, int production, String nameOfTheItem) {
        this.itemsProduced = production;
        this.itemName = nameOfTheItem;
        this.type = type;
    }

    public String getType(){
        return type;
    }

    public String getItemName() {
        return itemName;
    }
}