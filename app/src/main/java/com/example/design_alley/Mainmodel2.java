package com.example.design_alley;

public class Mainmodel2 {
    Integer imageinfo;
    String labels;
    public Mainmodel2(Integer Imageinfo,String Labels){
        this.imageinfo =Imageinfo;
        this.labels = Labels;
    }

    public Integer getImageinfo() {
        return imageinfo;
    }

    public void setImageinfo(Integer imageinfo) {
        this.imageinfo = imageinfo;
    }

    public String getLabels() {
        return labels;
    }

    public void setLabels(String labels) {
        this.labels = labels;
    }
}
