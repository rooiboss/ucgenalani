package ödev;

import java.util.Scanner;

public class dikucgenpisagor {
    public static void main(String[] args) {
        long a , b , c, sonuc, u ;
        Scanner girdi = new Scanner(System.in);
        System.out.print("1. Kenarı Giriniz :");
        a = girdi.nextLong();
        System.out.print("2. Kenarı Giriniz :");
        b = girdi.nextLong();
        System.out.print("3. Kenarı Giriniz :");
        c = girdi.nextLong();
        u= (a+b+c)/2;
        sonuc= (long) Math.abs(Math.sqrt(u*(u-a)*(u-b)*(u-c)));
        System.out.println("Alan:"+ sonuc);
        System.out.println(u);




    }
}
