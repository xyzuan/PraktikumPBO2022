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

public class PersegiPanjang extends Modul2.Praktikum.LKBangun2D  {
    private double Panjang, Lebar;

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
        } else {
            debugInput(Data);
        }
    }

    @Override
    public void infoBangun(String bangunDatar, String p, String p2) {
        super.infoBangun(bangunDatar);
        System.out.print(p + " : " + getPanjang() + "\t");
        System.out.print(p2 + " : " + getLebar() + "\t\n");
    }

    @Override
    public void hitungKeliling(String Bangun) {
        this.setKeliling(( getPanjang() * 2 ) + ( getLebar() * 2 ));
        super.hitungKeliling(Bangun);
    }
    @Override
    public void hitungLuas(String Bangun) {
        this.setLuas(getPanjang() * getLebar());
        super.hitungLuas(Bangun);
    }

    private double getPanjang() {
        return Panjang;
    }

    public void setPanjang(double panjang) {
        Panjang = panjang;
    }

    private double getLebar() {
        return Lebar;
    }

    public void setLebar(double lebar) {
        Lebar = lebar;
    }
}