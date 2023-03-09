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

public class Tabung extends Modul2.Praktikum.VBangun3D {
    private double jarijari, tinggi;

    @Override
    public void inputData(String Data) {
        if (Objects.equals(Data, "Jarijari")){
            super.inputData(Data);
            Scanner in = new Scanner(System.in);
            setJarijari(in.nextDouble());
        } else if (Objects.equals(Data, "Tinggi")){
            super.inputData(Data);
            Scanner in = new Scanner(System.in);
            setTinggi(in.nextDouble());
        } else {
            debugInput(Data);
        }
    }

    @Override
    public void infoBangun(String bangunRuang, String p, String p2) {
        super.infoBangun(bangunRuang);
        System.out.print(p + " : " + getJarijari() + "\t");
        System.out.print(p2 + " : " + getTinggi() + "\t\n");
    }

    @Override
    public void hitungVolume(String Bangun) {
        this.setVolume(Math.PI * getJarijari() * getJarijari() * getTinggi());
        super.hitungVolume(Bangun);
    }

    private double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }

    private double getTinggi() {
        return tinggi;
    }

    public void setTinggi(double tinggi) {
        this.tinggi = tinggi;
    }
}
