package sequences.sequence;

import java.util.ArrayList;
import java.util.Collections;
import sequences.exceptions.OutOfBoundsException;

/**
 *
 * @author xenon
 */
abstract public class Sequence {
    protected int max = 1000;
    protected String name;
    protected ArrayList<Integer> sequence=new ArrayList<>();
    
    public Sequence(String name){
        this.name=name;
    }
 
    public String getName(){
        return name+" [max:"+max+"]";
    }
    
    public ArrayList<Integer> getSequence(){
        return sequence;
    }
    
    public void setMax(int max){
        this.max=max;
        sequence.clear();
        initializeSequence();
    }
    
    public int getSum(int n) throws OutOfBoundsException {
        if (n>sequence.size()){
            throw new OutOfBoundsException("In the `sum` function, max: ["+sequence.size()+"].",n);
        }
        int sum=0;
        for (int i=0;i<n;i++){
            sum+=sequence.get(i);
        }
        return sum;
    }
    
    public ArrayList<Integer> decompose(int n){
        ArrayList<Integer> lst=new ArrayList<>(sequence); //shallow copy
        Collections.sort(lst, Collections.reverseOrder()); //descending
        ArrayList<Integer> ret=new ArrayList<>();
        int i=0;
        while (n>0 && i<lst.size()){
            if (lst.get(i)<=n){
                ret.add(lst.get(i));
                n-=lst.get(i);
            } else {
                i++;
            }
        }
        //TODO: if (n>0) => exception
        return ret;
    }
    
    abstract protected void initializeSequence();
}
