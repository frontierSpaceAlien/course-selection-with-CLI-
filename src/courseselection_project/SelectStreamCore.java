/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseselection_project;

import courseselection_project.checkstreaminput.PaperCoreSix;
import courseselection_project.checkstreaminput.PaperCoreTwo;
import courseselection_project.checkstreaminput.PaperCoreFive;
import courseselection_project.checkstreaminput.PaperCoreFour;
import courseselection_project.checkstreaminput.CheckStreamInput;
import courseselection_project.checkstreaminput.PaperSeven;
import courseselection_project.checkstreaminput.PaperCoreThree;
import courseselection_project.checkstreaminput.PaperCoreOne;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

/**
 *
 * @author Derek Lien
 */
public class SelectStreamCore {

    Map<String, ArrayList<String>> cRecord = new HashMap<String, ArrayList<String>>();
    GeneratePapers getPRecord = new GeneratePapers();
    Scanner scan = new Scanner(System.in);
    int sInput;
    int paperSize;

    /* selectStreamCore checks the user input and calls CheckStreamInput. It sends the relevant 
    data through to CheckStreamInput such as the paper input, major input and semester input.
    The method then saves the chosen streams and paper in cRecord.
    */
    
    public void selectStreamCore(int pInput, int mInput, int semInput) {
        paperSize = 0;
        cRecord.putAll(getPRecord.getPaperSelect());

        switch (pInput) {
            case 1:
                CheckStreamInput check = new PaperCoreOne();
                check.getUserPaper(pInput, mInput, semInput);
                cRecord.putAll(check.getCRecord());
                paperSize = check.getPaperSize();
                break;

            case 2:
                CheckStreamInput check2 = new PaperCoreTwo();
                check2.getUserPaper(pInput, mInput, semInput);
                cRecord.putAll(check2.getCRecord());
                paperSize = check2.getPaperSize();
                break;

            case 3:
                CheckStreamInput check3 = new PaperCoreThree();
                check3.getUserPaper(pInput, mInput, semInput);
                cRecord.putAll(check3.getCRecord());
                paperSize = check3.getPaperSize();
                break;

            case 4:
                CheckStreamInput check4 = new PaperCoreFour();
                check4.getUserPaper(pInput, mInput, semInput);
                cRecord.putAll(check4.getCRecord());
                paperSize = check4.getPaperSize();
                break;

            case 5:
                CheckStreamInput check5 = new PaperCoreFive();
                check5.getUserPaper(pInput, mInput, semInput);
                cRecord.putAll(check5.getCRecord());
                paperSize = check5.getPaperSize();
                break;

            case 6:
                CheckStreamInput check6 = new PaperCoreSix();
                check6.getUserPaper(pInput, mInput, semInput);
                cRecord.putAll(check6.getCRecord());
                paperSize = check6.getPaperSize();
                break;

            case 7:
                CheckStreamInput check7 = new PaperSeven();
                check7.getUserPaper(pInput, mInput, semInput);
                cRecord.putAll(check7.getCRecord());
                paperSize = check7.getPaperSize();
                break;
        }

    }

    /* returns cRecord for other classes.
    */
    public Map<String, ArrayList<String>> getCRecord() {
        return cRecord;
    }

    /* returns paperSize which is used for the while loop in GeneratePapers.
    */
    public int getPaperSize() {
        return paperSize;
    }

}
