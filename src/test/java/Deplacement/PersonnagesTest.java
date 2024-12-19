package Deplacement;
import Romain.ArabicRomanNumerals;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Collection;
public class PersonnagesTest {

    @Test
    public void testTourner0() {
        Personnage p = new Personnage();
        assertEquals("NORD", p.tourner(0)); // Aucun changement
    }

    @Test
    public void testTourner1() {
        Personnage p = new Personnage();
        assertEquals("EST", p.tourner(1)); // 1 quart de tour
    }

    @Test
    public void testTourner4() {
        Personnage p = new Personnage();
        assertEquals("NORD", p.tourner(4)); // Retour au point de départ
    }

    @Test
    public void testTourner8() {
        Personnage p = new Personnage();
        assertEquals("NORD", p.tourner(8)); // 2 cycles complets
    }

    @Test
    public void testTourner100() {
        Personnage p = new Personnage();
        assertEquals("NORD", p.tourner(100)); // Grand nombre de tours
    }

}
