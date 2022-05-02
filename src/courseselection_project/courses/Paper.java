/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseselection_project.courses;

/**
 *
 * @author Derek Lien
 */

/* classes: COMP500, COMP501, COMP503, COMP504, COMP507, COMP508, COMP517, DIGD507, 
INFS502, MATH503. The aforementioned classes are subclasses of the Paper class. 
*/
public abstract class Paper {

    private String paperName;

    /* constructs Paper.
    */
    public Paper(String pName) {
        this.paperName = pName;
    }

    /**
     * @return the paperName
     */
    public String getPaperName() {
        return this.paperName;
    }

    public abstract String getStreamCodes();
    
    public abstract String getStreamCodes2();

    public abstract int getPoints();
}
