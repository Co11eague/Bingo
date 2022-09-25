import java.util.Scanner;

public class Toolkit {
    private static final Scanner stdIn = new Scanner(System.in);

    /* TODO
          complete the GOODBYEMESSAGE
     */
    public static final String GOODBYEMESSAGE = "Thank you for playing\n";

    public static String getInputForMessage(String message) {
        System.out.println(message);
        String input = stdIn.nextLine();

        for (int i = 0; i < input.length(); i++) {
            if (input.charAt(i) != ' ') return input.trim();
        }

        return input;
    }

    public static String printArray(String[] array) {
        StringBuilder sb = new StringBuilder();


    /* TODO
        create a loop to print the numbers out once a user has inputted the BingoCard numbers, separated by commas (trim leading / trailing spaces)
        check the expected output here to ensure that it appears as it should
        return as a sb.toString()

   */

        for (int i = 0; i < array.length; i++) {
            //System.out.print(array[i].trim() + ", ");
            sb.append(array[i].trim());
            if (i + 1 != array.length) {
                sb.append(", ");
            }

        }

        return sb.toString();
    }
}
