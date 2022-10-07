import java.io.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class SearchWord {


    List<Phone> phoneList = new ArrayList<>();

















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
                    String[] phoneProps = str.split(",");
                    //0 for brand, 1 for model, 2 for released date, 3 for resolution, 4 for os
                    //System.out.println(phoneProps[0]); // show us mobile brands

                    phoneList.add(new Phone(phoneProps[0], phoneProps[1], phoneProps[2], phoneProps[3], phoneProps[4]));
                    System.out.println(phoneList.toString());

                    //if(str.contains(searchWord)) System.out.println(str);
                }
                bReader.close();
                fReader.close();
            } catch(IOException ex) {
                ex.printStackTrace();
            }
        }
    }
}
