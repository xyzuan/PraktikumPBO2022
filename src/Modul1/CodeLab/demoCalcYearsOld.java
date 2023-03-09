package Modul1.CodeLab;

import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.Scanner;

public class demoCalcYearsOld {

    private int yourBirthYear;
    public int getYourBirthYear() {
        return yourBirthYear;
    }

    public void setYourBirthYear(int yourBirthYear) {
        this.yourBirthYear = yourBirthYear;
    }

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        demoCalcYearsOld obj = new demoCalcYearsOld();
        Date date = new Date();
        LocalDate localDate = date.toInstant().atZone(ZoneId.systemDefault()).toLocalDate();

        System.out.print("Masukkan Tahun Kelahiran: ");
        obj.setYourBirthYear(in.nextInt());
        int thisYear = localDate.getYear();

        System.out.println("Umur anda: " + ( thisYear - obj.getYourBirthYear()));

    }
}
