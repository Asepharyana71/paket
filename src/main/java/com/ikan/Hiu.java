package com.ikan;

public class Hiu {
    public String nama;
    public int jumlahGigi;

    public Hiu(String nama, int jumlahGigi) {
        this.nama = nama;
        this.jumlahGigi = jumlahGigi;
    }

    public String berenang() {
        return nama + " berenang dengan cepat menggunakan siripnya.";
    }

    public String gigit() {
        return nama + " menggigit dengan kuat menggunakan " + jumlahGigi + " giginya!";
    }
}