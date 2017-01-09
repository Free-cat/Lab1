package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("Введите количество точек");
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        int[] xcord = new int[n];
        int[] ycord = new int[n];
        for (int i=0; i<n; i++){
            System.out.println("Введите координату X" + (i+1));
            xcord[i] = in.nextInt();
            System.out.println("Введите координату Y" + (i+1));
            ycord[i] = in.nextInt();
        }
        int S = 0;
        for (int i = 0; i<n; i++){
            if (i == (n-1)){
                S += (xcord[i] * ycord[0]) - (xcord[0] * ycord[i]);
            }
            else {
                S += (xcord[i] * ycord[i+1]) - (xcord[i+1] * ycord[i]);
            }
        }
        System.out.println("Площадь: " + (Math.abs(S)/2));
    }
}
