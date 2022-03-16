package com.harman.batch4;

abstract class Petrolprice {

    abstract void changePrice(); //hide it from enduser
}

class Govt extends Petrolprice{
    void changePrice()
    {
        System.out.println("Increased by 2 %");

    }

    public static void main(String[] args) {
        Petrolprice price=new Govt();
        price.changePrice();
    }
}