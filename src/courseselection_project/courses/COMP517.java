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
public class COMP517 extends Paper {

    String streamCodes = "50 | 51 | 52 | 53";
    String streamCodes2 = "";
    int points = 15;

    public COMP517() {
        super("COMP517 Data Analysis");
    }

    @Override
    public String getStreamCodes() {
        return streamCodes;
    }
    
    @Override
    public String getStreamCodes2(){
        return streamCodes2;
    }

    @Override
    public int getPoints() {
        return this.points;
    }
}