import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        while (true) {
            try {
                Scanner input = new Scanner(System.in);

                System.out.println("Hvad hedder du? ");
                String name = input.nextLine();
                System.out.println("Hvor gammel er du?");
                int age = input.nextInt();
                System.out.println("Hej " + name + " du er " + age + " år gammel!");
                break;
            } catch (InputMismatchException e) {
                System.out.println("Det er ikke et tal, prøv igen.");
            }
        }
    }
}
