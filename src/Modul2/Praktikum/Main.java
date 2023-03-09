/*
 * Copyright (C) 2022 xyzuan ( Jody Yuantoro )
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package Modul2.Praktikum;

import Modul2.Praktikum.Bangun2D.*;
import Modul2.Praktikum.Bangun3D.*;

import java.util.Scanner;

/* 2D & 3D Chill Class
   Including 2D : Persegi, Persegi Panjang, Belah Ketupat, Jajar Genjang
                  Lingkaran, Segitiga.
   Including 3D : Kubus, Balok, Tabung, Bola.
*/

public class Main {
    private final Scanner in = new Scanner(System.in);
    private String isBangun;
    protected boolean isDebug = true;
    private char backMenu;
    private int pilihMenu;
    public static void main(String[] args) {
        Main obj = new Main();
        obj.MainMenu();
    }

    private void MainMenu(){
        Main obj = new Main();
        System.out.println("""
            =========================================================
            Selamat Datang di Aplikasi LKV
            Menghitung Luas Keliling Volume Akan Menjadi Mudah
            =========================================================""");
        System.out.println("1. Menghitung Bangun 2 Dimensi\n2. Menghitung Bangun 3 Dimensi\n0. Keluar");
        System.out.print("Pilih menu : ");
        pilihMenu = in.nextInt();
        if (pilihMenu == 1){
            obj.hitung2D();
        } else if (pilihMenu == 2){
            obj.hitung3D();
        } else {
            System.exit(0);
        }
    }

    private void hitung2D(){
        do {
            System.out.println("Aplikasi Penghitung Luas & Keliling Bangun Datar");
            System.out.println("1. Persegi\n2. Persegi Panjang\n3. Segitiga\n4. Lingkaran\n5. Jajar Genjang\n6. Belah Ketupat\n0. Kembali");
            System.out.print("Pilih menu : ");
            pilihMenu = in.nextInt();
            switch (pilihMenu) {
                case 1 -> { isBangun = "Persegi";
                    Persegi psg = new Persegi();
                    psg.inputData("Sisi");
                    psg.infoBangun(isBangun, "Sisi");
                    psg.hitungKeliling(isBangun); psg.hitungLuas(isBangun);
                }
                case 2 -> { isBangun = "Persegi Panjang";
                    PersegiPanjang psgp = new PersegiPanjang();
                    psgp.inputData("Panjang"); psgp.inputData("Lebar");
                    psgp.infoBangun(isBangun, "Panjang", "Lebar");
                    psgp.hitungKeliling(isBangun); psgp.hitungLuas(isBangun);
                }
                case 3 -> { isBangun = "Segitiga";
                    Segitiga sgt = new Segitiga();
                    sgt.inputData("Alas"); sgt.inputData("Tinggi");
                    sgt.infoBangun(isBangun, "Alas", "Tinggi");
                    sgt.hitungKeliling(isBangun); sgt.hitungLuas(isBangun);
                }
                case 4 -> { isBangun = "Lingkaran";
                    Lingkaran crcl = new Lingkaran();
                    crcl.inputData("JariJari");
                    crcl.infoBangun(isBangun, "JariJari");
                    crcl.hitungKeliling(isBangun); crcl.hitungLuas(isBangun);
                }
                case 5 -> { isBangun = "Jajar Genjang";
                    JajarGenjang jg = new JajarGenjang();
                    jg.inputData("Alas"); jg.inputData("Tinggi"); jg.inputData("Sisi Miring");
                    jg.infoBangun(isBangun, "Alas", "Tinggi", "Sisi Miring");
                    jg.hitungKeliling(isBangun); jg.hitungLuas(isBangun);
                }
                case 6 -> { isBangun = "Belah Ketupat";
                    BelahKetupat bk = new BelahKetupat();
                    bk.inputData("Sisi"); bk.inputData("Diagonal-1"); bk.inputData("Diagonal-2");
                    bk.infoBangun(isBangun, "Sisi", "Diagonal-1", "Diagonal-2");
                    bk.hitungKeliling(isBangun); bk.hitungLuas(isBangun);
                }
                case 0 -> MainMenu();
            }
            System.out.print("Kembali ke menu ? Y/n : ");
            backMenu = in.next().charAt(0);
        } while (backMenu == 'Y' || backMenu == 'y');
    }

    private void hitung3D(){
        do {
            System.out.println("Aplikasi Penghitung Volume Bangun Ruang");
            System.out.println("1. Kubus\n2. Balok\n3. Tabung\n4. Bola\n5. Kerucut\n0. Kembali");
            System.out.print("Pilih bangun ruang yang ingin di hitung : ");
            pilihMenu = in.nextInt();
            switch (pilihMenu) {
                case 1 -> { isBangun = "Kubus";
                    Kubus cube = new Kubus();
                    cube.inputData("Rusuk");
                    cube.infoBangun(isBangun, "Rusuk");
                    cube.hitungVolume(isBangun);
                }
                case 2 -> { isBangun = "Balok";
                    Balok blk = new Balok();
                    blk.inputData("Panjang"); blk.inputData("Lebar"); blk.inputData("Tinggi");
                    blk.infoBangun(isBangun, "Panjang", "Lebar", "Tinggi");
                    blk.hitungVolume(isBangun);
                }
                case 3 -> { isBangun = "Tabung";
                    Tabung tb = new Tabung();
                    tb.inputData("JariJari"); tb.inputData("Tinggi");
                    tb.infoBangun(isBangun, "JariJari", "Tinggi");
                    tb.hitungVolume(isBangun);
                }
                case 4 -> { isBangun = "Bola";
                    Bola ball = new Bola();
                    ball.inputData("JariJari");
                    ball.infoBangun(isBangun, "JariJari");
                    ball.hitungVolume(isBangun);
                }
                case 5 -> { isBangun = "Kerucut";
                    Kerucut kr = new Kerucut();
                    kr.inputData("JariJari"); kr.inputData("Tinggi");
                    kr.infoBangun(isBangun, "JariJari", "Tinggi");
                    kr.hitungVolume(isBangun);
                }
                case 0 -> MainMenu();
            }
            System.out.print("Kembali ke menu ? Y/n : ");
            backMenu = in.next().charAt(0);
        } while (backMenu == 'Y' || backMenu == 'y');
    }
}