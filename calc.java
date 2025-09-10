import java.util.*;
public class L10 {
    public static void main(String[] args) {

        System.out.println("Choose below:\n");
        System.out.println(" 1. Addition");
        System.out.println(" 2. Subtraction");
        System.out.println(" 3. Multiplication");
        System.out.println(" 4. Division\n");
        System.out.print("Your choice?");

        Scanner reader = new Scanner(System.in);
        int a = reader.nextInt();

        System.out.print("\nEnter first operand.");
        double a1 = reader.nextDouble();
        System.out.print("\nEnter second operand.");
        double a2 = reader.nextDouble();

        System.out.println("");

        switch (a) {
            case 1:
                System.out.println(a1 + " plus " + a2 + " = " + (a1+a2));
                break;
            case 2:
                System.out.println(a1 + " minus " + a2 + " = " + (a1-a2));
                break;
            case 3:
                System.out.println(a1 + " times " + a2 + " = " + (a1*a2));
                break;
            case 4:
                System.out.println(a1 + " divided by " + a2 + " = " + (a1/a2));
                break;
            default:
                System.out.println("Only type 1,2,3,4!");
        }
    }
}