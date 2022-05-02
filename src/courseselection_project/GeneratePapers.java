/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseselection_project;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Derek Lien
 */
public class GeneratePapers {

    Map<String, ArrayList<String>> pRecord = new HashMap<String, ArrayList<String>>();
    Scanner scan = new Scanner(System.in);
    CourseSelection_Project checkInt = new CourseSelection_Project();
    int paperSize = 0;
    int mInput;
    int pInput;
    int sInput;
    int semInput;

    /* selectPapers method prompts the user to select their major and then their paper accordingly.
    Based on what the user picks, the program will show which papers are available to the user depending 
    on their major and which semester they're enrolling into.
     */
    public void selectPapers() {

        boolean check = false;
        String saveQ = "";
        String saveP = "";
        String concatQ = "";
        SelectStreamCore sCore = new SelectStreamCore();
        semesterCheck();
        saveQ = "Please select a major down below: \n1) Digital Services\n"
                + "2) Networks and Cybersecurity\n3) Software Development\n"
                + "4) Data Science";
        mInput = checkInt.readInt(scan, saveQ);

        /* validation check.
        */
        while (!check) {
            if (mInput >= 1 && mInput <= 4) {
                check = true;
            }
            if (mInput >= 5 || mInput <= 0) {
                System.out.println("\nInvalid Selection! Try again\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GeneratePapers.class.getName()).log(Level.SEVERE, null, ex);
                }
                mInput = checkInt.readInt(scan, saveQ);
                check = false;
            }
        }

        while (paperSize < 4) {

            saveP = "Select 3 core papers and 1 major paper: \n"
                    + "1) COMP500 Programming Concepts and Techinques\n"
                    + "2) COMP501 Computing Technology in Society\n"
                    + "3) DIGD507 Mahi Tahi: Collaborative Practices\n"
                    + "4) MATH503 Mathematics for Computing\n"
                    + "5) COMP507 IT Project Management\n"
                    + "6) COMP508 Database System Design\n";

            if (semInput == 1) {
                switch (mInput) {

                    case 1:
                        saveQ = "7) INFS502 can only be taken in Semester 2!";
                        break;
                    case 2:
                        saveQ = "7) COMP504 can only be taken in Semester 2!";
                        break;
                    case 3:
                        saveQ = "7) COMP503 Programming 2";
                        break;
                    case 4:
                        saveQ = "7) COMP517 can only be taken in Semester 2!";
                        break;
                }
            } else if (semInput == 2) {
                switch (mInput) {

                    case 1:
                        saveQ = "7) INFS502 Digital Services in IT";
                        break;
                    case 2:
                        saveQ = "7) COMP504 Networks and Internet";
                        break;
                    case 3:
                        saveQ = "7) COMP503 Programming 2";
                        break;
                    case 4:
                        saveQ = "7) COMP517 Data Analysis";
                        break;
                }
            }

            concatQ = saveP.concat(saveQ);
            pInput = checkInt.readInt(scan, concatQ);

            /* validation checks. Checks if the user inputs a number higher than the given prompt.
             */
            check = false;
            while (!check) {
                if (pInput >= 1 && pInput <= 7) {
                    check = true;
                }
                if (pInput <= 0 || pInput >= 8) {
                    System.out.println("\nInvalid Selection! Try again\n");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GeneratePapers.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    pInput = checkInt.readInt(scan, concatQ);
                    check = false;
                }
            }

            check = false;

            /* there are some papers that can only be taken in semester 2. The program will recognize
            if the user tries to enrol into a paper that can be only taken in semester 2. The program 
            will alert the user appropriately.
            */
            while (!check) {
                if (semInput == 1 && pInput == 7) {
                    if (semInput == 1 && pInput == 7 && mInput == 3) {
                        break;
                    }
                    System.out.println("You cannot take this paper in semester 1!");
                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GeneratePapers.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    pInput = checkInt.readInt(scan, concatQ);
                    check = false;
                    while (!check) {
                        if (pInput >= 1 && pInput <= 7) {
                            check = true;
                        }
                        if (pInput <= 0 || pInput >= 8) {
                            System.out.println("\nInvalid Selection! Try again\n");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(GeneratePapers.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            pInput = checkInt.readInt(scan, concatQ);
                            check = false;
                        }
                    }
                    check = false;
                } else if (pInput < 7 || semInput == 2) {
                    check = true;
                }

            }

            sCore.selectStreamCore(pInput, mInput, semInput);
            check = false;

            /* this checks if the user has made a duplicate choice for papers. If the user chooses a paper
            they've already chosen, then the program will alert the user and allow the user to pick again.
             */
            while (!check) {
                if (pRecord.keySet().equals(sCore.getCRecord().keySet())) {
                    System.out.println("\nYou already have this paper added!\n");

                    try {
                        Thread.sleep(1000);
                    } catch (InterruptedException ex) {
                        Logger.getLogger(GeneratePapers.class.getName()).log(Level.SEVERE, null, ex);
                    }

                    pInput = checkInt.readInt(scan, concatQ);
                    check = false;
                    while (!check) {
                        if (pInput >= 1 && pInput <= 7) {
                            check = true;
                        }
                        if (pInput <= 0 || pInput >= 8) {
                            System.out.println("\nInvalid Selection! Try again\n");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(GeneratePapers.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            pInput = checkInt.readInt(scan, concatQ);
                            check = false;
                        }
                    }
                    sCore.selectStreamCore(pInput, mInput, semInput);
                    check = false;
                } else {
                    paperSize += sCore.getPaperSize();
                    pRecord.putAll(sCore.getCRecord());
                    check = true;
                }

            }

        }

    }

    public int semesterCheck() {
        boolean check = false;
        semInput = checkInt.readInt(scan, "Which semeser are you enrolling for? \n1) Semester 1\n2) Semester 2");
        while (!check) {
            if (semInput >= 1 && semInput <= 2) {
                check = true;
            } else if (semInput <= 0 || semInput >= 3) {
                System.out.println("\nInvalid Selection! Try again\n");
                try {
                    Thread.sleep(1000);
                } catch (InterruptedException ex) {
                    Logger.getLogger(GeneratePapers.class.getName()).log(Level.SEVERE, null, ex);
                }
                semInput = checkInt.readInt(scan, "Which semeser are you enrolling for? \n1) Semester 1\n2) Semester 2");
                check = false;
            }
        }
        return semInput;
    }

    public Map<String, ArrayList<String>> getPaperSelect() {
        return pRecord;
    }

    public int getMajorInput() {
        return mInput;
    }
}
