package org.example;

public class Cat {
    private String name;

    private int appetite;

    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    public void setSatiety(boolean satiety) {
        this.satiety = satiety;
    }

    public boolean satiety;

    public int getAppetite() {
        return appetite;
    }

    public Cat(String name, int appetite){
        this(name, appetite, false);
    }
    public Cat(String name, int appetite, boolean satiety) {
        this.name = name;
        this.appetite = appetite;
        this.satiety = satiety;
    }


    public void eat(Plate plate) {
        plate.plateDecrease(getAppetite());
        setSatiety(true);
    }

    public String printCat(){
        String message;
        if (isSatiety() == false){
            message = " голоден";
        }
        else {
            message = " съел " + appetite;
        }
        return (name + message);
    }

}
