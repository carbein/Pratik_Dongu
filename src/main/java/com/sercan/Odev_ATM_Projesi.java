package com.sercan;

import java.util.Scanner;

public class Odev_ATM_Projesi {
    public static void main(String[] args) {
        String username,password;
        Scanner input = new Scanner(System.in);
        int right=3;
        double balance=1500;
        int select;
        while(right>0){
            System.out.println("Kullanıcı adınız : ");
            username = input.nextLine();
            System.out.println("Parolanız :");
            password = input.nextLine();
            if(username.equals("patika") && password.equals("dev123")){
                System.out.println("Merhaba, X Bankasına Hoşgeldiniz!");
                do {
                    System.out.println("Lütfen yapmak istediğiniz işlemi seçiniz: ");
                    System.out.println("1- Para Yatırma \n"+
                            "2- Para Çekme \n"+
                            "3- Bakiye Sorgula \n"+
                            "4- Çıkış Yap");
                    select = input.nextInt();
                    switch(select){
                        case 1:
                            System.out.println("Para miktarı : ");
                            int price = input.nextInt();
                            balance+=price;

                            break;
                        case 2:
                            System.out.println("Para miktarı :");
                            int price2 = input.nextInt();
                            if (price2>balance){
                                System.out.println("Bakiyeniz yetersiz.");
                            }else {
                                balance-=price2;

                            }
                            break;

                        case 3:
                            System.out.println("Toplam bakiyeniz : "+balance); break;
                        case 4:
                            System.out.println("Çıkış Yaptınız");break;
                        default:
                            System.out.println("Lütfen düzgün seçim yapınız."); break;
                    }

                }while  (select != 4);
                break;
            }else {
                right--;
                System.out.println("Hatalı kullanıcı adı ve şifre.Tekrar deneyiniz.");
                if (right==0){
                    System.out.println("Hesabınız bloke olmuştur lütfen banka ile iletişime geçiniz.");

                }else System.out.println("Kalan hakkınız : "+ right);

            }
        }


    }
}
