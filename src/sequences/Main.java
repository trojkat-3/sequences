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
        
        Printer printerFile=new PrinterFile("output/sequences.txt");
        Printer printerStdOut=new PrinterStdOut();
        
        //Integers
        Sequence sq=new Integers();
        printerFile.print(sq);
        //printerStdOut.print(sq);
        //Squares
        sq=new Squares();
        printerFile.print(sq);
        //printerStdOut.print(sq);
        //Primes
        sq=new Primes();
        //printerFile.print(sq);
        printerStdOut.print(sq);
        try {
        ArrayList decomposition=sq.decompose(32);
        printerStdOut.PrintDecomposition(decomposition);
        } catch(CantDecomposeException ex){
            System.out.println("We are alvie, but:\n"+ex.getMessage());
        }
        
        //Fibonacci
        sq=new Fibonacci();
        printerFile.print(sq);
        printerStdOut.print(sq);
        //Fibonacci 2
        /*sq=new Fibonacci(1,3);
        sq.setMax(3000);
        printerFile.print(sq);
        printerStdOut.print(sq);
        
        try {
        System.out.println("Sum: "+ sq.getSum(30));
        } catch(OutOfBoundsException ex) {
            System.out.println("The program is runnig ok, however:\n "+ex.getMessage());
        }
        
        sq=new Arithmetic(-7, 3);
        printerStdOut.print(sq);
        try {
        System.out.println("Suma: "+sq.getSum(10));
        } catch(OutOfBoundsException ex) {
            System.out.println("The program is runnig ok, however:\n "+ex.getMessage());
        }*/
    }
}
