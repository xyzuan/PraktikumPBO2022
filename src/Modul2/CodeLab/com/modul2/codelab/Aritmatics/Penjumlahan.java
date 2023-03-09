package Modul2.CodeLab.com.modul2.codelab.Aritmatics;

import Modul2.CodeLab.com.modul2.codelab.Operator;

public class Penjumlahan extends Operator {
    @Override
    public double operation(double a, double b){
        return a + b;
    }

    @Override
    public double operation(double a, double b, double c){
        return a + b + c;
    }
}
