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
public class COMP501 extends Paper {

    String streamCodes = "10 | 11 | 12 | 13 | 14 | 15";
    String streamCodes2 = "50 | 51 | 52 ";
    int points = 15;

    public COMP501() {
        super("COMP501 Computing Technology in Society");
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

