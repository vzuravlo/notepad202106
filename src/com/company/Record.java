package com.company;

import java.util.Locale;

public abstract class Record {
    private static int counter = 0;
    private int id;

    public Record() {
        counter++;
        id = counter;
    }

    public int getId() {

        return id;
    }

    @Override
    public String toString() {

        return "(" + id + ")";
    }

    public abstract void askData();

    public boolean contains(String substr) {

        return String.valueOf(id).contains(substr);
    }

}
