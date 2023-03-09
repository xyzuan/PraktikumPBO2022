package Modul3.Praktikum;

import java.util.Scanner;

public class User {
    private boolean admin;
    private int userIndex;
    private Object[][] userDB = {{"admin", "admin", 0, true}, {"202110370311147", "UMM_a2022", 1, true}};
    Scanner in = new Scanner(System.in);
    String tempUser, tempPass;
    public static void main(String[] args) {
        User main = new User();
        main.login();
    }
    void login(){
        System.out.print("Masukkan username: ");
        String loginUser = in.nextLine();
        System.out.print("Masukkan password: ");
        String loginPass = in.nextLine();

        for (int a = 0; a < getUserDB().length; a++){
            if (loginUser.equals(getUserDB()[a][0]) && loginPass.equals(getUserDB()[a][1])){
                setAdmin(getUserDB()[a][2].equals(0));
                setUserIndex(a);
                dashboard();
            }
        }
    }
    void dashboard(){
        if(isAdmin()){
            System.out.println("Sistem Akademik UMM | Admin");
            System.out.println("1. Update Status Mahasiswa\n2. Update Password Mahasiswa\n0. Logout");
            System.out.print("Pilih menu: ");
            int selectMenu = Integer.parseInt(in.nextLine());
            switch (selectMenu){
                case 1 -> updateStatus();
                case 2 -> updatePassword();
                case 0 -> login();
                default -> System.out.println("Salah Input");
            }
        } else {
            System.out.println("Sistem Akademik UMM | Mahasiswa");
            System.out.println("Username\t\t: " + getUserDB()[getUserIndex()][0]);
            System.out.println("Status Mahasiswa\t\t: " + getUserDB()[getUserIndex()][3]);
            System.out.println("1. Update Password\n0. Logout");
            System.out.print("Pilih menu: ");
            int selectMenu = Integer.parseInt(in.nextLine());
            switch (selectMenu){
                case 1 -> updatePassword();
                case 0 -> login();
                default -> System.out.println("Salah Input");
            }
        }
    }

    void updateStatus(){
        System.out.print("Masukkan namaUser: ");
        tempUser = in.nextLine();
        for (int a = 0; a < getUserDB().length; a ++){
            if (tempUser.equals(getUserDB()[a][0])){
                System.out.println("Ganti Status Mahasiswa: ");
                System.out.println("1. Aktif\n2. Tidak Aktif");
                System.out.print("Pilih menu: ");
                int selectMenu = Integer.parseInt(in.nextLine());
                switch (selectMenu){
                    case 1 -> {
                        getUserDB()[a][3] = true;
                        break;
                    }
                    case 2 -> {
                        getUserDB()[a][3] = false;
                        break;
                    }
                }
            }
        }
        dashboard();
    }
    void updatePassword(){
        if (isAdmin()){
            System.out.print("Masukkan namaUser: ");
            tempUser = in.nextLine();
            for (int a = 0; a < getUserDB().length; a ++){
                if (tempUser.equals(getUserDB()[a][0])){
                    System.out.print("Input Password Baru: ");
                    tempPass = in.nextLine();
                    if (validatePass(tempPass)){
                        getUserDB()[a][1] = tempPass;
                        System.out.println("Password berhasil diubah");
                    } else {
                        System.out.println("Password harus kombinasi uppercase lowercase, terdapat angka, dan symbols");
                    }
                }
            }
        } else {
            System.out.print("Input Password Baru: ");
            tempPass = in.nextLine();
            if (validatePass(tempPass)){
               getUserDB()[getUserIndex()][1] = tempPass;
                System.out.println("Password berhasil diubah");
            } else {
                System.out.println("Password harus kombinasi uppercase lowercase, terdapat angka, dan symbols");
            }
        }
        dashboard();
    }

    boolean isPassSymbols(String pass){
        String specialCharactersString = "!@#$%&*()'+,-./:;<=>?[]^_`{|}";
        for (int i=0; i < pass.length() ; i++)
        {
            char ch = pass.charAt(i);
            if(specialCharactersString.contains(Character.toString(ch))) {
                return true;
            } else if(i == pass.length()-1) {
                return false;
            }
        }
        return  false;
    }
    boolean isPassDigit(String pass){
        char[] chars = pass.toCharArray();
        for(char c : chars){
            if (Character.isDigit(c)){
                return true;
            }
        }
        return false;
    }

    boolean isPassUpperCase(String word) {
        if ( word == null ) return false; // this just to avoid NPE
        return word.toUpperCase().equals(word);
    }

    boolean isPassLowerCase(String word) {
        if ( word == null ) return false; // this just to avoid NPE
        return word.toLowerCase().equals(word);
    }

    boolean validatePass(String pass){
        if (!isPassLowerCase(pass) && !isPassUpperCase(pass) && isPassDigit(pass) && isPassSymbols(pass)){
            return true;
        } else {
            return false;
        }
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public int getUserIndex() {
        return userIndex;
    }

    public void setUserIndex(int userIndex) {
        this.userIndex = userIndex;
    }

    public Object[][] getUserDB() {
        return userDB;
    }

    public void setUserDB(Object[][] userDB) {
        this.userDB = userDB;
    }
}
