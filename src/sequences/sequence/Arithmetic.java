/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package sequences.sequence;

import sequences.exceptions.OutOfBoundsException;

/**
 *
 * @author xenon
 */
public class Arithmetic extends Sequence {
    int a1;
    int r;
    
    public Arithmetic(int a1, int r) {
        super("Arithmetic (a_1="+a1+",r="+r+")");
        this.a1=a1;
        this.r=r;
        initializeSequence();
    }

    @Override
    final protected void initializeSequence() {
        int i=1;
        int an;
        while ((an=a1+(i-1)*r)<=max) {
            sequence.add(an);
            i++;
        }
    }
    
    @Override
    public int getSum(int n) throws OutOfBoundsException{
        return (2*a1+(n-1)*r)*n/2;
    }
    
}
