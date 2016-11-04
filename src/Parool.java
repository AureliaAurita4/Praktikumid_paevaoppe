import lib.TextIO;

/**
 * Created by svetlana on 5.11.16.
 */
public class Parool {
    public static void main(String[] args) {

        String parool = "correct pass";

        while (true) {
            System.out.println("Insert password, please!");
            String kysiPass = TextIO.getlnString();

            if (parool.equals(kysiPass)) {
                System.out.println("Correct password");
                break;
            } else {
                System.out.println("The password is incorrect!");
            }
        }


    }
}
