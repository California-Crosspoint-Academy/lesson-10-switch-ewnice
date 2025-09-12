//Eunice Chan
//2025-09-10

public class Exercise {
    public static void main(String[] args) {

        //question 1
        //int, byte, and short

        //question 2
        int x = 3, p = 5, y = -8;
        switch(x) {
            case 2:
            p++;
            case 3:
            case 4:
            y+=(--p);
            break;
            case 5:
            y+=(p++);
        }
        System.out.println(y); //print out -4 as x=3 so we use case 3 but there is nothing so it goes to case 4 where y=y+(p-1) which is -4

        //question 3
        int ya = 3;
        char myChar = 'G';
        switch (myChar) {
            case 'g':
            case 'G': 
            ++ya;
            break;
            case 'm':
            case 'M':
            --ya;
            break;
            default:
            ya+=100;
        }
        System.out.println(ya); //print out 4 as the character is G so ya would be incremented turning 3 into 4

        //question 4
        String s = "Green";
        int q = 0;
        switch(s) {
            case "Red":
            q++;
            case "Green":
            q++;
            case "Blue":
            q++;
            case "Yellow":
            q++;
            default:
            q++;
        }
        System.out.println(--q); //print out 3 as there were no breaks between cases so 0 was incremented 4 times and subtracted 1 at the end

        //question 5
        char chr = 'z';

        //question 6
        int xx = 10, yy = 12;
        System.out.println( "The sum is " + xx + yy); //print out The sum is 1012 as the addition sign without parentheses don't count as an operator
        System.out.println( "The sum is " + (xx + yy)); //print out The sum is 22

        //question 7
        int speed =69;
        switch (speed) {
            case 75: 
            System.out.println("Exceeding speed limit.");
            break;
            case 69:
            case 70:
            System.out.println("Getting close."); //print out getting close as speed int is set at 69
            break;
            case 65:
            System.out.println("Cruising.");
            break;
            default:
            System.out.println("Very slow.");
        }

        //question 8
        //no, it will just print out nothing if the number, character, or string is not included in one of the cases

        //question 9
        String ss = "X";
        char chrr = ss.charAt(0);
        System.out.println(chrr); //print out X which has now been stored as a character in the char variable type
    }
}