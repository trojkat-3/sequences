package sequences;

import sequences.sequence.Sequence;
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
        try (FileWriter fr = new FileWriter(filename);) {
                fr.write("");
                //fr.close();
            } catch (IOException e) {
                System.out.println("Unable to write to file.");
            }
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

    public void print(Sequence sq) {
        String listStr ="----\n"+ sq.getName()+":\n";
        ArrayList<Integer> sqList=sq.getSequence();
        int max = Collections.max(sqList);
        int maxLength = getNumberOfDigits(max);
        // Some fun with numbers
        for (int i = 0; i < sqList.size(); i++) {
            int number = sqList.get(i);
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
            try (FileWriter fr = new FileWriter(filename, true);) {
                /*File f = new File("output/integers.txt");
            if (f.createNewFile()) {
                System.out.println("File created: '" + f.getName() + "'");
            } else {
                System.out.println("File '" + f.getName() + "' already exists.");
            }
            FileWriter fr = new FileWriter(f);*/
                fr.append(listStr);
                //fr.close();
            } catch (IOException e) {
                System.out.println("Unable to write to file.");
            }
        } else {
            System.out.println(listStr);
        }
    }
}
