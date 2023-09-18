package fancynumbers;

//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author xenon
 */
public class FancyNumbers {

    static final int MAX = 1000;
    static final int NUM_IN_LINE = 16;
    static final int MAX_LENGTH = getNumberOfDigits(MAX);
    static final boolean WRITE_TO_FILE = false;

    static int getNumberOfDigits(int n) {
        int nd = 0;
        while (n > 0) {
            nd++;
            n = (n - n % 10) / 10;
        }
        return nd;
    }

    static void printIntegers(ArrayList<Integer> listToOutput) {
        String listStr = "";
        int max = Collections.max(listToOutput);
        int maxLength = getNumberOfDigits(max);
        // Some fun with numbers
        for (int i = 0; i < listToOutput.size(); i++) {
            int number = listToOutput.get(i);
            int ndi = getNumberOfDigits(number);
            //if (ndi < maxLength) {
            for (int j = 0; j < maxLength - ndi; j++) {
                listStr += " ";
            }
            //}
            listStr += Integer.toString(number);
            listStr += ", ";
            if ((i + 1) % NUM_IN_LINE == 0) { //0==0 mod 20
                listStr += "\n";
            }
        }
        listStr = listStr.substring(0, listStr.length() - 2);
        listStr += "\n";
        if (WRITE_TO_FILE) {
            try (FileWriter fr = new FileWriter("output/integers.txt");) {
                /*File f = new File("output/integers.txt");
            if (f.createNewFile()) {
                System.out.println("File created: '" + f.getName() + "'");
            } else {
                System.out.println("File '" + f.getName() + "' already exists.");
            }
            FileWriter fr = new FileWriter(f);*/
                fr.write("");
                fr.write(listStr);
                //fr.close();
            } catch (IOException e) {
                System.out.println("Unable to write to file.");
            }
        } else {
            System.out.println(listStr);
        }
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<Integer>();
        for (int i = 1; i <= MAX; i++) {
            list.add(i);
        }
        printIntegers(list);

        list.clear();
        for (int i = 1; i * i <= MAX; i++) {
            list.add(i * i);
        }
        printIntegers(list);
    }
}
