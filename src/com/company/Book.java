package com.company;

import java.util.Locale;

public class Book extends Record {
    private String title;
    private String author;
    private String isbn;
    
    public String getTitle() {
        
        return title;
    }
    
    public void setTitle(String title) {
        
        this.title = title;
    }
    
    public String getAuthor() {
        
        return author;
    }
    
    public void setAuthor(String author) {
        
        this.author = author;
    }
    
    public String getIsbn() {
        
        return isbn;
    }
    
    public void setIsbn(String isbn) {
        
        this.isbn = isbn;
    }
    
    @Override
    public String toString() {
        var tmp = super.toString();
        return tmp + ", title='" + title + '\''
                + ", author='" + author + '\''
                + ", isbn='" + isbn + '\'';
    }
    
    @Override
    public void askData() {
        title = InputUtils.askString("Title");
        author = InputUtils.askString("Author");
        isbn = InputUtils.askString("ISBN");
    }
    
    public boolean contains(String substr) {
        return super.contains(substr)
                || title.toLowerCase().contains(substr)
                || author.toLowerCase().contains(substr)
                || isbn.toLowerCase().contains(substr);
    }
    
    
}
