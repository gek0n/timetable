package com.example.gek0n.timetable.model;

import java.util.ArrayList;

/**
 * Created by gek0n on 029, 29.10.2016.
 */

public class ListTextSlideMenuItem extends SlideMenuItem {
    private String title;
    private ArrayList<String> listGroups;

    public ListTextSlideMenuItem(ArrayList<String> listGroups, String title){
        this.listGroups = listGroups;
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public ArrayList<String> getListGroups() {
        return listGroups;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setIsChecked(ArrayList<String> listGroups) { this.listGroups = listGroups; }
}
