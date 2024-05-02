import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class WordCounter {
    public static void main(String[] args) {
        try {
            File Myfile = new File("Lincoln.txt");
            Scanner scanner = new Scanner(Myfile);
            int Wordcount = 0;
            while (scanner.hasNext()) {
                scanner.next(); 
                Wordcount++;
            }
            scanner.close();
            System.out.println("Number of words in the file: " + Wordcount);
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        }
    }
}
