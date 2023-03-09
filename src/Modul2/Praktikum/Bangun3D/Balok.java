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

package Modul2.Praktikum.Bangun3D;

import java.util.Objects;
import java.util.Scanner;

public class Balok extends Modul2.Praktikum.VBangun3D {
    private double panjang, lebar, tinggi;

    @Override
    public void inputData(String Data) {
        if (Objects.equals(Data, "Panjang")){
            super.inputData(Data);
            Scanner in = new Scanner(System.in);
            setPanjang(in.nextDouble());
        } else if (Objects.equals(Data, "Lebar")){
            super.inputData(Data);
            Scanner in = new Scanner(System.in);
            setLebar(in.nextDouble());
        } else if (Objects.equals(Data, "Tinggi")){
            super.inputData(Data);
            Scanner in = new Scanner(System.in);
            setTinggi(in.nextDouble());
        } else {
            debugInput(Data);
        }
    }

    @Override
    public void infoBangun(String bangunRuang, String p, String p2, String p3) {
        super.infoBangun(bangunRuang);
        System.out.print(p + " : " + getPanjang() + "\t");
        System.out.print(p2 + " : " + getLebar() + "\t");
        System.out.print(p3 + " : " + getTinggi() + "\t\n");
    }

    @Override
    public void hitungVolume(String Bangun) {
        this.setVolume(getPanjang() * getLebar() * getTinggi());
        super.hitungVolume(Bangun);
    }

    private double getPanjang() {
        return panjang;
    }

    public void setPanjang(double panjang) {
        this.panjang = panjang;
    }

    private double getLebar() {
        return lebar;
    }

    public void setLebar(double lebar) {
        this.lebar = lebar;
    }

    private double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
