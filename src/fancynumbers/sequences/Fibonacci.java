
package fancynumbers.sequences;

/**
 *
 * @author xenon
 */
public class Fibonacci extends Sequence {
    
    private int fibonacci(int n){
        if (n<=1) {
            return n;
        } 
        if (sequence.size()>n){
            return sequence.get(n);
        }    
        return fibonacci(n-1)+fibonacci(n-2);
        
    }

    public Fibonacci(){
        super("Fibonacci");
        initializeSequence();
    }
    
    @Override
    final protected void initializeSequence() {
        int fib;
        int i=0;
        while((fib=fibonacci(i))<=max){
            sequence.add(fib);
            i++;
        }
    }
    
}
