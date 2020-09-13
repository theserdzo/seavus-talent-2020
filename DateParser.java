/*
Hint 1: The java.util.Scanner class offers a method for capturing a string from the console.
String str = new Scanner(System.in).nextLine();
Hint 2: String’s “substring” method is a convenient way for extracting a substring.
*/
import java.util.Scanner;

public class DateParser
{
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Please enter a date in dd/mm/yyyy format: ");
        
        String str = new Scanner(System.in).nextLine();
        for (String dates: str.split("/")) {
            System.out.println("\n"+dates);
        }
    }
}