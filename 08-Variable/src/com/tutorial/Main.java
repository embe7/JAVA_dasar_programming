package com.tutorial;

public class Main {

    public static void main(String[] args){

        // kita akan membuat variabel
        // tipe data
        int a = 10; // assignment
        System.out.println("nilai a = " + a);

        a = 20;
        System.out.println("nilai a baru = " + a);

        // kita akan membuat sebuah deklarasi
        int b; // deklarasi

        b = 7;

        System.out.println("nilai b = " + b);
        
        /* Kata Kunci var
        sejak java versi 10, java mendukung pembuatan variabel dengan kata kunci var, sehinggga kita tidak perlu menyebutkan tipe datanya
        */
        var name = "Otong";
        System.out.println(name);
        
        /* Kata Kunci final
        secara default variabel di java dapat diubah- ubah nilainya.
        jika kita ingin membuat variabel yang nilainya tidak boleh diubah setelah pertama kali dibuat, kita bisa menggunakan kata kunci final.
        */
        final String name2 = "Surotong";
        final var NIK = "111000222000xxxx";
        
        System.out.println(name + " " + NIK);


    }
}
