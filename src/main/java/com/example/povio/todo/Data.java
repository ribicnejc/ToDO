package com.example.povio.todo;

public class Data {
    String name;
    String type;
    int photoID;

    Data(String name, String type, int photoID){
        this.name = name;
        this.type = type;
        this.photoID = photoID;
    }

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public int getPhotoID(){
        return this.photoID;
    }

    public void setName(String name){
        this.name = name;
    }

    public void setType(String type){
        this.type = type;
    }

    public void setPhotoID(int photoID) {
        this.photoID = photoID;
    }
}
