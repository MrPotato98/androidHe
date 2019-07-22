package com.huypo.myapplication;

import java.util.ArrayList;

public class Images {
    int id;
    String name;

    public  Images(int id, String name){
        this.id = id;
        this.name = name;
    }

    public int getId(){
        return id;
    }

    public void setId(int id){
        this.id = id;
    }

    public String getName(){
        return name;
    }
    public void setName(){
        this.name = name;
    }

    public  static ArrayList<Images>init(){
        ArrayList<Images>arrayList = new ArrayList<>();
        arrayList.add(new Images(R.drawable.image_01,"Image 01"));
        arrayList.add(new Images(R.drawable.image_02,"Image 02"));
        arrayList.add(new Images(R.drawable.image_03,"Image 03"));
        arrayList.add(new Images(R.drawable.image_04,"Image 04"));
        arrayList.add(new Images(R.drawable.image_05,"Image 05"));

        return arrayList;

    }
}
