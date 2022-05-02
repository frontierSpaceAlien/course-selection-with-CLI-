/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseselection_project.checkstreaminput;

import courseselection_project.CourseSelection_Project;
import courseselection_project.GeneratePapers;
import courseselection_project.SelectStreamCore;
import courseselection_project.courses.COMP503;
import courseselection_project.courses.COMP504;
import courseselection_project.courses.COMP517;
import courseselection_project.courses.INFS502;
import courseselection_project.courses.Paper;
import courseselection_project.courses.SCOMP503;
import courseselection_project.courses.SCOMP504;
import courseselection_project.courses.SCOMP517;
import courseselection_project.courses.SINFS502;
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
public class PaperSeven implements CheckStreamInput {

    Scanner scan = new Scanner(System.in);
    Map<String, ArrayList<String>> cRecord = new HashMap<String, ArrayList<String>>();
    SelectStreamCore getStreamCoreList = new SelectStreamCore();
    CourseSelection_Project checkInput = new CourseSelection_Project();
    boolean check = false;
    int sInput;
    int paperSize;

    /* slightly different from other classes that implements CheckStreamInput.
    This displays the streams for semester 2 papers. The comp503 object displays for 
    both semester 1 and 2. The reason why it's here and not on its own is because it is 
    a major paper. All major papers are set at 7 in the paper prompt.
    */
    @Override
    public void getUserPaper(int pInput, int mInput, int semInput) {
        Paper infs502 = new INFS502();
        Paper comp504 = new COMP504();
        Paper comp503 = new COMP503();
        Paper comp517 = new COMP517();

        cRecord.putAll(getStreamCoreList.getCRecord());

        if (pInput == 7 && mInput == 1 && semInput == 2) {
            if (!cRecord.containsKey(infs502.getPaperName())) {
                sInput = checkInput.readInt(scan, "Please select a stream: \n" + infs502.getStreamCodes());
                while (!check) {
                    if (sInput >= 50 && sInput <= 53) {
                        check = true;
                    }
                    if (sInput <= 49 || sInput >= 54) {
                        System.out.println("\nInvalid Selection! Try again\n");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(GeneratePapers.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        sInput = checkInput.readInt(scan, "Please select a stream: \n" + infs502.getStreamCodes());
                        check = false;
                    }
                }
                cRecord.put(infs502.getPaperName(), new SINFS502().getStreams(sInput));
                ++paperSize;
            }
        }
        if (pInput == 7 && mInput == 2 && semInput == 2) {
            if (!cRecord.containsKey(comp504.getPaperName())) {
                sInput = checkInput.readInt(scan, "Please select a stream: \n" + comp504.getStreamCodes());
                while (!check) {
                    if (sInput >= 50 && sInput <= 53) {
                        check = true;
                    }
                    if (sInput <= 49 || sInput >= 54) {
                        System.out.println("\nInvalid Selection! Try again\n");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(GeneratePapers.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        sInput = checkInput.readInt(scan, "Please select a stream: \n" + comp504.getStreamCodes());
                        check = false;
                    }
                }
                cRecord.put(comp504.getPaperName(), new SCOMP504().getStreams(sInput));
                ++paperSize;
            }
        }

        if (pInput == 7 && mInput == 3) {
            if (!cRecord.containsKey(comp503.getPaperName())) {
                if (semInput == 1) {
                    sInput = checkInput.readInt(scan, "Please select a stream: \n" + comp503.getStreamCodes());
                    while (!check) {
                        if (sInput >= 10 && sInput <= 12) {
                            check = true;
                        }
                        if (sInput <= 9 || sInput >= 13) {
                            System.out.println("\nInvalid Selection! Try again\n");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(GeneratePapers.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            sInput = checkInput.readInt(scan, "Please select a stream: \n" + comp503.getStreamCodes());
                            check = false;
                        }
                    }
                    cRecord.put(comp503.getPaperName(), new SCOMP503().getStreams(sInput));
                    ++paperSize;
                }
                if (semInput == 2) {
                    sInput = checkInput.readInt(scan, "Please select a stream: \n" + comp503.getStreamCodes2());
                    while (!check) {
                        if (sInput >= 50 && sInput <= 52) {
                            check = true;
                        }
                        if (sInput <= 49 || sInput >= 53) {
                            System.out.println("\nInvalid Selection! Try again\n");
                            try {
                                Thread.sleep(1000);
                            } catch (InterruptedException ex) {
                                Logger.getLogger(GeneratePapers.class.getName()).log(Level.SEVERE, null, ex);
                            }
                            sInput = checkInput.readInt(scan, "Please select a stream: \n" + comp503.getStreamCodes2());
                            check = false;
                        }
                    }
                    cRecord.put(comp503.getPaperName(), new SCOMP503().getStreams(sInput));
                    ++paperSize;
                }
            }
        }

        if (pInput == 7 && mInput == 4 && semInput == 2) {
            if (!cRecord.containsKey(comp517.getPaperName())) {
                sInput = checkInput.readInt(scan, "Please select a stream: \n" + comp517.getStreamCodes());
                while (!check) {
                    if (sInput >= 50 && sInput <= 53) {
                        check = true;
                    }
                    if (sInput <= 49 || sInput >= 54) {
                        System.out.println("\nInvalid Selection! Try again\n");
                        try {
                            Thread.sleep(1000);
                        } catch (InterruptedException ex) {
                            Logger.getLogger(GeneratePapers.class.getName()).log(Level.SEVERE, null, ex);
                        }
                        sInput = checkInput.readInt(scan, "Please select a stream: \n" + comp517.getStreamCodes());
                        check = false;
                    }
                }
                cRecord.put(comp517.getPaperName(), new SCOMP517().getStreams(sInput));
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
