package com.developeralamin.contact.model;

public class ContactData {

    private String name, email, phone, address, profile_img;


    public ContactData(String name, String email, String phone, String address, String profile_img) {
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.address = address;
        this.profile_img = profile_img;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getProfile_img() {
        return profile_img;
    }

    public void setProfile_img(String profile_img) {
        this.profile_img = profile_img;
    }
}
