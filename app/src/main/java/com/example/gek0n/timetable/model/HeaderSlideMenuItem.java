package com.example.gek0n.timetable.model;

/**
 * Created by gek0n on 029, 29.10.2016.
 */

public class HeaderSlideMenuItem extends SlideMenuItem {
    private String title;

    public HeaderSlideMenuItem(String title){this.title = title;}

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
