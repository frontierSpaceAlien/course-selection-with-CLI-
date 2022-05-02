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
public class SCOMP500 implements Streams {

    ArrayList<String> sRecord = new ArrayList<String>();

    @Override
    public ArrayList<String> getStreams(int input) {

        switch (input) {
            case 10:
                this.sRecord.add("MON 8:00am - 9:00am");
                this.sRecord.add("WED 11:00am - 12:00pm");
                this.sRecord.add("FRI 9:00am - 10:00am");
                break;

            case 11:
                this.sRecord.add("MON 8:00am - 9:00am");
                this.sRecord.add("WED 11:00am - 12:00pm");
                this.sRecord.add("FRI 9:00am - 10:00am");
                break;

            case 12:
                this.sRecord.add("MON 8:00am - 9:00am");
                this.sRecord.add("WED 11:00am - 12:00pm");
                this.sRecord.add("THU 12:00pm - 3:00pm");
                this.sRecord.add("FRI 9:00am - 10:00am");
                break;

            case 13:
                this.sRecord.add("MON 8:00am - 9:00am");
                this.sRecord.add("WED 11:00am - 12:00pm");
                this.sRecord.add("FRI 9:00am - 10:00am");
                break;

            case 14:
                this.sRecord.add("MON 8:00am - 9:00am");
                this.sRecord.add("WED 8:00am - 11:00am");
                this.sRecord.add("FRI 9:00am - 10:00am");
                break;

            case 15:
                this.sRecord.add("MON 8:00am - 9:00am");
                this.sRecord.add("WED 11:00am - 12:00pm");
                this.sRecord.add("FRI 9:00am - 10:00am");
                break;

            case 16:
                this.sRecord.add("MON 8:00am - 9:00am");
                this.sRecord.add("WED 11:00am - 12:00pm");
                this.sRecord.add("THU 5:00pm - 8:00pm");
                this.sRecord.add("FRI 9:00am - 10:00am");
                break;

            case 17:
                this.sRecord.add("MON 8:00am - 9:00am");
                this.sRecord.add("WED 11:00am - 12:00pm");
                this.sRecord.add("FRI 9:00am - 10:00am");
                break;
                
            case 50:
                this.sRecord.add("MON 8:00am - 9:00am");
                this.sRecord.add("WED 11:00am - 12:00pm");
                this.sRecord.add("FRI 9:00am - 10:00am");
                break;

            case 51:
                this.sRecord.add("MON 8:00am - 9:00am");
                this.sRecord.add("WED 11:00am - 12:00pm");
                this.sRecord.add("FRI 9:00am - 10:00am");
                break;

            case 52:
                this.sRecord.add("MON 8:00am - 9:00am");
                this.sRecord.add("WED 11:00am - 12:00pm");
                this.sRecord.add("THU 12:00pm - 3:00pm");
                this.sRecord.add("FRI 9:00am - 10:00am");
                break;

            case 53:
                this.sRecord.add("MON 8:00am - 9:00am");
                this.sRecord.add("WED 11:00am - 12:00pm");
                this.sRecord.add("FRI 9:00am - 10:00am");
                break;

            case 54:
                this.sRecord.add("MON 8:00am - 9:00am");
                this.sRecord.add("WED 8:00am - 11:00am");
                this.sRecord.add("FRI 9:00am - 10:00am");
                break;

        }
        return sRecord;
    }
}
