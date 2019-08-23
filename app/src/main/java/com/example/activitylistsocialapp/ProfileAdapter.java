package com.example.activitylistsocialapp;

import android.view.View;
import android.view.ViewGroup;
import android.widget.BaseAdapter;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Date;

public class ProfileAdapter extends BaseAdapter {

    private ArrayList<Profile> profiles;

    public ProfileAdapter() {
        profiles = new ArrayList<>();
        Profile p1 = new Profile(1, new Date());
        Profile p2 = new Profile(2, new Date());
        Profile p3 = new Profile(3, new Date());
        Profile p4 = new Profile(4, new Date());
        Profile p5 = new Profile(5, new Date());

        profiles.add(p1);
        profiles.add(p2);
        profiles.add(p3);
        profiles.add(p4);
        profiles.add(p5);


    }

    @Override
    public int getCount() {
        return profiles.size();
    }

    @Override
    public Object getItem(int i) {
        return null;
    }

    @Override
    public long getItemId(int i) {
        return 0;
    }

    @Override
    public View getView(int i, View view, ViewGroup viewGroup) {
        return null;
    }
}
