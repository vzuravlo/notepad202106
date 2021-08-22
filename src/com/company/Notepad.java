package com.company;

import java.util.ArrayList;
import java.util.List;
import java.util.Locale;

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

//    public void delete(int id) {
//        for (int i = 0; i < records.size(); i++) {
//            var rec = records.get(i);
//            if (rec.getId() == id) {
//                records.remove(i);
//                return;
//            }
//        }
//        System.out.println("Not found");
//    }

    public void delete(int id) {
        var removed = records.removeIf(r -> r.getId() == id);
        if (!removed) {
            System.out.println("Not found");
        }
    }

    public void find(String substr) {
        var tmp = substr.toLowerCase();
        for (Record rec : records) {
            if (rec.contains(tmp)) {
                System.out.println(rec);
            }
        }
    }
}
/*
create BOOK John Smith 123456
create PERSON Mike Johnson male 23 mike@mike.com 34534535454
create ALARM text 1212
create PERSON Mike1 KKKKKK male 45 werwer@fghfgh 3434534
create PERSON Mike9 XXXX female 43 dfg 345345345

*/