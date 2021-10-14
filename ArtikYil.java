package Odev5;
import java.util.Scanner;
public class ArtikYil {
    public static void main(String[] args) {
        int yil,remaining4,remaining100,remaining400;
        Scanner input=new Scanner(System.in);
        System.out.print("Yılı Giriniz:");
        yil =input.nextInt();

        remaining4=yil%4;
        remaining100=yil%100;
        remaining400=yil%400;


        if (remaining4==0) {
            if (remaining100 == 0) {

                if (remaining400 == 0) {

                    System.out.println(yil +  " bir artık yıldır.");
                } else {
                    System.out.println(yil +  " bir artık yıl değildir.");
                }
            } else {
                System.out.println(yil +  " bir artık yıldır.");
            }


        }
        else {
            System.out.println(yil +  " bir artık yıl değildir.");
        }
    }
}
