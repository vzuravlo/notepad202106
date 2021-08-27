package com.company;

public enum RecordType {
    PERSON {
        @Override
        public Record create() {
            return new Person();
        }
        
        @Override
        public boolean matches(String str) {
            return super.matches(str) || "p".equalsIgnoreCase(str);
        }
    
    },
    BOOK {
        @Override
        public Record create() {
            return new Book();
        }
    
        @Override
        public boolean matches(String str) {
            return super.matches(str) || "b".equalsIgnoreCase(str);
        }
    
    },
    STICKY_NOTE {
        @Override
        public Record create() {
            return new StickyNote();
        }
    
        @Override
        public boolean matches(String str) {
            return super.matches(str) || "s".equalsIgnoreCase(str);
        }
        
    },
    ALARM {
        @Override
        public Record create() {
            return new RecurringAlarm();
        }
    
        @Override
        public boolean matches(String str) {
            return super.matches(str) || "a".equalsIgnoreCase(str);
        }
    
    },
    REMINDER {
        @Override
        public Record create() {
            return new Reminder();
        }
    
        @Override
        public boolean matches(String str) {
            return super.matches(str) || "r".equalsIgnoreCase(str);
        }
    
    },
    PET {
        @Override
        public Record create() {
            return new Pet();
        }
    
        @Override
        public boolean matches(String str) {
            return super.matches(str) || "pet".equalsIgnoreCase(str);
        }
    
    };
    
    public abstract Record create();
    
    
    public boolean matches(String str) {
        return this.name().equalsIgnoreCase(str);
    }
    
    public static RecordType findByName(String str) {
    
        while (true) {
            try {
                for (var rt : RecordType.values()) {
            
                    if (rt.matches(str)) {
                
                        return rt;
                    }
            
                }
                throw new IllegalArgumentException(str);
    
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect record type.");

    
            }
            Help.showHelp(1);
            str = InputUtils.askString("Enter record type");
            
            
        }
    }
    
    
    
}
