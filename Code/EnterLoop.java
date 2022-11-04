import java.util.Scanner;
public class EnterLoop {
    public static void main (String [] args) {

        String enter;
        int i;

            Scanner input = new Scanner (System.in);

            System.out.print("Enter your sentence: ");
            enter = input.nextLine();
            System.out.print("Enter your chosen maximum number: ");
            i = input.nextInt();
            System.out.println("");

            int r = 1;
            while (r <= i) {
                System.out.println(enter);
                r++;
            }
    }
}
