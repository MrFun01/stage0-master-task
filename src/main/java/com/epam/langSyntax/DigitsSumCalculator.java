package com.epam.langSyntax;

public class DigitsSumCalculator {

    public void calculateSum(int number) {
        int sum=0,digit;
        String s= String.valueOf(number);
        for (int i = 0; i <=s.length(); i++) {
            digit=number%10;
            sum+=digit;
            number=number/10;
        }
        System.out.println(sum);
    }

}
