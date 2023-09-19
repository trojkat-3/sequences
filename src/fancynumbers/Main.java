package fancynumbers;

//import java.io.File;
import fancynumbers.sequences.Fibonacci;
import fancynumbers.sequences.Integers;
import fancynumbers.sequences.Primes;
import fancynumbers.sequences.Sequence;
import fancynumbers.sequences.Squares;
import java.util.ArrayList;

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
        
        IntegersPrinter printerFile=new IntegersPrinter("output/sequences.txt");
        IntegersPrinter printerStdOut=new IntegersPrinter();
        
        //Integers
        Sequence sq=new Integers();
        printerFile.print(sq);
        printerStdOut.print(sq);
        //Squares
        sq=new Squares();
        printerFile.print(sq);
        printerStdOut.print(sq);
        //Primes
        sq=new Primes();
        printerFile.print(sq);
        printerStdOut.print(sq);
        //Fibonacci
        sq=new Fibonacci();
        printerFile.print(sq);
        printerStdOut.print(sq);
    }
}
