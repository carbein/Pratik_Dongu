package com.sercan;

import java.util.Scanner;

public class Odev_UsluSayi {
    public static void main(String[] args) {
        //3^4=3*3*3*3
        Scanner inp = new Scanner(System.in);
        System.out.println("Üssü alınacak sayi");
        int sayi = inp.nextInt();
        System.out.println("Üs olacak sayi");
        int toplam=1;
        int sayi1 = inp.nextInt();
        for (int i = 1; i <= sayi1; i++) {
            toplam*=sayi;
        }
        System.out.println(toplam);
    }
}
