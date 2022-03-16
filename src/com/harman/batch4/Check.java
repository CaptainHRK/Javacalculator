package com.harman.batch4;

public class Check {
    public static void main(String[] args) {
        try {
            String name=null;
            System.out.println(name.length());

        }
        catch (NullPointerException e)
        {
            System.out.println(e);
            System.out.println("This is Null pointer Exception:)");
        }
    }
}
