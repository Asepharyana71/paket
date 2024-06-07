package com.pbotugaskelas6juni;
import com.ikan.Hiu;
import com.mamlialaut.LumbaLumba;

public class App {
    public static void main(String[] args) {
        // Membuat objek Hiu dari package ikan
        Hiu hiuBesar = new Hiu("Hiu Putih Besar", 300);

        // Membuat objek LumbaLumba dari package mamalia_laut
        LumbaLumba lumbaLumba = new LumbaLumba("Flipper", "Abu-abu");

        // Menambahkan teman hiu untuk lumba-lumba
        lumbaLumba.tambahTemanHiu(hiuBesar);

        // Menampilkan informasi
        System.out.println("Lumba-lumba " + lumbaLumba.nama + " berwarna " + lumbaLumba.warna);
        System.out.println(lumbaLumba.berenang());
        System.out.println(lumbaLumba.bersiul());

        // Mengakses atribut dari kelas Hiu (package ikan)
        if (lumbaLumba.temanHiu != null) {
            System.out.println("\nTeman hiu lumba-lumba:");
            System.out.println("Nama: " + lumbaLumba.temanHiu.nama);
            System.out.println(lumbaLumba.temanHiu.berenang());
        }
    }
}
