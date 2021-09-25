package com.company;

import java.time.LocalDate;
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class InputUtils {
    public static final String TIME_FORMAT = "HH:mm";
    public static final DateTimeFormatter TIME_FORMATTER = DateTimeFormatter.ofPattern(TIME_FORMAT);
    public static final String DATE_FORMAT = "dd-MM-yyyy";
    public static final DateTimeFormatter DATE_FORMATTER = DateTimeFormatter.ofPattern(DATE_FORMAT);
    private static final Scanner scanner = new Scanner(System.in);
    
    public static int askNumber(String message, int min, int max) {
        while (true) {
            try {
                System.out.println(message + ":");
                int answer = scanner.nextInt();
                if (answer < min) {
                    System.out.printf("Number should not be less than %d\n", min);
                } else if (answer > max) {
                    System.out.printf("Number should not be greater than %d\n", max);
                } else {
                    return answer;
                }
            } catch (InputMismatchException ex) {
                var str = scanner.next();
                System.out.printf("You entered %s. But number expected.\n", str);
            }
        }
    }
    
    public static String askString(String message) {
        System.out.println(message);
        return scanner.next();
    }

//    public static boolean askYesNo(String arg) {
//
//        String answer;
//        boolean keyExit;
//        boolean ret = true;
//        System.out.println(arg);
//
//        do {
//            Scanner in = new Scanner(System.in);
//            answer = in.next();
//
//            switch (answer) {
//                case "Y":
//                case "y": {
//                    ret = true;
//                    keyExit = false;
//                    break;
//                }
//                case "N":
//                case "n": {
//                    ret = false;
//                    keyExit = false;
//                    break;
//                }
//                default: {
//                    System.out.println("Incorrect answer. Enter y or n.");
//                    keyExit = true;
//                }
//            }
//        }
//        while (keyExit);
//        return ret;
//
//
//    }
    
    public static boolean askYesNo(String msg) {
        while (true) {
            System.out.println(msg + " (y/n)");
            var answer = scanner.next().toLowerCase();
            
            switch (answer) {
                case "y":
                    return true;
                case "n":
                    return false;
            }
            
            System.out.println("Incorrect answer. Enter y or n.");
        }
    }
    
    public static LocalTime askTime(String time) {
        while (true) {
            try {
                var strTime = askString(time + "(" + TIME_FORMAT + ")");
                return LocalTime.parse(strTime, TIME_FORMATTER);
                
            } catch (DateTimeParseException ex) {
                
                System.out.println("Enter time in correct format:" + "(" + TIME_FORMAT + ")\n");
            }
        }
        
    }
    
    public static String getStrTime(LocalTime timeStr) {
        return timeStr.format(TIME_FORMATTER);
    }
    
    public static LocalDate askDate(String date) {
        while (true) {
            try {
                var strDate = askString(date + "(" + DATE_FORMAT + ")");
                return LocalDate.parse(strDate, DATE_FORMATTER);
            
            } catch (DateTimeParseException ex) {
            
                System.out.println("Enter date in correct format:" + "(" + DATE_FORMAT + ")\n");
            }
        }

    }
    
    public static String getStrDate(LocalDate dateStr) {
        return dateStr.format(DATE_FORMATTER);
    }
    
}
