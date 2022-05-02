/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseselection_project.courses;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 *
 * @author Derek Lien
 */
public class INFS502 extends Paper {

    Map<String, ArrayList<String>> time = new HashMap<String, ArrayList<String>>();
    String streamCodes = "50 | 51 | 52 ";
    String streamCodes2 = "";
    int points = 15;

    public INFS502() {
        super("INFS502 Digital Services in Information Technology");
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
