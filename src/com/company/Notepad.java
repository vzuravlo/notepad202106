package com.company;

import java.util.ArrayList;
import java.util.List;

public class Notepad {
    private final List<Record> records = new ArrayList<>();

    public void createRecord(RecordType type) {
        var rec = type.create();
        rec.askData();
        records.add(rec);
        System.out.println(rec);
    }

    public void listRecords() {
        for (var r : records) {
            System.out.println(r);
        }
    }
}
