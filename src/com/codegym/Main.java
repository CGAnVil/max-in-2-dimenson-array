package com.codegym;

public class Main {

    public static void main(String[] args) {
        int[][] array = {
                {1, 2, 3, 4},
                {5, 60, 2, 1},
                {3, 9, 8, 7},
        };
        int max = findMax(array);
        System.out.println(max);
    }
    public static int findMax (int[][] array){
        int max = array[0][0];
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }
        return max;
    }
}
