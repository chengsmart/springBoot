package com.example.api.anniversary.entity;

import java.util.Date;

public class Anniversary {
    private String tickname;
    private String name;
    private Date birthday;
    private Date love_day;

    public String getTickname() {
        return tickname;
    }

    public void setTickname(String tickname) {
        this.tickname = tickname;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Date getLove_day() {
        return love_day;
    }

    public void setLove_day(Date love_day) {
        this.love_day = love_day;
    }
}
