package com.company;

public class RecurringAlarm extends StickyNote {
    private String time;

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    @Override
    public String toString() {
        var tmp = super.toString();
        return tmp + ", time='" + time + '\'';
    }

    @Override
    public void askData() {
        super.askData();
        time = InputUtils.askString("Time");
    }
    
    public boolean contains(String substr) {
        return super.contains(substr)
                || time.contains(substr);
    }
    
}
