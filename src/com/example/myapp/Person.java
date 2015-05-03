package com.example.myapp;

/**
 * Created by igor on 21.03.15.
 */
public class Person {
    private String name;
    private  boolean doesAvatarExist;
    private long birth;
    private String telephone;
    private String email;
    private boolean isFavourite;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isDoesAvatarExist() {
        return doesAvatarExist;
    }

    public void setDoesAvatarExist(boolean doesAvatarExist) {
        this.doesAvatarExist = doesAvatarExist;
    }

    public long getBirth() {
        return birth;
    }

    public void setBirth(long birth) {
        this.birth = birth;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public boolean isFavourite() {
        return isFavourite;
    }

    public void setFavourite(boolean isFavourite) {
        this.isFavourite = isFavourite;
    }
}
