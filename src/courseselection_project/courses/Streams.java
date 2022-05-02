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

/* classes: SCOMP500, SCOMP501, SCOMP503, SCOMP504, SCOMP507, SCOMP508,
SCOMP517, SDIGD507, SINFS502, SMATH503. The aforementioned classes implements Streams.
Each class has their own respective times according to the semester.
*/
public interface Streams {
    ArrayList<String> getStreams(int input);
}

