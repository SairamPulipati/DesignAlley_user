package com.example.design_alley;

public class Mainmodel1 {
    Integer imageslist;
    String Names;
    public Mainmodel1(Integer Imageslist,String names){
        this.imageslist = Imageslist;
        this.Names = names;
    }

    public Integer getImageslist() {
        return imageslist;
    }

    public void setImageslist(Integer imageslist) {
        this.imageslist = imageslist;
    }

    public String getNames() {
        return Names;
    }

    public void setNames(String names) {
        Names = names;
    }
}
