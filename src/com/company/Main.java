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
        notepad.createRecord();
        System.out.println("created");
    }

    private static void showHelp() {
        System.out.println("This is very useful help!");
    }
}
