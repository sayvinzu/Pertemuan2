package com.example.sayvinzu.pertemuan2;

public class Manusia {

    private String Nama;
    private int Umur;

    public String getNama() {
        return Nama;
    }

    public void setNama(String nama) {
        Nama = nama;
    }

    public int getUmur() {
        return Umur;
    }

    public void setUmur(int umur) {
        Umur = umur;
    }

    public void makan(){
        System.out.println("Nyam Nyam");
    }
}
