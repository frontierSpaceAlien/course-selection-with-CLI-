/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseselection_project.courses;

import java.util.ArrayList;

/**
 *
 * @author Derek Lien
 */
public class SCOMP517 implements Streams {

    ArrayList<String> sRecord = new ArrayList<String>();

    @Override
    public ArrayList<String> getStreams(int input) {
        switch (input) {
            case 10:
                this.sRecord.add("TUE 6:00pm - 8:00pm");
                this.sRecord.add("WED 10:00am - 12:00pm");
                break;

            case 11:
                this.sRecord.add("TUE 6:00pm - 8:00pm");
                this.sRecord.add("WED 3:00pm - 5:00pm");
                break;
                
            case 12:
                this.sRecord.add("MON 6:00pm - 8:00pm");
                this.sRecord.add("TUE 6:00pm - 8:00pm");
                break;
                
            case 13:
                this.sRecord.add("TUE 12:00pm - 2:00pm");
                break;
                
            case 50:
                this.sRecord.add("TUE 6:00pm - 8:00pm");
                this.sRecord.add("WED 10:00am - 12:00pm");
                break;
                
            case 51:
                this.sRecord.add("TUE 6:00pm - 8:00pm");
                this.sRecord.add("WED 3:00pm - 5:00pm");
                break;
                
            case 52:
                this.sRecord.add("MON 6:00pm - 8:00pm");
                this.sRecord.add("TUE 6:00pm - 8:00pm");
                break;
                
                
            case 53:
                this.sRecord.add("TUE 12:00pm - 2:00pm");
                break;
        }

        return sRecord;
    }

}
