package Romain;

import java.util.ArrayList;
import java.util.List;

public class ArabicRomanNumerals {
    public static List<String>  convert(int nbr){
        List<String> st = new ArrayList<>();
       if (nbr >= 10) {
            int tens = nbr / 10;
            for (int i = 0; i < tens; i++) {
                st.add("X");
            }
            nbr %= 10;
        }
        if (nbr == 1) st.add("I");
        if (nbr == 2) st.add("II");
        if (nbr == 3) st.add("III");
        if (nbr == 4) { st.add("I"); st.add("V");}
        if (nbr == 9) { st.add("I"); st.add("X");}



        if (5 <= nbr && nbr <= 8) {
            st.add("V");
            for (int i = 1; i <= nbr - 5; i++) {
                st.add("I");
            }
        }


       /*if (nbr >= 1 && nbr <= 9) {
            if (nbr == 1) st.add("I");
            if (nbr == 2) st.add("II");
            if (nbr == 3) st.add("III");
            if (nbr == 4) { st.add("I"); st.add("V"); }
            if (nbr == 5) st.add("V");
            if (nbr == 6) { st.add("V"); st.add("I"); }
            if (nbr == 7) { st.add("V"); st.add("II"); }
            if (nbr == 8) { st.add("V"); st.add("III"); }
            if (nbr == 9) { st.add("I"); st.add("X"); }
        }
*/

        return st;



    }
}
