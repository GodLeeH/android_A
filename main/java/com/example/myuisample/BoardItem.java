package com.example.myuisample;

public class BoardItem {

    String depName;
    int resId;


    public BoardItem(String name,    int resId) {
        depName = name;
        this.resId = resId;
    }


    public void setName(String name) {
        depName = name;
    }


    public String getName() {
        return depName;
    }

    public int getResId() {
        return resId;
    }

    public void setResId(int resId) {
        this.resId = resId;
    }

    @Override
    public String toString() {
        return depName;
    }
}
