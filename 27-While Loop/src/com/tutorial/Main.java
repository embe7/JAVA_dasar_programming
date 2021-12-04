package com.tutorial;

public class Main {

    public static void main (String[] args){

/*
  - While loop adalah versi perulangan yang lebih sederhana dibandingkan for loop
  - di while loop, hanya terdapat kondisi perulangan tanpa ada init statement dan post statement
 */        

//        while (kondisi) {
//            aksi
//        }

        int a = 0;
        boolean kondisi = true;

        System.out.println("awal program");

        while (kondisi) {
            System.out.println("while loop ke-" + a);

            if (a == 10){
                kondisi = false;
            }

            a++;
        }

        System.out.println("akhir program");

    }
}
