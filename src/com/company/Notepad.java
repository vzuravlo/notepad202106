package com.company;

import java.util.ArrayList;
import java.util.List;

public class Notepad {
    private final List<Record> records = new ArrayList<>();

    public void createPerson() {
        var rec = new Person();

        var firstName = InputUtils.askString("First name");
        rec.setFirstName(firstName);

        var lastName = InputUtils.askString("Last name");
        rec.setLastName(lastName);

        records.add(rec);
    }

    public void createBook() {
        var book = new Book();

        var title = InputUtils.askString("Title");
        book.setTitle(title);

        var author = InputUtils.askString("Author");
        book.setAuthor(author);

        var isbn = InputUtils.askString("ISBN");
        book.setIsbn(isbn);

        records.add(book);
    }

    public void listRecords() {

        for (var r : records) {
            System.out.println(r);
        }
    }
}
