package Modul1.CodeLab;
public class demoConv {
    static double convCM(double m){
        return m * 100;
    }

    static double convMM(double m){
        return m * 1000;
    }

    static void dispConv(double m){
        System.out.printf("%.2f Meter = %.2f cm, %.2f mm\n", m, convCM(m), convMM(m));
    }

    public static void main(String[] args) {
        dispConv(10);
    }
}
