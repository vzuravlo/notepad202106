package com.company;

import java.time.LocalTime;

public class RecurringAlarm extends StickyNote {
    private LocalTime time;

    public LocalTime getTime() {
        return time;
    }

    public void setTime(LocalTime time) {
        this.time = time;
    }

    @Override
    public String toString() {
        var tmp = super.toString();
        return tmp + ", time='" + InputUtils.getStrTime(time) + '\'';
    }

    @Override
    public void askData() {
        super.askData();
        time = InputUtils.askTime("Time");
    }
    
    public boolean contains(String substr) {
        return super.contains(substr)
                || InputUtils.getStrTime(time).contains(substr);
    }
    
}
