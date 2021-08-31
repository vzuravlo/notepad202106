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
                    Help.showHelp(0);
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
                case "w":
                case "write":
                    writeFile();
                    break;
                case "r":
                case "read":
                    readFile();
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

        Help.showHelp(1);

        String strType = InputUtils.askString("Enter record type");
        RecordType type = RecordType.findByName(strType);
        

        notepad.createRecord(type);

        System.out.println("created");
    }
    
    private static void writeFile() {
        notepad.writeFile();
    
    }
    
    private static void readFile() {
        notepad.readFile();
    
    }

}
