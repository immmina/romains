package controle.tdd;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
public class FizzBuzzTest {
        @Test
        public void testFizz() {
            assertEquals("Fizz", FizzBuzz.nombre(3));   // Divisible par 3
            assertEquals("Fizz", FizzBuzz.nombre(6));   // Divisible par 3
            assertEquals("Fizz", FizzBuzz.nombre(9));   // Divisible par 3
        }

        @Test
        public void testBuzz() {
            assertEquals("Buzz", FizzBuzz.nombre(5));   // Divisible par 5
            assertEquals("Buzz", FizzBuzz.nombre(10));  // Divisible par 5
            assertEquals("Buzz", FizzBuzz.nombre(20));  // Divisible par 5
        }

        @Test
        public void testFizzBuzz() {
            assertEquals("FizzBuzz", FizzBuzz.nombre(15));  // Divisible par 3 et 5
            assertEquals("FizzBuzz", FizzBuzz.nombre(30));  // Divisible par 3 et 5
            assertEquals("FizzBuzz", FizzBuzz.nombre(45));  // Divisible par 3 et 5
        }

        @Test
        public void testNombre() {
            assertEquals("1", FizzBuzz.nombre(1));   // Pas divisible par 3 ni 5
            assertEquals("2", FizzBuzz.nombre(2));   // Pas divisible par 3 ni 5
            assertEquals("4", FizzBuzz.nombre(4));   // Pas divisible par 3 ni 5
        }
    }

