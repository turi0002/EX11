package com.example.user.ex11;

/**
 * Created by User on 11/05/2018.
 */

public class Country {
    String name;
    String flag;
    String details;
    String anthem;
    String shorty;

    public void setShorty(String shorty) {
        this.shorty = shorty;
    }

    public String getShorty() {

        return shorty;
    }

    public String getName() {
        return name;
    }

    public String getFlag() {
        return flag;
    }

    public String getDetails() {
        return details;
    }

    public String getAnthem() {
        return anthem;
    }


    public void setName(String name) {
        this.name = name;
    }

    public void setFlag(String flag) {
        this.flag = flag;
    }

    public void setDetails(String details) {
        this.details = details;
    }

    public void setAnthem(String anthem) {
        this.anthem = anthem;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
