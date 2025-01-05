package com.sercan;

import javax.swing.plaf.metal.MetalComboBoxButton;
import java.util.Scanner;

public class Odev_EBOB_EKOK {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("n1 sayısını giriniz : ");
        int n1 = sc.nextInt();
        System.out.println("n2 sayısını giriniz : ");
        int n2 = sc.nextInt();
        int enk=Math.min(n1,n2);
        int ebob = 1;
        while(enk>0){
            if (n1%enk==0 && n2%enk==0){
                ebob=enk;
                break;
            }
            enk--;
            
        }
        System.out.println(ebob);
        int ekok=(n1*n2)/ebob;
        System.out.println(ekok);
    }
}
