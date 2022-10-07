import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class SearchWord {
    void readAndSearch() {
        String str = "";
        String searchWord = "";

        while(!searchWord.equals("exit")) {
            System.out.println("Enter a word to search: ");
            Scanner scanner = new Scanner(System.in);
            searchWord = scanner.nextLine();
            try {
                File file = new File("src/phones.txt");
                FileReader fReader = new FileReader(file);
                BufferedReader bReader = new BufferedReader(fReader);

                while((str=bReader.readLine())!=null) {
                    if(str.contains(searchWord)) System.out.println(str);
                }
                bReader.close();
                fReader.close();
            } catch(IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
