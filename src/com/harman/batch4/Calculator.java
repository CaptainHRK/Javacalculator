package com.harman.batch4;

import java.util.Scanner;

public class Calculator {

    public int AdditionOperation(int x, int y)
    {
        int z=x+y;
                return z;
    }
    public static void main(String[] args) {

        Calculator calc=new Calculator();//object creation
        Scanner input = new Scanner(System.in);
        int n1, n2, result;
        System.out.println("Enter n1= ");
        n1 = input.nextInt();
        System.out.println("Enter n2= ");
        n2 = input.nextInt();
        result = n1 + n2;
        System.out.println(result);
    }
}
