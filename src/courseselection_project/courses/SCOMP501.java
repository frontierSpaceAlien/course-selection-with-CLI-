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
public class SCOMP501 implements Streams {

    ArrayList<String> sRecord = new ArrayList<String>();

    @Override
    public ArrayList<String> getStreams(int input) {
        switch (input) {
            case 10:
                this.sRecord.add("TUE 10:00am - 12:00pm");
                this.sRecord.add("THU 8:00am - 10:00am");
                break;

            case 11:
                this.sRecord.add("TUE 10:00am - 12:00pm");
                this.sRecord.add("FRI 10:00am - 12:00pm");
                break;

            case 12:
                this.sRecord.add("TUE 10:00am - 12:00pm");
                break;

            case 13:
                this.sRecord.add("TUE 0:00am - 12:00pm");
                this.sRecord.add("FRI 12:00pm - 2:00pm");
                break;

            case 14:
                this.sRecord.add("TUE 10:00am - 12:00pm");
                this.sRecord.add("WED 4:00pm - 6:00pm");
                break;

            case 15:
                this.sRecord.add("TUE 10:00am - 12:00pm");
                break;
                
            case 50:
                this.sRecord.add("TUE 10:00am - 12:00pm");
                this.sRecord.add("THU 8:00am - 10:00am");
                break;

            case 51:
                this.sRecord.add("TUE 10:00am - 12:00pm");
                this.sRecord.add("FRI 10:00am - 12:00pm");
                break;

            case 52:
                this.sRecord.add("TUE 10:00am - 12:00pm");
                break;
        }
        return sRecord;
    }
}
