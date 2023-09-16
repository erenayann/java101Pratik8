package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int matnot,fiziknot,turkcenot,kimyanot,muziknot;
        System.out.print("Matematik Notunuz:");
        matnot=input.nextInt();
        System.out.print("Fizik Notunuz:");
        fiziknot=input.nextInt();
        System.out.print("Türkçe Notunuz:");
        turkcenot=input.nextInt();
        System.out.print("Kimya Notunuz:");
        kimyanot=input.nextInt();
        System.out.print("Müzik Notunuz:");
        muziknot=input.nextInt();

        double average=(matnot+fiziknot+turkcenot+kimyanot+muziknot)/5;
        if (average < 55){
            System.out.println("-Sınıfta Kaldınız-");
        }else{
            System.out.println("-Sınıfı Geçtiniz-");
        }
        System.out.println("Ortalamanız: " + average);

    }
}
