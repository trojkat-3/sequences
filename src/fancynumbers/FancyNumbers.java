package fancynumbers;

//import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author xenon
 */
public class FancyNumbers {

    static final int MAX = 50;
    static final int NUM_IN_LINE = 18;
    static final int MAX_LENGTH = getNumberOfDigits(MAX);

    static int getNumberOfDigits(int n) {
        int nd = 0;
        while (n > 0) {
            nd++;
            n = (n - n % 10) / 10;
        }
        return nd;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try(FileWriter fr = new FileWriter("output/integers.txt");) {
            /*File f = new File("output/integers.txt");
            if (f.createNewFile()) {
                System.out.println("File created: '" + f.getName() + "'");
            } else {
                System.out.println("File '" + f.getName() + "' already exists.");
            }
            FileWriter fr = new FileWriter(f);*/
            fr.write("");
            // Some fun with numbers
            for (int i = 1; i < MAX; i++) {
                int ndi = getNumberOfDigits(i);
                if (ndi < MAX_LENGTH) {
                    for (int j = 0; j < MAX_LENGTH - ndi; j++) {
                        fr.append(" ");
                    }
                }
                fr.append(Integer.toString(i));
                if (i < MAX - 1) {
                    fr.append(", ");
                }
                if (i % NUM_IN_LINE == 0) {
                    fr.append("\n");
                }
            }
            fr.append("\n");
            //fr.close();
        } catch (IOException e) {
            System.out.println("Unable to write to file.");
        } 
    }
}
