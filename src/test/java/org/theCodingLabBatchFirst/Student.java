package org.theCodingLabBatchFirst;

public class Student {

    Student(){
        System.out.println("Constructor");
    }

    Student(int age){
        System.out.println(age);
    }

    Student(String name){
        System.out.println(name);
    }

    public static void setRollNumberAndName(String name, int roll_num){
        String nameOfTheStudent = name;
        int rollNumberOfTheStudent = roll_num;
        System.out.println(nameOfTheStudent);
        System.out.println(rollNumberOfTheStudent);
    }

    public static void  main(String[] args){

        Student rohan = new Student();

//        rohan.setRollNumberAndName("Rohan", 1);

        Student mohan = new Student(2);
//        mohan.setRollNumberAndName("Mohan", 2);

        Student chin = new Student("Raghav");

    }

}
