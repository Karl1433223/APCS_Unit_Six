import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;


public class SpellChecker {
    public static String[] getDictionary() throws IOException {
        String[] a = new String[61336];
        for(int i = 0; i < 61336; i++) {
           a[i] = file.words();
        }
        return a;
    }
    public static int wordInDictionary(String word, String[] a)
    {
        int min = 0;
        int max = a.length - 1;
        while (min < max)
        {
            int mid = (min + max) / 2;
            if (a[mid].compareTo(word) > 0)
                max = mid - 1;
            else if (a[mid].compareTo(word) == 0)
                return 0;
            else
                min = mid + 1;
        }
        return -1;

    }
    public static void main(String[] args) throws IOException
    {
        String[] a = getDictionary();
        String b = " ";
        Scanner scan = new Scanner(System.in);
        Scanner file = new Scanner(new File("files/alice.txt"));
        FileWriter newscan = new FileWriter("files/corrected.txt");
        int i = 0;
        while (i < 61336)
        {
            b = file.words(i);
            if (wordInDictionary(b, a) == -1)
            {
                System.out.println("The word: " + b + " is spelled incorrectly, Please type yes or no");
                String answer = scan.nextLine();
                if (answer.equals("yes"))
                {
                    System.out.println("Please enter the correct spelling: ");
                    newscan.print(scan.nextLine() + " ");
                }
                else
                {
                    newscan.print(b + " ");
                }
            }
            else
            {
                newscan.print(b + " ");
            }
        }
        newscan.close();
    }

}
