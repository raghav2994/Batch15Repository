package org.javabasics.basicConcept;

public class LoopConcept {

    public static void main(String[] args) {

       // forLoopExample();
        //forLoopExampleSecond(0,5);
        forLoopExampleThird();
    }

    public static void forLoopExample(){
        for (int i = 0; i <= 10; i++) {
            System.out.print(i);
        }
    }

    public static void forLoopExampleSecond(int startPoint, int endPoint){
        for (int i = startPoint; i <= endPoint; i++) {
            for(int j = i; j <= endPoint; j++) {
                for(int k = j; k <= endPoint; k++) {
                    System.out.print(0);
                }
            }
        }
    }


    public static void forLoopExampleThird(){
        for (int i = 0; i <= 3; i++) {
            for(int j = 1; j <= 3; j++) {
                for(int k = 2; k <= 3; k++) {
                    System.out.print(" "+ i + " " + j + " " + k);
                }
            }
        }
    }

    public static class ArrayConcept {

        public static void main(String[] args){

            twoDArray();
        }

        public static void oneDArray(){
            int[] a = new int[3];
            a[0] = 1;
            a[1] = 4;
            a[2] = 9;
            for(int i = 0; i< a.length; i++ ){
                System.out.println(a[i]);
            }
        }

        public static void twoDArray(){

            String[][] s = new String[2][3];
            s[0][0] = "S00";
            s[0][1] = "S01";
            s[0][2] = "S02";
            s[1][0] = "S10";
            s[1][1] = "S11";
            s[1][2] = "S12";

            for(int row = 0; row < 2; row++){
                for(int col = 0; col< 3; col++){
                    System.out.println(s[row][col]);
                }
            }

        }
    }
}
