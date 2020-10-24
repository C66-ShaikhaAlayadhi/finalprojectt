package com.example.finalproject;

import java.io.Serializable;

public class Parks implements Serializable {
    private String name2;
    private String address2;
    private int image2;
    private String hours2;
    private String phone;
    private String playground;

    public Parks (String name2, String address2, int image2, String hours2, String phone, String playground){
        this.name2 = name2;
        this.address2 = address2;
        this.image2 = image2;
        this.hours2 = hours2;
        this.phone = phone;
        this.playground = playground;

    }

    public String getName2() {
        return name2;
    }

    public void setName2(String name2) {
        this.name2 = name2;
    }

    public String getAddress2() {
        return address2;
    }

    public void setAddress2(String address2) {
        this.address2 = address2;
    }

    public int getImage2() {
        return image2;
    }

    public void setImage2(int image2) {
        this.image2 = image2;
    }

    public String getHours2() {
        return hours2;
    }

    public void setHours2(String hours2) {
        this.hours2 = hours2;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getPlayground() {
        return playground;
    }

    public void setPlayground(String playground) {
        this.playground = playground;
    }
}
