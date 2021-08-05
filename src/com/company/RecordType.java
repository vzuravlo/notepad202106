package com.company;

public enum RecordType {
    PERSON {
        @Override
        public Record create() {
            return new Person();
        }
    },
    BOOK {
        @Override
        public Record create() {
            return new Book();
        }
    },
    STICKY_NOTE {
        @Override
        public Record create() {
            return new StickyNote();
        }
    },
    ALARM {
        @Override
        public Record create() {
            return new RecurringAlarm();
        }
    };

    public abstract Record create();
}
