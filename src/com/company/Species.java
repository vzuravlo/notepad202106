package com.company;

public enum Species {
    CAT{
        @Override
        public boolean matches(String str) {
            return super.matches(str) || "c".equalsIgnoreCase(str);
        }
    },
    DOG{
        @Override
        public boolean matches(String str) {
            return super.matches(str)||"d".equalsIgnoreCase(str);
        }
    },
    RABBIT{
        @Override
        public boolean matches(String str) {
            return super.matches(str)||"r".equalsIgnoreCase(str);
        }
    },
    FISH{
        @Override
        public boolean matches(String str) {
            return super.matches(str)||"f".equalsIgnoreCase(str);
        }
    };
    
    public boolean matches(String str) {
        return this.name().equalsIgnoreCase(str);
    }
    public static Species findBySpecies(String str) {
        
        while (true) {
            try {
                for (var rt : Species.values()) {
                    
                    if (rt.matches(str)) {
                        
                        return rt;
                    }
                    
                }
                throw new IllegalArgumentException(str);
                
            } catch (IllegalArgumentException e) {
                System.out.println("Incorrect species.");
                
                
            }
            Help.showHelp(2);
            str = InputUtils.askString("Enter species");
            
            
        }
    }
    
    
}
