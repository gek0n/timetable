package com.example.gek0n.timetable.model;

/**
 * Created by gek0n on 029, 29.10.2016.
 */

public class ShareSlideMenuItem extends SlideMenuItem  {
    private int imgId1;
    private int imgId2;
    private int imgId3;
    private String title;

    public ShareSlideMenuItem(int imgId1, int imgId2, int imgId3, String title){
        this.imgId1 = imgId1;
        this.imgId2 = imgId2;
        this.imgId3 = imgId3;
        this.title = title;
    }

    public int getImgId1() {
        return imgId1;
    }

    public void setImgId1(int imgId) {
        this.imgId1 = imgId;
    }

    public int getImgId2() {
        return imgId2;
    }

    public void setImgId2(int imgId) {
        this.imgId2 = imgId;
    }

    public int getImgId3() {
        return imgId3;
    }

    public void setImgId3(int imgId) {
        this.imgId3 = imgId;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
