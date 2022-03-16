package com.harman.batch4;

public interface RBI {
    void setInterestRate();

}

class SBI implements RBI{
    public void setInterestRate() {
        System.out.println("7% intrest");
    }
}

class ICICI implements RBI{
    public void setInterestRate() {
        System.out.println("7.5% intrest");
    }
}

class Person{
    public static void main(String[] args) {
        RBI ob_Sbi=new SBI();
        RBI ob_Icici=new ICICI();
        System.out.println("SBI Bank == ");
        ob_Sbi.setInterestRate();
        System.out.println("ICICI Bank == ");
        ob_Icici.setInterestRate();


    }
}