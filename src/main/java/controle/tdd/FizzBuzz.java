package controle.tdd;

public class FizzBuzz {

    public static String nombre(int nbr) {
        if(nbr==1 || nbr==2 ||nbr==4){
        return String.valueOf(nbr);}
        if (nbr % 3 == 0 && nbr % 5 == 0) {
            return "FizzBuzz"; // Divisible par 3 et 5
        }
        if (nbr % 3 == 0) {
            return "Fizz";
        } else if (nbr % 5 == 0) {
            return "Buzz";
        }
        else {
            return String.valueOf(nbr);
        }
    }
}
