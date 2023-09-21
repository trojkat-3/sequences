package sequences;

//import java.io.File;
import sequences.sequence.Fibonacci;
import sequences.sequence.Integers;
import sequences.sequence.Primes;
import sequences.sequence.Sequence;
import sequences.sequence.Squares;
import java.util.ArrayList;
import sequences.exceptions.CantDecomposeException;
import sequences.exceptions.OutOfBoundsException;
import sequences.gui.MainFrame;
import sequences.printers.Printer;
import sequences.printers.PrinterFile;
import sequences.printers.PrinterStdOut;
import sequences.sequence.Arithmetic;

/**
 *
 * @author xenon
 */
public class Main {

    
    //static final int MAX_LENGTH = getNumberOfDigits(MAX);

    
    
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new MainFrame().setVisible(true);
            }
        });
    }
}
