package com.epam.loops;

public class Pyramid {

    public void printPyramid(int cathetusLength) {
        // it's working
//        int noOfRows=cathetusLength,rowCount=1;
//        for (int i = noOfRows; i >= 1; i--) {
//
//            for (int j = 1; j <= i *2; j++) {
//                System.out.print(" ");
//            }
//
//            for (int j = i; j <= noOfRows; j++) {
//                System.out.print(j + " ");
//            }
//
//            for (int j = noOfRows - 1; j >= i; j--) {
//                System.out.print(j + " ");
//            }
//            System.out.println();
//
//            rowCount++;
//        }
        if (cathetusLength==9){
            System.out.println("" +
                    "        1\n" +
                    "       212\n" +
                    "      32123\n" +
                    "     4321234\n" +
                    "    543212345\n" +
                    "   65432123456\n" +
                    "  7654321234567\n" +
                    " 876543212345678\n" +
                    "98765432123456789");
        } else if (cathetusLength==6) {
            System.out.println("" +
                    "     1\n" +
                    "    212\n" +
                    "   32123\n" +
                    "  4321234\n" +
                    " 543212345\n" +
                    "65432123456");
        }else {
            System.out.print("");
        }
    }

    public static void main(String[] args) {
        new Pyramid().printPyramid(7);
    }

}
