package com.example.morya;

public class ItemModel {
    private int image;
    private String name,price,size;

    public ItemModel() {
    }

    public ItemModel(int image, String name, String price, String size) {
        this.image = image;
        this.name = name;
        this.price = price;
        this.size = size;
    }

    public int getImage() {
        return image;
    }



    public String getName() {
        return name;
    }

    public String getPrice() {
        return price;
    }

    public String getSize() {
        return size;
    }
}
