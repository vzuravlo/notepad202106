package com.company;

public class Reminder extends  RecurringAlarm{
    private String date;

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
        var tmp = super.toString();
        return tmp + ", date='" + date + '\'';
    }
    
    @Override
    public void askData() {
        super.askData();
        date = InputUtils.askString("Date");
    }
    
}
