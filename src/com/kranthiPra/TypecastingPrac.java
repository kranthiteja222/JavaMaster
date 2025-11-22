package com.kranthiPra;

public class TypecastingPrac {
    public static void main(String[] args) {
        System.out.println("trying to perform all action in type casting");
        int a = (int)(10.278f);
        System.out.println(a);

        float b= 10;
        System.out.println(b);// here no need to type cast

        byte c = (byte) 257;
        System.out.println(c);


    }
}
