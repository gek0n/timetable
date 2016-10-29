package com.example.gek0n.timetable.model;

/**
 * Created by gek0n on 029, 29.10.2016.
 */

public class HeaderGroupSlideMenuItem extends SlideMenuItem{
    private String title;

    public HeaderGroupSlideMenuItem(String title)
    {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }
}
