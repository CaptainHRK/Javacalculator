package com.harman.batch4;

import java.util.Scanner;

public class Calculator {



    public static void main(String[] args) {

        Calculator calc=new Calculator();//object creation
        Addition adCalc=new Addition();
        Subtraction subCalc=new Subtraction();

        Scanner input = new Scanner(System.in);
        int n1, n2, result1, result2;
        System.out.println("Enter n1= ");
        n1 = input.nextInt();
        System.out.println("Enter n2= ");
        n2 = input.nextInt();
        result1 = adCalc.AdditionOperation(n1,n2);
        result2 = subCalc.SubOperation(n1,n2);
        System.out.println(result1);
        System.out.println(result2);

}
