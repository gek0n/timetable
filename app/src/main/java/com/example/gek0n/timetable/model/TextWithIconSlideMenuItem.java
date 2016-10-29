package com.example.gek0n.timetable.model;

/**
 * Created by gek0n on 029, 29.10.2016.
 */

public class TextWithIconSlideMenuItem extends SlideMenuItem{
    private int imgId;
    private String title;

    public TextWithIconSlideMenuItem(int imgId, String title) {
        this.imgId = imgId;
        this.title = title;
    }

    public int getImgId() {
        return imgId;
    }

    public void setImgId(int imgId) {
        this.imgId = imgId;
    }

    @Override
    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
