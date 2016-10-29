package com.example.gek0n.timetable.model;

/**
 * Created by gek0n on 029, 29.10.2016.
 */

public class CheckedSlideMenuItem extends SlideMenuItem {
    private boolean isChecked;
    private String title;

    public CheckedSlideMenuItem(boolean isChecked, String title){
        this.isChecked = isChecked;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public boolean getIsChecked() {
        return isChecked;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsChecked(boolean isChecked) { this.isChecked = isChecked; }
}
