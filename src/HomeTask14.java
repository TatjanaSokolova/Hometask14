import java.util.Scanner;

public class HomeTask14 {
    public static void main(String[] args) {
        String[] cities = {"Copenhagen", "Paris", "Tokyo", "Bristol",
                "Mumbai", "Delhi", "Riga", "Vienna", "Warsaw", "Hamburg", "Cesis" };
        int counter = 0;
        int counter2 = 0;
        int counter3 = 0;
        int counter4 = 0;
        int counter5 = 0;
        for (String city : cities) {
            //          if ((city.charAt(0) == 'C')) {   //Find out how many values are starting with ‘C’
            if (city.matches("^C.*")) {
                counter += 1;
            }
            if ((city.charAt(city.length() - 1) == 'i')) {    //Find out how many values are ending with “i”
                counter2 += 1;
            }
            if (city.length() == 5) {                 //Find out how many values are with length 5
                counter3 += 1;
            }
            if (city.contains("e")) {                   //Find out how many values consist of the character “e”
                counter4 += 1;
            }
            //Find out is there any element which consists of the subString “en”
            if (city.matches(".*en.*")) counter5 += 1;
        }
        System.out.println("There are " + counter + " cities starting with ‘C’");
        System.out.println("There are " + counter2 + " cities ending with ‘i’");
        System.out.println("There are " + counter3 + " cities with length 5");
        System.out.println("There are " + counter4 + " cities consist of the character “e”");
        System.out.println("There are " + counter5 + " cities consist of the character “en”");

        // Task *
        int[] length1 = new int[11];
        for (int i = 0; i <= length1.length - 1; i++) {
            length1[i] = cities[i].length();
        }
        for (int i = 0; i <= length1.length - 1; i++) {
            System.out.println(cities[i] + " = " + length1[i]);
        }
// validate the phone number with regex


        String[] phoneNumber = {"+45654345676", "+87659876567" };
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter  phone number : ");
        String phone2 = scanner.nextLine();

        if (phone2.matches("^[+]\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d\\d")) {
            System.out.println("Phone number " +phone2 + " is correct");
        }
    }
}
