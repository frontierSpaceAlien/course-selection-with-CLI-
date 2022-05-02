/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseselection_project.checkstreaminput;

import courseselection_project.CourseSelection_Project;
import courseselection_project.GeneratePapers;
import courseselection_project.SelectStreamCore;
import courseselection_project.courses.COMP500;
import courseselection_project.courses.Paper;
import courseselection_project.courses.SCOMP500;
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
public class PaperCoreOne implements CheckStreamInput {

    Scanner scan = new Scanner(System.in);
    Map<String, ArrayList<String>> cRecord = new HashMap<String, ArrayList<String>>();
    SelectStreamCore getStreamCoreList = new SelectStreamCore();
    CourseSelection_Project checkInput = new CourseSelection_Project();
    boolean check = false;
    int sInput;
    int paperSize;

    /* getUserPaper method has validation checks for when the user enters a value higher than the given prompt.
    The method also checks whether the user is enrolling for semester 1 or 2. This method will adjust accordingly and
    give appropriate streams depending on the semester.
     */
    @Override
    public void getUserPaper(int pInput, int mInput, int semInput) {
        Paper comp500 = new COMP500();
        cRecord.putAll(getStreamCoreList.getCRecord());

        if (pInput == 1 && !cRecord.containsKey(comp500.getPaperName())) {
            if (semInput == 1) {
                sInput = checkInput.readInt(scan, "Please select a stream: \n" + comp500.getStreamCodes());
                while (!check) {
                    if (sInput >= 10 && sInput <= 17) {
                        check = true;
                    }
                    if (sInput <= 9 || sInput >= 18) {
                        System.out.println("\nInvalid Selection! Try again\n");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(GeneratePapers.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        sInput = checkInput.readInt(scan, "Please select a stream: \n" + comp500.getStreamCodes());
                        check = false;
                    }
                }
                cRecord.put(comp500.getPaperName(), new SCOMP500().getStreams(sInput));
                ++paperSize;
            }
            if (semInput == 2) {
                sInput = checkInput.readInt(scan, "Please select a stream: \n" + comp500.getStreamCodes2());
                while (!check) {
                    if (sInput >= 50 && sInput <= 54) {
                        check = true;
                    }
                    if (sInput <= 49 || sInput >= 55) {
                        System.out.println("\nInvalid Selection! Try again\n");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(GeneratePapers.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        sInput = checkInput.readInt(scan, "Please select a stream: \n" + comp500.getStreamCodes2());
                        check = false;
                    }
                }
                cRecord.put(comp500.getPaperName(), new SCOMP500().getStreams(sInput));
                ++paperSize;
            }
        }

    }

    /* returns paperSize for other classes to use.
    */
    @Override
    public int getPaperSize() {
        return paperSize;
    }

    
    /* returns cRecord for other classes to use.
    */
    @Override
    public Map<String, ArrayList<String>> getCRecord() {
        return cRecord;
    }
}
