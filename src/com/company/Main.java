package com.company;

public class Main {
    private static final Notepad notepad = new Notepad();

    public static void main(String[] args) {
        var running = true;

        while (running) {
            var cmd = InputUtils.askString("enter command\n(enter \"help\" for help)");
            switch (cmd) {
                case "exit":
                    running = false;
                    break;
                case "help":
                    showHelp();
                    break;
                case "create":
                    createRecord();
                    break;
                case "list":
                    listRecords();
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
        System.out.println("Good bye");
    }

    private static void listRecords() {
        notepad.listRecords();
    }

    private static void createRecord() {
        System.out.println("Supported types:");
        for(var t : RecordType.values()) {
            System.out.println("   " + t);
        }
        var strType = InputUtils.askString("Enter record type");
        var type = RecordType.valueOf(strType);

        notepad.createRecord(type);

        System.out.println("created");
    }

    private static void showHelp() {
        System.out.println("This is very useful help!");
    }
}
