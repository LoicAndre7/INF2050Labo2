public class FizzBuzz {

    public static int max = 100;


    public static void main(String[] args) {
        String mot;

        for (int i = 1; i <= FizzBuzz.max; i++) {

            mot = "";

            if (i % 3 == 0) {
                mot = "Fizz";
            }

            if (i % 5 == 0) {
                mot = "Buzz";
            }

            if (i % 3 == 0 && i % 5 == 0) {
                mot = "FizzBuzz";
            }

            System.out.println(i + " : " + mot);
        }

    }
}
