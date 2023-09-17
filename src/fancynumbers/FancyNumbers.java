package fancynumbers;

/**
 *
 * @author xenon
 */
public class FancyNumbers {
    
    static final int MAX=50;
    static final int NUM_IN_LINE=18;
    static final int MAX_LENGTH=getNumberOfDigits(MAX);

    static int getNumberOfDigits(int n){
        int nd=0;
        while (n>0){
            nd++;
            n=(n-n%10)/10;
        }
        return nd;
    }
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Some fun with numbers
        for (int i=1;i<MAX;i++){
            int ndi=getNumberOfDigits(i); 
            if (ndi<MAX_LENGTH){
                for (int j=0;j<MAX_LENGTH-ndi;j++){
                    System.out.print(" ");
                }
            } 
            System.out.print(i);
            if (i<MAX-1){
                System.out.print(", ");
            }
            if (i % NUM_IN_LINE==0){
                System.out.print("\n");
            }
        }
        System.out.print("\n");
    }
}
