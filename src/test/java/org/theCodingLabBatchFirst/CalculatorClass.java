package org.theCodingLabBatchFirst;

import java.util.Scanner;

public class CalculatorClass {

    public static int additionOfTwoNumbers(int a, int b){
        int sum = a + b;
        return sum;
    }

    public static int subtractionOfThreeNumbers(int a , int b, int c){

        int sub = a-b-c;
        return sub;

    }

    public static void printingTheParameter(String param){
        System.out.println(param);
    }

    public static void main(String[] args){
     int sum =  additionOfTwoNumbers(10,20);
     System.out.println(additionOfTwoNumbers(20,30));


    }
}
