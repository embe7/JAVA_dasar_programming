package com.tutorial;

public class Main {


    public static void main (String[] args){

/*
   - Do while loop adalah perulangan yang mirip dengan while
   - perbedaannya hanya pada pengecekan kondisi
   - pengecekan kondisi di while loop dilakukan awal sebelum perulangan dilakukan,
     sedangkan di do while loop perulangan dilakukan setelah perulangan dilakukan
   - oleh karena itu didalam do while loop, minimal pasti sekali perulangan dilakukan walaupun kondisi tidak bernilai terue
*/        

//        do {
//            aksi
//        } while (kondisi);


        System.out.println("ini adalah awal program");

        int a = 0;
        boolean kondisi = true;


        do {
            a++;
            System.out.println("do while ke-" + a);

            if (a == 1) {
                kondisi = false;
            }

        }while(kondisi);

        System.out.println("ini adalah akhir program");
    }
}
