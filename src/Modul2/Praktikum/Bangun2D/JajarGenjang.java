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

package Modul2.Praktikum.Bangun2D;

import java.util.Objects;
import java.util.Scanner;

public class JajarGenjang extends Modul2.Praktikum.LKBangun2D {
    private double alas, tinggi, miring;

    @Override
    public void inputData(String Data) {
        if (Objects.equals(Data, "Alas")){
            super.inputData(Data);
            Scanner in = new Scanner(System.in);
            setAlas(in.nextDouble());
        } else if (Objects.equals(Data, "Tinggi")){
            super.inputData(Data);
            Scanner in = new Scanner(System.in);
            setTinggi(in.nextDouble());
        } else if (Objects.equals(Data, "Sisi Miring")){
            super.inputData(Data);
            Scanner in = new Scanner(System.in);
            setMiring(in.nextDouble());
        } else {
            debugInput(Data);
        }
    }

    @Override
    public void infoBangun(String bangunDatar, String p, String p2, String p3) {
        super.infoBangun(bangunDatar);
        System.out.print(p + " : " + getAlas() + "\t");
        System.out.print(p2 + " : " + getTinggi() + "\t");
        System.out.print(p3 + " : " + getMiring() + "\t\n");
    }

    @Override
    public void hitungKeliling(String Bangun) {
        this.setKeliling(( 2 * ( getAlas() + getMiring())));
        super.hitungKeliling(Bangun);
    }

    @Override
    public void hitungLuas(String Bangun) {
        this.setLuas(( getAlas() * getTinggi()));
        super.hitungLuas(Bangun);
    }

    private double getAlas() {
        return alas;
    }

    public void setAlas(double alas) {
        this.alas = alas;
    }

    private double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }

    private double getMiring() {
        return miring;
    }

    public void setMiring(double miring) {
        this.miring = miring;
    }
}