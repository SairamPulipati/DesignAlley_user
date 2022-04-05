package com.example.design_alley;

public class MainModel {
    Integer gallery;
    public MainModel(Integer images){
        this.gallery = images;
    }

    public Integer getGallery() {
        return gallery;
    }

    public void setGallery(Integer gallery) {
        this.gallery = gallery;
    }
}
