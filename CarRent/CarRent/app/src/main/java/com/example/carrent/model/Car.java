package com.example.carrent.model;

import com.example.carrent.R;

public class Car {
    int imgId ;
    String type ,price;
    public static final Car[] data =
            {
                    new Car(R.drawable.audi,"250","audi"),
                    new Car(R.drawable.bmw,"250","bmw"),
                    new Car(R.drawable.rangrover,"250","rang rover"),
                    new Car(R.drawable.golf,"250","golf")
            };

    public Car(int imgId, String price, String type) {
        this.imgId = imgId;
        this.price = price;
        this.type = type;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }
}
