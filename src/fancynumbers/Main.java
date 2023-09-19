package fancynumbers;

//import java.io.File;
import java.util.ArrayList;

/**
 *
 * @author xenon
 */
public class Main {

    static final int MAX = 1000;
    //static final int MAX_LENGTH = getNumberOfDigits(MAX);

    static boolean isPrime(int n) {
        if (n<2) {
            return false;
        } 
        for (int i=2;i*i<=n;i++){
            if (n%i==0) {
                return false;
            }
        }
        return true;
    }
    
    static int fibonacci(int n, ArrayList<Integer> list){
        if (n<=1) {
            return n;
        } 
        if (list.size()>n){
            return list.get(n);
        }    
        return fibonacci(n-1,list)+fibonacci(n-2,list);
        
    }
        
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Integers
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= MAX; i++) {
            list.add(i);
        }
        IntegersPrinter printerFile=new IntegersPrinter("output/sequences.txt");
        IntegersPrinter printerStdOut=new IntegersPrinter();
        printerFile.print(list, "Integers");
        printerStdOut.print(list,"Integers");
        //Squares
        list.clear();
        for (int i = 1; i * i <= MAX; i++) {
            list.add(i * i);
        }
        printerFile.print(list, "Squares");
        printerStdOut.print(list, "Squares");
        //Primes
        list.clear();
        for (int i = 1; i <= MAX; i++) {
            if (isPrime(i)) {
                list.add(i);   
            }
        }
        printerFile.print(list, "Primes");
        printerStdOut.print(list," Primes");
        //Fibonacci
        list.clear();
        int fib;
        int i=0;
        while((fib=fibonacci(i,list))<=MAX){
            list.add(fib);
            i++;
        }
        printerFile.print(list, "Fibonacci numbers");
        printerStdOut.print(list, "Fibonacci numbers");
    }
}
