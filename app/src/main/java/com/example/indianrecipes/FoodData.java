package com.example.indianrecipes;

public class FoodData {
    private String itemDescription;
    private String itemName;
    private String itemPrice;
    private String itemImage;

    public FoodData(String itemDescription, String itemName, String itemPrice, String itemImage) {
        this.itemDescription = itemDescription;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemImage = itemImage;
    }

    public String getItemDescription() {
        return itemDescription;
    }

    public String getItemName() {
        return itemName;
    }

    public String getItemPrice() {
        return itemPrice;
    }

    public String getItemImage() {
        return itemImage;
    }
}
