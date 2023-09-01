package org.example;

public class Plate {
    private int food;


    public int getFood() {
        return food;
    }

    public void setFood(int food) {
        this.food = food;
    }

//    public Plate(int food) {
//        this.food = food;
//    }
    public void info() {
        System.out.println("plate: " + food);
    }

    public void plateDecrease(int appetite) {
        food = food - appetite;
    }

    public void plateIncrease(int add){
        food = food + add;
    }

  }
