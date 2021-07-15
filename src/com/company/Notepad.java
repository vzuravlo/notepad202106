package com.company;

import java.util.ArrayList;
import java.util.List;

public class Notepad {
    private final List<Record> records = new ArrayList<>();

    public void createRecord() {
        var rec = new Record();

        var firstName = InputUtils.askString("First name");
        rec.setFirstName(firstName);

        var lastName = InputUtils.askString("Last name");
        rec.setLastName(lastName);

        records.add(rec);
    }

    public void listRecords() {

        for (var r : records) {
            System.out.println(r);
        }
    }
}
