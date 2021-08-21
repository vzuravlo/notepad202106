package com.company;

import java.util.Deque;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.concurrent.LinkedBlockingDeque;

public class Main {
    private static final Notepad notepad = new Notepad();

    public static void main(String[] args) {
        var running = true;
        String command = """
                Enter command
                "h" or "help" for help""";
        while (running) {
            var cmd = InputUtils.askString(command);
            switch (cmd) {
                case "exit":
                    running = false;
                    break;
                case "h":
                case "help":
                    showHelp(0);
                    break;
                case "c":
                case "create":
                    createRecord();
                    break;
                case "l":
                case "list":
                    listRecords();
                    break;
                case "del":
                case "delete":
                    deleteRecord();
                    break;
                case "s":
                case "search":
                    findRecord();
                    break;
                default:
                    System.out.println("Unknown command");
            }
        }
        System.out.println("Good bye");
    }

    private static void findRecord() {
        var substr = InputUtils.askString("What to find?");
        notepad.find(substr);
    }

    private static void deleteRecord() {
        var id = InputUtils.askNumber("Enter record ID to delete", 1, Integer.MAX_VALUE);
        notepad.delete(id);
    }

    private static void listRecords() {

        notepad.listRecords();
    }

    private static void createRecord() {

        showHelp(1);

        var strType = InputUtils.askString("Enter record type");
        var type = RecordType.valueOf(strType);

        notepad.createRecord(type);

        System.out.println("created");
    }

    private static void showHelp(int helpNumber) {
        switch (helpNumber) {
            case 0:
                String helpMessage = """
                        "h" or "help" this help
                        "c" or "create" for create new record
                        "l" or "list" for list of records
                        "del" or "delete" for delete record
                        "s" or "search" for search record
                        "exit" Bye!     
                        """;
                System.out.println(helpMessage);

                break;
            case 1:
                System.out.println("Supported types:");
                for (var t : RecordType.values()) {
                    System.out.println("   " + t);
                }
                break;

        }

    }
}
