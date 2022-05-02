/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseselection_project;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Derek Lien
 */
public class WriteFile {

    /* WriteToFile method writes the final result of the user's chosen papers to file.
    The method also formats the student hashmap which allows for easier time reading 
    student info from file.
    */
    
    public void WriteToFile() {
        CourseSelection_Project saveResult = new CourseSelection_Project();
        Map<Map<Integer, String>, Map<String, ArrayList<String>>> saveStudentResult
                = new HashMap<Map<Integer, String>, Map<String, ArrayList<String>>>();

        try {
            FileOutputStream fos = new FileOutputStream("./resources/Student.txt", true);
            PrintWriter pw = new PrintWriter(fos);
            saveStudentResult = saveResult.getSaveStudentResult();

            for (Map.Entry<Map<Integer, String>, Map<String, ArrayList<String>>> e : saveStudentResult.entrySet()) {
                String replaceFormat = e.getKey().toString().replace("{", "").replace("}", "");
                pw.println(replaceFormat);
                for (Map.Entry<String, ArrayList<String>> f : e.getValue().entrySet()) {
                    pw.println(f);
                }

            }
            pw.println("\n");
            pw.close();

        } catch (FileNotFoundException ex) {
            System.out.println("File not found.");
        }

    }
}
