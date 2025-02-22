package org.javabasics.basicConcept;

public class FirstProgram {

    public static void main(String[] args) {
//        PrintingHelloWorld();
        //PrintWhateverISay("Akshata");
        String valueComingFromMethod = PrintWhateverISay("Rahul");
        System.out.println(valueComingFromMethod);
    }

    public static void PrintingHelloWorld() {
        System.out.println("Hello World");
    }

    public static String PrintWhateverISay(String printValue){
        System.out.println(printValue);
        return "Raghav";
    }
}
