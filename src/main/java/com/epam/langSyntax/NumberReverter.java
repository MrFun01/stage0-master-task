package com.epam.langSyntax;

public class NumberReverter {

    public void revert(int number) {
        int reversed=0; //459
        while (number!=0){
            int remain=number%10; // 1 step 9 // 2 step remain =5 // step 3 remain =0 // out of loop
            reversed=reversed*10+remain; // revers=9 // reversed =90 +5 =95 // reverse = 950 +4=954
            number=number/10; // 1 step num=45 // 2 step num=4 // 3 step num=0
        }
        System.out.println(reversed);
    }

}
