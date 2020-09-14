import java.util.Scanner;
   class Numbers {
       public static void main(String[] args) {

         Scanner daynumber = new Scanner(System.in); // Print to screen, querying user
         System.out.println("Enter a number from 1 to 7");
         String j = daynumber.nextLine(); // Per requirements, obtain String
         Integer input = Integer.parseInt(j); // Convert String to Integer

         if (input == 1 ) { // Begin processing of input
            System.out.println("monday");
         }
         if (input == 2 ) {
            System.out.println("tuesday");
         }
         if (input == 3 ) {
            System.out.println("wednesday");
         }
         if (input == 4 ) {
            System.out.println("thursday");
         }
         if (input == 5 ) {
            System.out.println("friday");
         }
         if (input == 6 ) {
            System.out.println("saturday");
         }
         if (input == 7 ) {
            System.out.println("sunday");
         }
      }
   }