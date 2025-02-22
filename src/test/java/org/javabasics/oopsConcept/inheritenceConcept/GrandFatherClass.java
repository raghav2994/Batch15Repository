package org.javabasics.oopsConcept.inheritenceConcept;

public class GrandFatherClass {

    public static void goldOfGrandFather(){
        System.out.println("Gold of Grand Father");
    }

    private static void diamondOfGrandFather(){
        System.out.println("Diamond of Grand Father");
    }

    public static void gold(){
        System.out.println("Gold of Grand Father");
    }

    public static void gold(String goldQuality){
        System.out.println("Gold of Grand Father" + goldQuality);
    }

    public static void main(String[] args){
         diamondOfGrandFather();
    }
}
