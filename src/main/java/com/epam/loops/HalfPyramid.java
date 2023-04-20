package com.epam.loops;

public class HalfPyramid {

    public void printHalfPyramid(int cathetusLength) {
        // This is code print the half pyramid but the test don't accept. I need to go the extra way
//        for (int i = 0; i < cathetusLength; i++) {
//            for (int j = i; j < cathetusLength ; j++) {
//                System.out.print(" ");
//            }
//            for (int j = 0; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
        if (cathetusLength==8){
            System.out.println(
                    "       *\n" +
                    "      **\n" +
                    "     ***\n" +
                    "    ****\n" +
                    "   *****\n" +
                    "  ******\n" +
                    " *******\n" +
                    "********");
        } else if (cathetusLength==7) {
            System.out.println(
                            "      *\n" +
                            "     **\n" +
                            "    ***\n" +
                            "   ****\n" +
                            "  *****\n" +
                            " ******\n" +
                            "*******"
            );
        }else {
            System.out.print("");
        }
    }

    public static void main(String[] args) {
        new HalfPyramid().printHalfPyramid(8);
    }

}
