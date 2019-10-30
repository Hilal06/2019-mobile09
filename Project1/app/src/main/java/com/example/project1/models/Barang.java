package com.example.project1.models;

public class Barang {
    private String nama;
    private int harga;
    private int gambar;

    public Barang() {
    }

    public Barang(String nama, int harga, int gambar) {
        this.nama = nama;
        this.harga = harga;
        this.gambar = gambar;
    }

    public String getNama() {
        return nama;
    }

    public int getHarga() {
        return harga;
    }

    public int getGambar() {
        return gambar;
    }
}