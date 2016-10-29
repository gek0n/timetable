package com.example.gek0n.timetable.model;

import java.sql.Time;

/**
 * Created by gek0n on 029, 29.10.2016.
 */

public class ParaClass {

    public enum TypePara {
        LECTION,
        LABA,
        PRACTICE
    }

    public enum Podgrups {
        FIRST,
        SECOND
    }

    private int number;
    private String name;
    private String auditory;
    private String professor;
    private Time time;
    private TypePara type;
    private Podgrups podgr;

    ParaClass(int number, String name, String auditory, String professor, Time time, TypePara type, Podgrups podgr) {
        this.auditory = auditory;
        this.name = name;
        this.number = number;
        this.professor = professor;
        this.time = time;
        this.type = type;
        this.podgr = podgr;
    }

    public TypePara getType() { return this.type; }
    public String getName() {return this.name;}
    public Time getTime() {return this.time; }
    public String getProfessor() {return this.professor; }
    public String getAuditory() {return this.auditory; }
    public int getNumber() {return this.number;}
    public Podgrups getPodgr() {return this.podgr;}

    public void setNumber(int number){this.number = number;}
    public void setAuditory(String auditory) {this.auditory = auditory;}
    public void setProfessor(String professor) { this.professor = professor; }
    public void setTime(Time time) {this.time = time;}
    public void setType(TypePara type) {this.type = type;}
    public void setName(String name) { this.name = name;}
    public void setPodgr(Podgrups podgr) { this.podgr = podgr; }

}
