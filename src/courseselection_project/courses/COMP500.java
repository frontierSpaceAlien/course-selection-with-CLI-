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
public class COMP500 extends Paper {

    private final String streamCodes = "10 | 11 | 12 | 13 | 14 | 15 | 16 | 17";
    private final String streamCodes2 = "50 | 51 | 52 | 53 | 54";
    int points = 15;

    public COMP500() {
        super("COMP500 Programming Concepts and Techniques");
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

