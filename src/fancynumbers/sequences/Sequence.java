package fancynumbers.sequences;

import java.util.ArrayList;

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
    
    abstract protected void initializeSequence();
}
