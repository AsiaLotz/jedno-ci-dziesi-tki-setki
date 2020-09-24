package com.company;
import java.util.Scanner;

public class jds {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Podaj liczbę trzy cyfrową");
        String liczba= scan.nextLine();
        int l=Integer.valueOf(liczba);
        System.out.println("Twoja liczba to   " + l);

        int setki=l%1000;
        int dziesiatki=l%100;
        int jednosci=l%10;

        System.out.println("Liczba setek to   " +( setki-dziesiatki)/100);
        System.out.println("Liczba dziesiątek to   " + (dziesiatki-jednosci)/10);
        System.out.println("Liczba jedności to   " + jednosci);
    }
}
