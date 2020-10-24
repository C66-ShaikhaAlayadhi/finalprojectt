package com.example.finalproject;

import java.io.Serializable;

public class Fields implements Serializable {
    private String name;
    private String address;
    private int image;
    private String number;
    private String hours;

    public Fields(String name, String address, int image, String number, String hours){
        this.name = name;
        this.address = address;
        this.image = image;
        this.number = number;
        this.hours = hours;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getImage() {
        return image;
    }

    public void setImage(int image) {
        this.image = image;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getHours() {
        return hours;
    }

    public void setHours(String hours) {
        this.hours = hours;
    }

}
