import java.util.Scanner; 

public class CharCount {

    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("enter sentence: ");
        String sentence = new Scanner(System.in).nextLine();

        int count[] = new int[256];
        int length = sentence.length();

        for (int i = 0; i < length; i++)
            count[sentence.charAt(i)]++;

        char chars[] = new char[sentence.length()];
        for (int i = 0; i < length; i++) {
            chars[i] = sentence.charAt(i);
            int find = 0;
            for (int j = 0; j <= i; j++) {

                if (sentence.charAt(i) == chars[j])
                    find++;
            }

            if (find == 1) {
               System.out.println("Occurrence of " + sentence.charAt(i) + " is:" + count[sentence.charAt(i)]);

            }
        }
    }
}