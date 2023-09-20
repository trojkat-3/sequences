package sequences.printers;

import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author xenon
 */
public class PrinterFile extends Printer {
 private String filename;
    
    public PrinterFile(String filename){
        this.filename=filename;
        try (FileWriter fr = new FileWriter(filename);) {
                fr.write("");
                //fr.close();
            } catch (IOException e) {
                System.out.println("Unable to write to file.");
            }
    }   

    @Override
    void output(String str) {
        try (FileWriter fr = new FileWriter(filename, true);) {
                /*File f = new File("output/integers.txt");
            if (f.createNewFile()) {
                System.out.println("File created: '" + f.getName() + "'");
            } else {
                System.out.println("File '" + f.getName() + "' already exists.");
            }
            FileWriter fr = new FileWriter(f);*/
                fr.append(str);
                //fr.close();
            } catch (IOException e) {
                System.out.println("Unable to write to file.");
            }
    }
}
