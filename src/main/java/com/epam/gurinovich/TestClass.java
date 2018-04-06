package com.epam.gurinovich;

/**
 * Created by Maksim_Hurinovich on 4/6/2018.
 */
public class TestClass {

    private static float calculateSum(float a, float b){
        return a+b;
    }

    private static float calculateDiff(float a, float b){
        return b-a;
    }

    public static void main(String[] args){
        System.out.println(calculateSum(24.2f, 'c'));
        System.out.print(calculateDiff('@', 024.5f));
    }
}
