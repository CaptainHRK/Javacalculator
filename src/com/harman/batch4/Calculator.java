package com.harman.batch4;

import javax.management.ObjectName;
import java.util.Objects;
import java.util.Scanner;

public class Calculator extends Parent {


    public static void main(String[] args) {

        Calculator ob= new Calculator();//object creation

        Scanner input = new Scanner(System.in);
        int n1, n2, result1, result2;
        System.out.println("Enter n1= ");
        n1 = input.nextInt();
        System.out.println("Enter n2= ");
        n2 = input.nextInt();
        result1 = ob.AddOperation(n1, n2);
        result2 = ob.SubOperation(n1, n2);
        System.out.println(result1);
        System.out.println(result2);
    }
}
