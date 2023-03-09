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

public class Bola extends Modul2.Praktikum.VBangun3D {
    private double jarijari;

    @Override
    public void inputData(String Data) {
        if (Objects.equals(Data, "Jarijari")){
            super.inputData(Data);
            Scanner in = new Scanner(System.in);
            setJarijari(in.nextDouble());
        } else {
            debugInput(Data);
        }
    }

    @Override
    public void infoBangun(String bangunRuang, String p) {
        super.infoBangun(bangunRuang);
        System.out.print(p + " : " + getJarijari() + "\t\n");
    }

    @Override
    public void hitungVolume(String Bangun) {
        this.setVolume((4.0/3.0) * Math.PI * Math.pow(getJarijari(), 3));
        super.hitungVolume(Bangun);
    }

    private double getJarijari() {
        return jarijari;
    }

    public void setJarijari(double jarijari) {
        this.jarijari = jarijari;
    }
}
