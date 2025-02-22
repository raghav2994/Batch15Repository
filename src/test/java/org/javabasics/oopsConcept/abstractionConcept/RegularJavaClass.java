package org.javabasics.oopsConcept.abstractionConcept;

public class RegularJavaClass extends AbstractClassExample{

    @Override
    public void methodTwo() {
        System.out.println("Implementation done by RegularJavaClass");
    }

    public static void main(String[] args){

        RegularJavaClass j1 = new RegularJavaClass();
        j1.methodTwo();
        j1.methodOne();

        RegularJavaSecondClass j2 = new RegularJavaSecondClass();
        j2.methodTwo();
        j2.methodOne();

    }
}

