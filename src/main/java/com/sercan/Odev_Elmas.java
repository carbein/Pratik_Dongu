package com.sercan;

import java.util.Scanner;

public class Odev_Elmas {
    public static void main(String[] args) {

        int n=5;
        for (int i = 1; i <= n; i++) {
           for (int j = 1; j <= n-i; j++) {
               System.out.print(" ");
           }
           for (int k = 1; k <= (i); k++) {
               System.out.print(" *");
           }
            System.out.println();

        }
        for (int x = n-1; x>=1; x--) {
            for (int y = n-1; y>=x; y--) {
                System.out.print(" ");
            }
            for (int z=1 ; z<x+1; z++) {
                System.out.print( " *");
            }


            System.out.println();

        }



    }
}
