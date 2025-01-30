package org.example;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        // example2();
        boolean[] array = new boolean[] {true, true, false};
        System.out.println(xor(array));
    }

    public static boolean xor(boolean[] array) {
        boolean total = false;
        int count = 0;
        while(count < array.length) {
            total = total != array[count];
            count++;
        }
        return total;
    }

    public static boolean xor(boolean p, boolean q) {
        if(p && q) {
            return false;
        } else if(p && !q) {
            //....
        }
        return true;
    }

    public static boolean xor2(boolean[] array) {
        int countT = 0;
        int countF = 0;
        for(int i = 0; i < array.length; i++) {
            if(array[i]) {
                countT++;
            } else {
                countF++;
            }
        }
        return countT > countF;

        // p ? a : (p ? a : c);
    }

    public static int identity(int a) {
        return a;
    }

    public static void example() {
        do {
            System.out.println("hola");
        } while(Math.random() > 0.5);

        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
    }

    public static boolean p() {
        return Math.random() > 0.5;
    }

    public static void fib() {
        int f0 = 0;
        int f1 = 1;
        System.out.println(f0);
        System.out.println(f1);
        for(int i = 0; i < 100; i++) {
            int aux = f0;
            f0 = f1;
            f1 = aux + f1;
            System.out.println(f0 + f1);
        }
        for(int i = 0; i < 100; i++) {
            int aux = f0;
            f0 = f1;
            f1 = aux + f1;
            System.out.println(f0 + f1);
        }
    }

    public static void example2() {

        int[][] matrix = new int[3][3];
        for(int i = 0; i < matrix.length; i++) {
            for(int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = i*3 + j + 1;
                System.out.print(matrix[i][j] + "\t\t");
            }
            System.out.println();
        }

    }



}
