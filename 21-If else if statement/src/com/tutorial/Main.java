package com.tutorial;

public class Main {

    public static void main (String[] args){

        // tutorialif else if statement

        int a = 5;

        System.out.println("ini adalah awal program");

        // if else if statement

        if (a == 5){

            System.out.println("ini adalah aksi 1");

        } else if (a == 10) {

            System.out.println("ini adalah aksi 2");

        } else {

            System.out.println("ini adalah aksi default");

        }

        // akhir dari if else if statement

        System.out.println("ini adalah akhir program");
        
        //Contoh penggunaan if else statement
        
        int nilai = 80;
        int absen = 100;

        if (nilai >= 100 && absen >= 100){
            System.out.println("Nilai Anda A");
        }else if (nilai >= 80 && absen >= 80){
            System.out.println("Nilai Anda B");
        }else if (nilai >= 65 && absen >= 65){
            System.out.println("Nilai Anda C");
        }else {
            System.out.println("Anda Tidak Lulus");
        }


    }
}
