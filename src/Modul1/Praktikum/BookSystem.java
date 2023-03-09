package Modul1.Praktikum;

import java.util.Scanner;

public class BookSystem {
    private final int[][] room = {{1, 101, 1000000},
            {0, 102, 2000000},
            {1, 103, 300000}};
    private String Nama;
    private String NoTelp;
    private String Alamat;
    private String Email;

    Scanner inputData = new Scanner(System.in);

    public static void main(String[] args) {
        Scanner inputData = new Scanner(System.in);
        BookSystem  main = new BookSystem();
        int bookAgain;
        main.init();
        do {
            main.bookRoom();
            System.out.println("Ingin memesan kamar lagi? 0/1");
            bookAgain = inputData.nextInt();
        } while (bookAgain == 0);
    }

    void inputNama(){
        System.out.println("Registration");
        System.out.print("Masukkan Nama : ");
        String temp = inputData.nextLine();
        if (isNumeric(temp)){
            System.out.println("Inputan nama tidak boleh mengandung angka");
            inputNama();
        } else {
            setNama(temp);
        }
    }
    void inputEmail(){
        System.out.print("Masukkan Email : ");
        String temp = inputData.nextLine();
        if (temp.endsWith("@webmail.umm.ac.id")){
            setEmail(temp);
        } else {
            System.out.println("Inputan Email harus menggunakan domain @webmail.umm.ac.id");
            inputEmail();
        }
    }
    void inputNoTelp(){
        System.out.print("Masukkan No Telp (+62) : ");
        String temp = inputData.nextLine();
        if (temp.startsWith("+62")){
            setNoTelp(temp);
        } else {
            System.out.println("Inputan No Telp harus menggunakan kode negara +62");
            inputNoTelp();
        }
    }

    void inputAlamat(){
        System.out.print("Masukkan Alamat : ");
        setAlamat(inputData.nextLine());
    }

    void init(){
        inputNama();
        inputEmail();
        inputNoTelp();
        inputAlamat();
    }

    void dispPerson(){
        System.out.println("Nama : " + getNama());
        System.out.println("No Telp : " + getNoTelp());
        System.out.println("Alamat : " + getAlamat());
        System.out.println("Email : " + getEmail());
    }

    void bookRoom(){
        System.out.println("Rayz Hotel");
        for(int a = 0; a < getRoom().length; a++){
            if (getRoom()[a][0] == 0){
                System.out.println(a+1 + ". No. " + getRoom()[a][1]);
            } else {
                System.out.println(a+1 + ". No. " + getRoom()[a][1] + " (Tidak Tersedia)");
            }
        }
        System.out.print("Pilih kamar yang tersedia: ");
        int selectedRoom = inputData.nextInt();
        if(getRoom()[selectedRoom - 1][0] == 1){
            System.out.println("Mohon Maaf Kamar Tidak Tersedia");
        } else {
            doPayment(selectedRoom - 1);
        }
    }

    void doPayment(int noRoom){
        System.out.println("===========================");
        System.out.println("Pembayaran Kamar");
        dispPerson();
        System.out.println("No Kamar : " + getRoom()[noRoom][1]);
        System.out.println("Harga Kamar : " + getRoom()[noRoom][2]);
        System.out.println("===========================");
        System.out.print("Masukkan Tunai : ");
        int yourMoney = inputData.nextInt();
        if (getRoom()[noRoom][2] > yourMoney){
            System.out.println("Uang tidak cukup");
        } else {
            System.out.println("Kamar berhasil dipesan");
            getRoom()[noRoom][0] = 1;
        }
    }
    public static boolean isNumeric(String strNum) {
        if (strNum == null) {
            return false;
        }
        try {
            double d = Double.parseDouble(strNum);
        } catch (NumberFormatException nfe) {
            return false;
        }
        return true;
    }

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public String getNoTelp() {
        return NoTelp;
    }

    public void setNoTelp(String noTelp) {
        NoTelp = noTelp;
    }

    public String getAlamat() {
        return Alamat;
    }

    public void setAlamat(String alamat) {
        Alamat = alamat;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String email) {
        Email = email;
    }

    public int[][] getRoom() {
        return room;
    }
}
