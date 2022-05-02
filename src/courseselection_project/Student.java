/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseselection_project;

/**
 *
 * @author Derek Lien
 */
public class Student {

    private String name;
    private int sID;

    /* constructor for student.
    */
    public Student(int sID, String name) {
        this.sID = sID;
        this.name = name;
    }

    public void setSID(int sID) {
        this.sID = sID;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return this.name;
    }

    public int getSID() {
        return this.sID;
    }
}
