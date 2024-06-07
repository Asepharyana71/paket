package com.mamlialaut;

import com.ikan.Hiu;

public class LumbaLumba {
    public String nama;
    public String warna;
    public Hiu temanHiu; 

    public LumbaLumba(String nama, String warna) {
        this.nama = nama;
        this.warna = warna;
    }

    public String berenang() {
        return nama + " berenang dengan anggun menggunakan sirip dan ekornya.";
    }

    public String bersiul() {
        return nama + " bersiul dengan suara melengking.";
    }

    public void tambahTemanHiu(Hiu hiu) {
        this.temanHiu = hiu;
    }
}
