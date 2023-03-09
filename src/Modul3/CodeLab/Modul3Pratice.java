package Modul3.CodeLab;

import java.util.Scanner;

public class Modul3Pratice {
    private double value;
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        Modul3Pratice main = new Modul3Pratice();

        System.out.println("Yard Converter to m, cm, feet & miles");
        System.out.println("1. Yard to M");
        System.out.println("2. Yard to CM");
        System.out.println("3. Yard to Feet");
        System.out.println("4. Yard to Miles");
        System.out.print("Pilih menu: ");
        int menu = input.nextInt();
        switch (menu) {
            case 1 -> {
                System.out.print("Masukkan Yard: ");
                main.setValue(input.nextDouble(), "m");
            }
            case 2 -> {
                System.out.print("Masukkan Yard: ");
                main.setValue(input.nextDouble(), "cm");
            }
            case 3 -> {
                System.out.print("Masukkan Yard: ");
                main.setValue(input.nextDouble(), "feet");
            }
            case 4 -> {
                System.out.print("Masukkan Yard: ");
                main.setValue(input.nextDouble(), "miles");
            }
        }
        System.out.print("Hasil konversi: " + main.getValue());
    }

    public double getValue() {
        return value;
    }

    public void setValue(double value, String params) {
        Converter conv = new Converter();
        switch (params) {
            case "m" -> this.value = conv.setValueToM(value);
            case "cm" -> this.value = conv.setValueToCM(value);
            case "feet" -> this.value = conv.setValueToFeet(value);
            case "miles" -> this.value = conv.setValueToMiles(value);
        }
    }
}
