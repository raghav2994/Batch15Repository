package org.javabasics.oopsConcept.abstractionConcept.interfaceConcept;

import org.javabasics.oopsConcept.abstractionConcept.AbstractClassExample;

public class InterfaceConceptClassFirst extends AbstractClassExample implements InterfaceFirst, InterfaceSecond{
    @Override
    public void methodOneOfInterface() {
        System.out.println("Method one interface by interface concept class first");
    }

    @Override
    public void methodOfInterfaceSecond() {
        System.out.println("Method of interface by interface concept class second");

    }

    @Override
    public void methodTwo() {

    }
}
