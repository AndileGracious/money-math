package com.pluralsight;

import java.math.BigDecimal;

public class MoneyMath {
    public static void main(String[] args) {
        float floatValue = 0;
        double doubleValue = 0;
        BigDecimal bigValue = BigDecimal.ZERO;


        for (int i = 0; i<10 ; i++) {
            floatValue += 0.10f;
            doubleValue += 0.10;
            bigValue = bigValue.add(new BigDecimal("0.10"));
            System.out.println("float= " + floatValue + " " + " double= "+ doubleValue + " " + "BigDecimalValue= " + bigValue);

        }
        floatValue = 0.0f;
        doubleValue = 0;
        bigValue = BigDecimal.ZERO;
        for (int i = 0; i < 1000; i++) {
            floatValue += 19.99;
            doubleValue += 19.99;
            bigValue = bigValue.add(new BigDecimal("19.99"));
            System.out.println("float= " + floatValue + " " + "double= " + doubleValue + " " + "BigDecimalValue= " + bigValue);


        }
    }
    //  the values from float and double become less accurate as the list increases
    // the BigDecimal value remains correct throughout
}
