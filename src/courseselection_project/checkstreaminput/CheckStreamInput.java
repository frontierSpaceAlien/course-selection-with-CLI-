/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package courseselection_project.checkstreaminput;

import java.util.ArrayList;
import java.util.Map;

/**
 *
 * @author Derek Lien
 */

/* all classes that implements the CheckStreamInput have the exact same method functionality.
The only class that is slightly different is the PaperSeven class. 
*/

public interface CheckStreamInput {

    public void getUserPaper(int pInput, int mInput, int semInput);

    public int getPaperSize();

    public Map<String, ArrayList<String>> getCRecord();
}
