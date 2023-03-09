package Modul2.CodeLab.com.modul2.codelab;

import Modul2.CodeLab.com.modul2.codelab.Aritmatics.Pembagian;
import Modul2.CodeLab.com.modul2.codelab.Aritmatics.Pengurangan;
import Modul2.CodeLab.com.modul2.codelab.Aritmatics.Penjumlahan;
import Modul2.CodeLab.com.modul2.codelab.Aritmatics.Perkalian;

public class Main {
    public static void main(String[] args) {

        Pembagian bagi = new Pembagian();
        Pengurangan kurang = new Pengurangan();
        Penjumlahan tambah = new Penjumlahan();
        Perkalian kali = new Perkalian();

        System.out.println(bagi.operation(10,5));
        System.out.println(kurang.operation(10, 20));
        System.out.println(tambah.operation(19, 89, 100));
        System.out.println(kali.operation(10, 90, 10));
    }
}
