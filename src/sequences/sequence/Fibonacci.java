
package sequences.sequence;

/**
 *
 * @author xenon
 */
public class Fibonacci extends Sequence {
    
    int[] beginning=new int[2];
        
    private int fibonacci(int n){ 
        if (n<=1) {
            return beginning[n];
        } 
        if (sequence.size()>n){
            return sequence.get(n);
        }    
        return fibonacci(n-1)+fibonacci(n-2);
        
    }

    public Fibonacci(){
        this(0,1);
    }
    
    public Fibonacci(int f0,int f1) {
        super("Fibonacci ("+f0+","+f1+")");
        beginning[0]=f0;
        beginning[1]=f1;
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
