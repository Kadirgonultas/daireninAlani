package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

    int r,merkazAci;
    double pi = 3.14;

    System.out.print("Yarıçapı Giriniz : ");
        r = input.nextInt();

        System.out.print("Merkez Açıyı Giriniz : ");
        merkazAci = input.nextInt();

        double alan  = (pi * (r*r) * merkazAci) / 360 ;
        System.out.print("Alan : " + alan);









    }
}
