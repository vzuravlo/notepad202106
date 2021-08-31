package com.company;

public class Help {
    static void showHelp(int helpNumber) {
        switch (helpNumber) {
            case 0:
                String helpMessage = """
                        "h" or "help" this help
                        "c" or "create" for create new record
                        "l" or "list" for list of records
                        "del" or "delete" for delete record
                        "s" or "search" for search record
                        "r" or "read" read file
                        "w" or "write" write to file
                        "exit" Bye!
                        """;
                System.out.println(helpMessage);
                
                break;
            case 1:
                helpMessage = """
                        "h" or "help" this help
                        Supported types:
                          "p" or "PERSON"
                          "b" or "BOOK"
                          "s" or "STICKY_NOTE"
                          "a" or "ALARM"
                          "r" or "REMINDER"
                          "pet" or "PET"
                        """;
                System.out.println(helpMessage);
                break;
            case 2:
                helpMessage = """
                        "h" or "help" this help
                        Supported species:
                          "c" or "CAT"
                          "d" or "DOG"
                          "r" or "RABBIT"
                          "f" or "FISH"
                        """;
                System.out.println(helpMessage);
                break;
            
        }
        
    }
    
    
}
