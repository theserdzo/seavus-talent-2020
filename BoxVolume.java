import java.util.Scanner;
/*
Hint: The java.util.Scanner class offers a method for capturing a string from the console.
String str = new Scanner(System.in).nextInt();
*/
public class BoxVolume
{
 public static void main(String[] args)
 {
   int width, length, height;
   int volume;
   Scanner scan = new Scanner(System.in);
   
   System.out.println("Please enter the width of your box: ");
   width = scan.nextInt();
   
   System.out.println("Please enter the height of your box: ");
   height = scan.nextInt();
   
   System.out.println("Please enter the length of your box: ");
   length = scan.nextInt();
   
   volume = width * length * height;
      
   System.out.println("Box Dimensions: " );
   System.out.println("Height: " + height + " Width " + width + " Length " + length);
   System.out.println("Box Volume: " + volume);   
 } 
}
