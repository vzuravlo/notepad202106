package com.company;

public class StickyNote extends Record {
    private String text;

    public String getText() {
        return text;
    }

    public void setText(String text) {
        this.text = text;
    }

    @Override
    public String toString() {
        var tmp = super.toString();
        return tmp + ", text='" + text + '\'';
    }

    @Override
    public void askData() {
        text = InputUtils.askString("Text");
    }
    
    public boolean contains(String substr) {
        return super.contains(substr)
                || text.contains(substr);
    }
    
}
