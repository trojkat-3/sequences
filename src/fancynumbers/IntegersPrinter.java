package fancynumbers;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;

/**
 *
 * @author xenon
 */
public class IntegersPrinter {
    
    private static final int NUM_IN_LINE = 16;
    //private static final boolean WRITE_TO_FILE = false;
    
    private String filename;
    
    public IntegersPrinter(String filename){
        this.filename=filename;
    }
    
    public IntegersPrinter(){
        this.filename=null;
    }
    
    private static int getNumberOfDigits(int n) {
        int nd = 0;
        while (n > 0) {
            nd++;
            n = (n - n % 10) / 10;
        }
        return nd;
    }

    public void printIntegers(ArrayList<Integer> listToOutput) {
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
        if (filename!=null) {
            try (FileWriter fr = new FileWriter(filename);) {
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
}
