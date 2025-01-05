package com.sercan;

import java.util.Scanner;

public class Odev_Harmonik {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Harmonik :");
        int harmonik = input.nextInt();
        double toplam=0.0;
        for (double i = 1; i <= harmonik; i++) {
            toplam+=(1/i);
        }
        System.out.println(toplam);
    }
}
