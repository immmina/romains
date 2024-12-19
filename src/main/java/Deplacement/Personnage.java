package Deplacement;

public class Personnage {
    private int R = 0;

    public String tourner(int nbr) {
      /*  String r="NORD";
       if (nbr == 1)
            r="EST";
        if (nbr == 2)
            r="SUD";
        if (nbr == 3)
            r="OUEST";*/

        R = (R + nbr) % 4;
        switch (R) {
            case 0: return "NORD";
            case 1: return "EST";
            case 2: return "SUD";
            case 3: return "OUEST";
            default: return "NORD";
}

    }
}