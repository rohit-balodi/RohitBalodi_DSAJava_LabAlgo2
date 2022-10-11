package com.gl.paymoney;

import java.util.Scanner;

public class PayMoney {
    public static void main (String[] args) {

        PayMoneyTransaction transaction = new PayMoneyTransaction ();
        Scanner sc = new Scanner (System.in);
        int sizeofArray;

        System.out.println ("Please, enter the size of transaction array");
        sizeofArray = sc.nextInt ();

        System.out.println ("Please, enter the values of array");
        int[] array = new int[sizeofArray];
        for (int i = 0; i < sizeofArray; i++) {
            array[i] = sc.nextInt ();
        }

        System.out.println ("Please, enter the total no of targets that needs to be achieved");
        int target = sc.nextInt ();
        for (int i = 0; i < target; i++) {
            System.out.println ("Please, enter the value of target");
            int value = sc.nextInt ();
            transaction.isTargetAchieveable (value, array);
        }

    }
}