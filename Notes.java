//Eunice Chan
//2025-09-10

import java.util.*;
public class Notes {
    public static void main(String[] args) {

        Scanner a = new Scanner(System.in);
        System.out.println("How old are you?");
        int b = a.nextInt();

        if (b>=60) {
            System.out.println("You're old!");
        }
        else if (b>=60) {
            System.out.println("You're old!");
        }
        else if (b>=30) {
            System.out.println("You're middle-aged!");
        }
        else if (b>=20) {
            System.out.println("You're a young adult!");
        }
        else if (b>=13) {
            System.out.println("You're a teen!");
        }
        else {
            System.out.println("You're so young!");
        }

        Scanner c = new Scanner(System.in);
        System.out.println("What is your name?");
        String d = c.next();
        System.out.println("Nice to meet you, " + d + "!");

        //you can use switch and case for cleaner code and for fixed values while use if and else for conditions of variables
    }
}

