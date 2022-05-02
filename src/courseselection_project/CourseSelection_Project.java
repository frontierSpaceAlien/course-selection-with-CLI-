/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseselection_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Derek Lien
 */
public class CourseSelection_Project {

    static Map<Integer, String> userInfo = new HashMap<Integer, String>();
    static Map<String, ArrayList<String>> paperInfo = new HashMap<String, ArrayList<String>>();
    static Map<Map<Integer, String>, Map<String, ArrayList<String>>> saveStudentResult
            = new HashMap<Map<Integer, String>, Map<String, ArrayList<String>>>();
    static WriteFile sf = new WriteFile();
    static ReadFile rf = new ReadFile();
    static int userInput = 0;
    static Scanner scan = new Scanner(System.in);
    static String line = "\nWould you like to update\\change your paper selection? Y/N\n"
            + "WARNING: UPDATING PAPERS WILL DELETE YOUR CURRENT PAPERS\n"
            + "(Y/N)";

    /* main method
     */
    public static void main(String[] args) throws InterruptedException {
        Student s = new Student(0, "");
        String saveQ = "";
        String saveName = "";
        String saveStr;
        boolean check = false;

        System.out.println("Welcome to the AUT Course Selection Program!");
        Thread.sleep(1000);
        System.out.println("This program is created towards first-year students starting in 2023");
        Thread.sleep(1000);
        System.out.println("Type x anytime to quit\n");
        Thread.sleep(1000);

        saveQ = "Enter Student ID: ";
        s.setSID(readInt(scan, saveQ));

        System.out.println("Enter your full name: ");
        saveName = scan.nextLine();

        while (!check) {
            if ((!saveName.equals(null)) && saveName.matches("^[a-zA-Z\\s]+")) {
                s.setName(saveName);
                check = true;
            } else {
                System.out.println("\nInvalid Name! Try again.\n");
                Thread.sleep(1000);
                System.out.println("Enter your full name: ");
                saveName = scan.nextLine();
                check = false;
            }
        }
        checkID(s.getSID(), s.getName());
        GeneratePapers gen = new GeneratePapers();
        gen.selectPapers();
        paperInfo.putAll(gen.getPaperSelect());

        System.out.println("Your current selection is: ");

        for (Entry<String, ArrayList<String>> e : paperInfo.entrySet()) {
            System.out.println(e);

        }
        saveStudentResult.put(userInfo, paperInfo);
        saveStr = readString(scan, line);
        check = false;

        while (!check) {
            if (saveStr.equalsIgnoreCase("y")) {
                paperInfo.clear();
                saveStudentResult.clear();

                GeneratePapers gen2 = new GeneratePapers();
                gen2.selectPapers();
                paperInfo.putAll(gen2.getPaperSelect());
                saveStudentResult.put(userInfo, paperInfo);
                saveStr = readString(scan, line);

                while (!check) {
                    if (saveStr.equalsIgnoreCase("n")) {
                        System.out.println("Record Saved.");
                        sf.WriteToFile();
                        System.exit(0);
                    } else if (saveStr.equalsIgnoreCase("y")) {
                        check = true;
                    } else {
                        System.out.println("Invalid Input! Try again with Y/N");
                        saveStr = readString(scan, line);
                    }
                }
                check = false;
            } else if (saveStr.equalsIgnoreCase("n")) {
                System.out.println("Record Saved");
                sf.WriteToFile();
                System.out.println("Program is now closing");
                System.exit(0);

            } else {
                System.out.println("Invalid Input! Try again with Y/N");
                Thread.sleep(1000);
                saveStr = readString(scan, line);
            }

        }
    }

    /*checkID method checks if there is an existing user in the hashmap. If there is a user that exists, the method gives
    the user an option to update their records. If the user says no, then the program exits and does not alter the record.
     */
    public static Map<Integer, String> checkID(int id, String name) {
        rf.readFile();
        userInfo.putAll(rf.getUserInfo());
        paperInfo.putAll(rf.getPaperInfo());
        boolean check = false;
        String saveStr;

        if (userInfo.containsKey(id)) {
            System.out.println("\nRecord found.\n");
            System.out.println("Record currently saved is: ");
            System.out.println(userInfo);
            for (Entry<String, ArrayList<String>> e : paperInfo.entrySet()) {
                System.out.print(e.getKey() + " ");
                for (String f : e.getValue()) {
                    System.out.println(f);
                }
            }
            saveStr = readString(scan, line);

            while (!check) {
                if (saveStr.equalsIgnoreCase("y")) {
                    paperInfo.clear();
                    saveStudentResult.clear();

                    GeneratePapers gen = new GeneratePapers();
                    gen.selectPapers();
                    paperInfo.putAll(gen.getPaperSelect());

                    System.out.println("Your current selection is: ");
                    for (Entry<String, ArrayList<String>> e : paperInfo.entrySet()) {
                        System.out.println(e);

                    }
                    saveStr = readString(scan, line);
                    saveStudentResult.put(userInfo, paperInfo);
                    check = false;

                    while (!check) {
                        if (saveStr.equalsIgnoreCase("n")) {
                            System.out.println("Record saved.");
                            sf.WriteToFile();
                            System.exit(0);
                        } else if (saveStr.equalsIgnoreCase("y")) {
                            check = true;
                        } else {
                            System.out.println("\nInvalid Input! Try again with Y/N");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(CourseSelection_Project.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            saveStr = readString(scan, line);
                        }

                    }
                    check = false;

                } else if (saveStr.equalsIgnoreCase("n")) {
                    System.out.println("Record unaltered.\nProgram is now closing.");
                    System.exit(0);

                } else {
                    System.out.println("\nInvalid Input! Try again with Y/N");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        System.out.println(ex.getMessage());;
                    }
                    saveStr = readString(scan, line);
                }

            }

        } else {
            userInfo.put(id, name);
            System.out.println("New record created.");
        }

        return userInfo;
    }

    /* readInt is user validation. If the user enters anything other than a number, the program will 
    alert the user to try again with a valid input.
     */
    public static int readInt(Scanner scan, String line) {
        String strInput;

        while (true) {
            System.out.println(line);

            if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                scan.nextLine();
                return userInput;

            } else if (scan.hasNextLine()) {
                strInput = scan.nextLine();
                checkInput(strInput);
                System.out.println("\nInvalid Input! Try Again.\n");
                try {
                    Thread.sleep(650);
                } catch (InterruptedException ex) {
                    System.out.println(ex.getMessage());
                }
            }
        }
    }

    /* readString has the same functionality as readInt except this is for validating strings from user 
    input.
     */
    public static String readString(Scanner scan, String line) {
        String strInput;

        while (true) {
            System.out.println(line);
            if (scan.hasNextLine()) {
                strInput = scan.nextLine();
                checkInput(strInput);
                return strInput;

            } else if (scan.hasNextInt()) {
                userInput = scan.nextInt();
                scan.nextLine();
                System.out.println("Invalid Input! Try Again.");
                try {
                    Thread.sleep(650);
                } catch (InterruptedException ex) {
                    Logger.getLogger(CourseSelection_Project.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    /* checkInput checks if the user inputs the char 'x'. This allows the user to exit the program anytime
    without altering the student.txt file.
     */
    public static String checkInput(String input) {
        if (input.equalsIgnoreCase("x")) {
            System.exit(0);
        }
        return input;
    }

    public Map<Map<Integer, String>, Map<String, ArrayList<String>>> getSaveStudentResult() {
        return saveStudentResult;
    }

    public int getUserInput() {
        return userInput;
    }

}
