package com.gl.denominationmoney;

import java.util.Scanner;

public class DenominationMoney {
    public static void main (String[] args) {

        DenominationTransaction transaction = new DenominationTransaction ();
        Scanner sc = new Scanner (System.in);
        int numOfDenomination;

        System.out.println ("Please, enter the size of currency denominations");
        numOfDenomination = sc.nextInt ();

        System.out.println ("Please, enter the currency denominations value");
        int valueOfDenomination;
        int[] array = new int[numOfDenomination];
        for (int i = 0; i < numOfDenomination; i++) {
            array[i] = sc.nextInt ();
        }

        System.out.println ("Please, enter the amount you want to pay");
        int amount = sc.nextInt ();
        transaction.bubbleSort (array);
        transaction.noOfNotes (array, amount);
    }
}
