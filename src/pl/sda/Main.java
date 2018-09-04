//
//1. Wczytajcie PESEL, proszę Was, abyście na podstawie PESELu
// (bierzemy pod uwagę tylko PESELe przed rokiem 2000) wyznaczyli datę urodzenia,
// a następnie określili wiek właściciela PESELu
package pl.sda;

import java.util.Scanner;
import java.util.Calendar;

public class Main {

    public static void main(String[] args) {
        System.out.println("Podaj PESEL: ");
        Scanner scanner = new Scanner(System.in);
        String pesel = scanner.nextLine();
        if (pesel.length() > 11) {
            System.out.println("PESEL nieprawidlowy!!!");
        } else {
            String birthYearStr = pesel.substring(0, 2); //wycinanie 2 pierwszych cyfr
            int birthYear = 1900 + Integer.parseInt(birthYearStr) ;
            System.out.println("Data urodzenia: " + birthYear);
            int year = Calendar.getInstance().get(Calendar.YEAR); // pobieranie aktualnego roku
            int age = year - birthYear; // obl. wieku
            System.out.println("Wiek wlasciciela PESELu: " + age);

             }
    }
}