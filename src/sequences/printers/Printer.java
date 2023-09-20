
package sequences.printers;

import java.util.ArrayList;
import java.util.Collections;
import sequences.sequence.Sequence;

/**
 *
 * @author xenon
 */
abstract public class Printer {
    
    private static final int NUM_IN_LINE = 16;
    //private static final boolean WRITE_TO_FILE = false;
    
    abstract void output(String str);
    
    private static int getNumberOfDigits(int n) {
        int nd = 0;
        while (n > 0) {
            nd++;
            n = (n - n % 10) / 10;
        }
        return nd;
    }
    
    public String print(Sequence sq) {
        String listStr ="----\n"+ sq.getName()+":\n";
        ArrayList<Integer> sqList=sq.getSequence();
        int max = Collections.max(sqList);
        int maxLength = getNumberOfDigits(max);
        // Some fun with numbers
        for (int i = 0; i < sqList.size(); i++) {
            int number = sqList.get(i);
            int ndi = getNumberOfDigits(number);
            //if (ndi < maxLength) {
            for (int j = 0; j < maxLength - ndi; j++) {
                listStr += " ";
            }
            //}
            listStr += Integer.toString(number);
            listStr += ", ";
            if ((i + 1) % NUM_IN_LINE == 0) { //0==0 mod 20
                listStr += "\n";
            }
        }
        listStr = listStr.substring(0, listStr.length() - 2);
        listStr += "\n";
        output(listStr);
        return listStr;
    }
    
    public String PrintDecomposition(ArrayList<Integer> list){
        int n=0;
        String str="";
        for (int i: list){
            n+=i;
            str+="+"+i;
        }
        str=n+"="+str.substring(1); //we cut the first+
        output(str);
        return str;
    }
    
}
