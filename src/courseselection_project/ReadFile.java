/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseselection_project;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Derek Lien
 */
public class ReadFile {

    Map<Integer, String> userInfo = new HashMap<Integer, String>();
    Map<String, ArrayList<String>> paperInfo = new HashMap<String, ArrayList<String>>();
    CourseSelection_Project getUserInput = new CourseSelection_Project();
    ArrayList<String> replaceList = new ArrayList<String>();

    /* readFile reads everything from the student.txt file and saves it into 2 different hashmaps.
    This method also finds the correct user in the student.txt file and saves their respective papers
    into the paperInfo hashmap.
     */
    public void readFile() {
        FileReader input;
        try {
            input = new FileReader("./resources/Student.txt");
            BufferedReader inputStream = new BufferedReader(input);
            String fLine = null;

            while ((fLine = inputStream.readLine()) != null) {
                String newLine[] = fLine.split("=");

                if (newLine[0].equals(Integer.toString(getUserInput.getUserInput()))) {
                    userInfo.put(Integer.parseInt(newLine[0]), newLine[1]);

                    while (!"".equals(fLine = inputStream.readLine())) {
                        String line[] = fLine.split("=");
                        ArrayList<String> lineList = new ArrayList<String>(Arrays.asList(line[1]));
                        paperInfo.put(line[0], lineList);
                    }
                }
            }
            inputStream.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File not found!");
        } catch (IOException ex) {
            Logger.getLogger(ReadFile.class.getName()).log(Level.SEVERE, null, ex);
        }

    }

    /* getUserInfo so the hashmap can be used in other classes.
     */
    public Map<Integer, String> getUserInfo() {
        return userInfo;
    }

    /* same with getUserInfo. Allows the paperInfo to be used in other classes.
    */
    public Map<String, ArrayList<String>> getPaperInfo() {
        return paperInfo;
    }

}
