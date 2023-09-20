package sequences;

//import java.io.File;
import sequences.sequence.Fibonacci;
import sequences.sequence.Integers;
import sequences.sequence.Primes;
import sequences.sequence.Sequence;
import sequences.sequence.Squares;
import java.util.ArrayList;
import sequences.exceptions.OutOfBoundsException;
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
        
        IntegersPrinter printerFile=new IntegersPrinter("output/sequences.txt");
        IntegersPrinter printerStdOut=new IntegersPrinter();
        
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
        printerFile.print(sq);
        printerStdOut.print(sq);
        ArrayList decomposition=sq.decompose(666);
        //Fibonacci
        /*sq=new Fibonacci();
        printerFile.print(sq);
        printerStdOut.print(sq);
        //Fibonacci 2
        sq=new Fibonacci(1,3);
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
