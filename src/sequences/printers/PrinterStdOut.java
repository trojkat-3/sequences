package sequences.printers;

/**
 *
 * @author xenon
 */
public class PrinterStdOut extends Printer {

    @Override
    void output(String str) {
        System.out.println(str);
    }
    
}
