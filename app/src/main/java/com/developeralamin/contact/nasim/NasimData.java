package com.developeralamin.contact.nasim;

public class NasimData {

    String name,email,phone,profile_img;

    public NasimData(String name, String email, String phone, String profile_img) {
        this.name = name;
        this.email = email;
        this.phone = phone;
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

    public String getProfile_img() {
        return profile_img;
    }

    public void setProfile_img(String profile_img) {
        this.profile_img = profile_img;
    }
}
