package sequences.sequence;

/**
 *
 * @author xenon
 */
public class Primes extends Sequence {

    public Primes(){
        super("Primes");
        initializeSequence();
    }
    
    private boolean isPrime(int n) {
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
    
    @Override
    final protected void initializeSequence() {
        for (int i = 1; i <= max; i++) {
            if (isPrime(i)) {
                sequence.add(i);   
            }
        }
    }
    
}
