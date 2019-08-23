package com.example.activitylistsocialapp;

import java.time.LocalDate;
import java.util.Date;

public class Profile {

    private int imagePath;
    private Date date;
    private boolean like;

    public Profile() {
    }

    public Profile(int imagePath, Date date) {
        this.imagePath = imagePath;
        this.date = date;
    }

    public int getImagePath() {
        return imagePath;
    }

    public void setImagePath(int imagePath) {
        this.imagePath = imagePath;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public boolean isLike() {
        return like;
    }

    public void setLike(boolean like) {
        this.like = like;
    }
}
