package org.javabasics.basicConcept;

public class Student {

    public Student(){
        System.out.println("I am Student Constructor");
    }

    public Student(int age){
        System.out.println("I am Student Constructor which has age of 20 years");
    }

    public void studentDetail(String name, int age){

        System.out.println("Name:" + name);
        System.out.println("Age:" + age);


    }
}
