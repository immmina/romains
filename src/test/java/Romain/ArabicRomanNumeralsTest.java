package Romain;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import static org.junit.jupiter.api.Assertions.assertEquals;
import java.util.Collection;
public class ArabicRomanNumeralsTest {
   @Test
            void romains() {
        //given
        List<String> expectedRomain = new ArrayList<String>();
       expectedRomain.add("I");
        //when
        List<String> actualRomain = ArabicRomanNumerals.convert(1);
        //then
        assertEquals(expectedRomain,actualRomain, "gg");

    }

   @Test
    void romains2() {
        //given
        List<String> expectedRomain = Collections.singletonList("II");
        //when
        List<String> actualRomain = ArabicRomanNumerals.convert(2);
        //then
        assertEquals(expectedRomain,actualRomain, "gg");

    }
    @Test


    void romains3() {
        //given
        List<String> expectedRomain =  new ArrayList<String>();
        expectedRomain.add("X");
        //when
        List<String> actualRomain = ArabicRomanNumerals.convert(10);
        //then
        assertEquals(expectedRomain,actualRomain, "gg");

    }
    @Test
    void romains4() {
        // given
        List<String> expectedRomain = new ArrayList<String>();
        expectedRomain.add("V");
        expectedRomain.add("I");
        expectedRomain.add("I");
        expectedRomain.add("I");
        // when
        List<String> actualRomain = ArabicRomanNumerals.convert(8);
        // then
        assertEquals(expectedRomain, actualRomain, "Test for 8 failed!");
    }
    @Test
    void romains6() {
        // given
        List<String> expectedRomain = new ArrayList<String>();
        expectedRomain.add("V");
        expectedRomain.add("I");
        // when
        List<String> actualRomain = ArabicRomanNumerals.convert(6);
        // then
        assertEquals(expectedRomain, actualRomain, "Test for 6 failed!");
    }
    @Test
    void romains11() {
        // given
        List<String> expectedRomain = new ArrayList<String>();
        expectedRomain.add("X");
        expectedRomain.add("I");
        // when
        List<String> actualRomain = ArabicRomanNumerals.convert(11);
        // then
        assertEquals(expectedRomain, actualRomain, "Test for 11 failed!");
    }
    @Test
    void romains23() {
        // given
        List<String> expectedRomain = new ArrayList<String>();
        expectedRomain.add("X");
        expectedRomain.add("X");
        expectedRomain.add("III");
        // when
        List<String> actualRomain = ArabicRomanNumerals.convert(23);
        // then
        assertEquals(expectedRomain, actualRomain, "Test for 23 failed!");
    }
    @Test
    void romains39() {
        // given
        List<String> expectedRomain = new ArrayList<>();
        expectedRomain.add("X");
        expectedRomain.add("X");
        expectedRomain.add("X");
        expectedRomain.add("I");
        expectedRomain.add("X");
        // when
        List<String> actualRomain = ArabicRomanNumerals.convert(39);
        // then
        assertEquals(expectedRomain, actualRomain, "Test for 39 failed!");
    }

/*
    @Test
    void testConvert() {
        assertEquals(List.of("I"), ArabicRomanNumerals.convert(1));
        assertEquals(List.of("II"), ArabicRomanNumerals.convert(2));
        assertEquals(List.of("III"), ArabicRomanNumerals.convert(3));
        assertEquals(List.of("I", "V"), ArabicRomanNumerals.convert(4));
        assertEquals(List.of("V"), ArabicRomanNumerals.convert(5));
        assertEquals(List.of("V", "I"), ArabicRomanNumerals.convert(6));
        assertEquals(List.of("V", "II"), ArabicRomanNumerals.convert(7));
        assertEquals(List.of("V", "III"), ArabicRomanNumerals.convert(8));
        assertEquals(List.of("I", "X"), ArabicRomanNumerals.convert(9));
    }*/
}
