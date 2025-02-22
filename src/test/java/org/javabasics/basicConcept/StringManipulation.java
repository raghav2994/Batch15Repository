package org.javabasics.basicConcept;

public class StringManipulation {


    public static void main(String[] args){

        System.out.println(replaceString("Nike react infinity run flyknit"));

    }

    public static String replaceString(String productName){

        String oldString = "//div[@class ='listing-tem']//a/span[text()='Annu']";
        String newString = oldString.replace("Annu", productName);
        return newString;
    }
}
