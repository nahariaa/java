package com.java.methods;

import java.util.Arrays;

/*
    Java supports call by reference or sharing of the reference between two methods,
    so if we modify the values in one method, modified values will reflect in the other
    method as well.
*/

public class ObjectPassingAsParams {
    public static void main(String[] args){
        int[] arr = new int[] {10, 20, 30, 40, 50};

        System.out.println("Array before method call: " + Arrays.toString(arr));

        //method call -> reference is shared instead of the values
        incrementArray(arr);

        //incremented values will be printed
        System.out.println("Array after method call: " + Arrays.toString(arr));
    }

    static void incrementArray(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            arr[i]++;   //increment array elements by 1
        }
    }
}



