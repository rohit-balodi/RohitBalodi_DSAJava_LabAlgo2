package com.gl.denominationmoney;

public class DenominationTransaction {

    public void noOfNotes (int[] array, int amount) {
        int[] result = new int[array.length];
        for (int i = 0; i < array.length; i++) {
            if (array[i] <= amount) {
                result[i] = amount / array[i];
                amount = amount % array[i];
            }
        }
            if (amount > 0) {
                System.out.println ("Amount cannot be made with Denomination");
            }
            else {
                System.out.println ("Your payment approach in order to give min no of notes will be");
                for (int i = 0; i < result.length; i++) {
                    if (result[i]!=0) {
                        System.out.println (array[i] + ":" + result[i]);
                    }
                }
            }
        }

    public void bubbleSort (int[] array) {
        for (int i = 0; i < array.length - 1; i++) { // n-1
            for (int j = 0; j < array.length - i - 1; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }
}