package com.example.project3.models;

public class FastFood {
    private int foodImage;
    private String name;
    private float harga;

    public FastFood() {
    }

    public FastFood(int foodImage, String name, float harga) {
        this.foodImage = foodImage;
        this.name = name;
        this.harga = harga;
    }

    public int getFoodImage() {
        return foodImage;
    }

    public String getName() {
        return name;
    }

    public float getHarga() {
        return harga;
    }
}
