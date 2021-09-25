package com.company;

import java.time.LocalDate;

public class Reminder extends  RecurringAlarm{
    private LocalDate date;

    public LocalDate getDate() {
        return date;
    }

    public void setDate(LocalDate date) {
        this.date = date;
    }
    
    @Override
    public String toString() {
        var tmp = super.toString();
        return tmp + ", date='" + InputUtils.getStrDate(date) + '\'';
    }
    
    @Override
    public void askData() {
        super.askData();
        date = InputUtils.askDate("Date");
    }
    public boolean contains(String substr) {
        return super.contains(substr)
                || InputUtils.getStrDate(date).contains(substr);
    }
    
}
