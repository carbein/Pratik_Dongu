package com.sercan;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Odev_Faktoriyel {
    public static void main(String[] args) {
        //C(n,r) = n! / (r! * (n-r)!)
            Scanner input = new Scanner(System.in);
            System.out.println("n sayısını giriniz: ");
            System.out.println("r sayısnını giriniz(n'den küçük olacak):");
            int n = input.nextInt();
            int r=input.nextInt();

            int rfaktoriyel=1,nfaktoriyel=1,nrfaktoriyel=1;

            for (int i = 1; i <= n; i++) {
                nfaktoriyel*=i;
                if (i<=r){
                    rfaktoriyel*=i;
                }
                if (i<=(n-r)){
                    nrfaktoriyel*=i;
                }
            }
            long  kombinasyon=nfaktoriyel/(rfaktoriyel*nrfaktoriyel);
        System.out.println(kombinasyon);


    }
}
