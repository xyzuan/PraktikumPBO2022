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

import java.util.Objects;

public class LKBangun2D {
    protected double Luas, Keliling;

    protected void inputData(String Data) {
        if(
           /*
              This list object are will be used for inputData Operation
              It need to be change the if function and add setter function
              between this equal object depend on the shape
           */
                Objects.equals(Data, "Sisi") ||
                        Objects.equals(Data, "Panjang") ||
                        Objects.equals(Data, "Lebar") ||
                        Objects.equals(Data, "Alas") ||
                        Objects.equals(Data, "Tinggi") ||
                        Objects.equals(Data, "JariJari") ||
                        Objects.equals(Data, "Sisi Miring") ||
                        Objects.equals(Data, "Diagonal-1") ||
                        Objects.equals(Data, "Diagonal-2"))
        {
            System.out.print("Masukkan " + Data + " : ");
            /*
               Placeholder for inputData Setter Function
               Example :
                    super.inputData(Data);
                    Scanner in = new Scanner(System.in);
                    setSisi(in.nextDouble());
            */
        }
    }

    protected void infoBangun(String bangunDatar){
        System.out.println("______________________________________________________");
        System.out.println("Hasil Bangun " + bangunDatar);
    }

    protected void infoBangun(String bangunDatar, String p){
        System.out.println("______________________________________________________");
        System.out.println("Hasil Bangun " + bangunDatar);
        // Dummy for bangunDatar information
        System.out.print(p + " : " /* + bangunAttribute */ + "\t\n");
    }

    protected void infoBangun(String bangunDatar, String p, String p2){
        System.out.println("______________________________________________________");
        System.out.println("Hasil Bangun " + bangunDatar);
        // Dummy for bangunDatar information
        System.out.print(p + " : " /* + bangunAttribute */ + "\t");
        System.out.print(p2 + " : " /* + bangunAttribute */ + "\t\n");
    }

    protected void infoBangun(String bangunDatar, String p, String p2, String p3){
        System.out.println("______________________________________________________");
        System.out.println("Hasil Bangun " + bangunDatar);
        // Dummy for bangunDatar information
        System.out.print(p + " : " /* + bangunAttribute */ + "\t");
        System.out.print(p2 + " : " /* + bangunAttribute */ + "\t");
        System.out.print(p3 + " : " /* + bangunAttribute */ + "\t\n");
    }

    protected void debugInput(String params){
        Main obj = new Main();
        if(obj.isDebug) {
            System.out.println("DEBUG : " + "Exception Parameters [" + params + "] are not registered in the subclass");
        }
    }

    protected void hitungKeliling(String Bangun) {
        // Placeholder for Keliling Operation isHere
        System.out.println("Keliling dari Bangun " + Bangun + " tersebut adalah " + getKeliling());
    }

    protected void hitungLuas(String Bangun) {
        // Placeholder for Luas Operation isHere
        System.out.println("Luas dari Bangun " + Bangun + " tersebut adalah " + getLuas());
    }

    protected double getLuas() {
        return Luas;
    }

    protected void setLuas(double luas) {
        Luas = luas;
    }

    protected double getKeliling() {
        return Keliling;
    }

    protected void setKeliling(double keliling) {
        Keliling = keliling;
    }
}