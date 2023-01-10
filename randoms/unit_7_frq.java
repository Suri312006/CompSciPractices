package randoms;

import java.util.ArrayList;

public class unit_7_frq {

    public unit_7_frq(String first, String last){
        ArrayList possibleNames = new ArrayList<String>();
        for(int i= 0; i<first.length(); i++){
            possibleNames.add(last+first.substring(0, i+1));
        }
    }
}
