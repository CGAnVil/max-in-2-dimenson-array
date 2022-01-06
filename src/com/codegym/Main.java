package com.codegym;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
//        int[][] array = {
//                {1, 2, 3, 4},
//                {5, 60, 2, 1},
//                {3, 9, 8, 7},
//        };
//        int max = findMax(array);
//        System.out.println(max);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows:");
        int row = sc.nextInt();
        System.out.println("Enter colum:");
        int colum = sc.nextInt();
        int[][] array = new int[row][colum];
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < colum; j++) {
                System.out.println("Enter element in row: " + (i + 1) + " colum:" + (j + 1));
                array[i][j] = sc.nextInt();
            }

        }
//        int max = findMax(array);
//        System.out.println("Max value in array: " + max);
        showArray(array);
//        int totalColum = totalColum(array, 1);
//        System.out.println(totalColum);

        int totalCross = totalCrossLine(array);
        System.out.println(totalCross);
    }

    public static void showArray(int[][] array) {
        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + "\t");
            }
            System.out.println("");
        }
    }

    public static int findMax(int[][] array) {
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

    public static int totalColum(int[][] array, int colum) {
        int totalColum = 0;
        for (int i = 0; i < array.length; i++) {
            totalColum += array[i][colum];
        }
        return totalColum;
    }

    public static int totalCrossLine (int [][] array){
        int totalCross = 0;
        for (int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++){
                if(i == j){
                    totalCross+= array[i][j];
                }
            }

        }
        return totalCross;
    }
}
