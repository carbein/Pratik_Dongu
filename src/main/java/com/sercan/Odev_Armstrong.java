package com.sercan;

import java.util.Scanner;

public class Odev_Armstrong {
    public static void main(String[] args) {
        // basamaklari toplayan program 1525
        Scanner input = new Scanner(System.in);
        System.out.println("Bir sayi giriniz :");
        int sayi = input.nextInt();
        int toplam=0;
        while (sayi != 0) {
            toplam+=sayi%10;
            sayi=sayi/10;

        }

        System.out.println(toplam);
        input.close();
    }
}
