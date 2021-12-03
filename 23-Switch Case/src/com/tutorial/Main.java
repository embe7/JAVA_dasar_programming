package com.tutorial;

import java.util.*;

public class Main {

    // switch case

    public static void main(String[] args){

        String input;
        Scanner inputUser = new Scanner(System.in);

        System.out.print("panggil nama: ");
        input = inputUser.next();

        // ekspresinya berupa satuan (int,long,byte,short), String, atau enum
        switch(input){
            case "otong":
                System.out.println("saya otong dan hadir Bos!!!");
                break;
            case "ucup":
                System.out.println("saya ucup dan hadir Bos!!!!");
                break;
            case "mario":
                System.out.println("saya mario dan hadir Bos!!!!");
                break;
            default:
                System.out.println(input + " tidak hadir Bos!!!");
        }

        System.out.println("selesai program");
        
        
        
        /* Switch Lambda
            - di java versi 14, diperkenalkan switch expression dengan lambda
            - ini lebih mudah saat penggunaan switch expression karena tidak perlu lagi menggunakan kata kunci break
         */

        var nilai2 = "B";

        switch (nilai2) {
            case "A" -> System.out.println("Sangat Baik");
            case "B", "C" -> System.out.println("cukup baik");
            case "D" -> System.out.println("Buruk");
            default -> System.out.println("Sangat Buruk");
        }

        /* Kata kunci yield
            - di java 14, ada kata kunci baru yaitu yield, dimana kita menggunakan kata kunci yield untuk mengembalikan nilai pada switch statement
            - ini sangat mempermudah kita ketika membuat data berdasarkan kondisi switch statement
         */

        var nilai3 = "D";
        String ucapan;

        switch (nilai3) {
            case "A" -> ucapan = "Sangat baik";
            case "B", "C" -> ucapan = "Cukup baik";
            case "D" -> ucapan = "Buruk";
            default -> ucapan = "Sangat buruk";
        }
        System.out.println(ucapan);

        //contoh lain penggunaan yield switch

        var nilai4 = "A";
        ucapan = switch (nilai4) {
            case "A":
                yield "Sangat Baik";
            case "B", "C":
                yield "Cukup Baik";
            case "D":
                yield "Buruk";
            default:
                yield "Sangat Buruk";
        };
        System.out.println(ucapan);

    }

}
