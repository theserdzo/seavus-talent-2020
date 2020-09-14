/***
Hint: The java.util.Scanner class offers a method for capturing a string from the console.
String str = new Scanner(System.in).nextInt();
***/
import java.util.Scanner;

public class BoxVolume
{
 public static void main(String[] args)
 {
   int width, height, depth;
   int volume;
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Enter width of your box: ");
   width = scan.nextInt();
   
   System.out.println("Enter height of your box: ");
   height = scan.nextInt();
   
   System.out.println("Enter depth of your box: ");
   depth = scan.nextInt();
   
   volume = width * depth * height;
      
   System.out.println("\nBox Dimensions: " );
   System.out.println("Height: " + height + ", Width: " + width + " and Depth: " + depth);
   System.out.println("\nBox Volume: " + volume);   
 } 
}
