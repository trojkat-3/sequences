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

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 1; i <= MAX; i++) {
            list.add(i);
        }
        IntegersPrinter.printIntegers(list);

        list.clear();
        for (int i = 1; i * i <= MAX; i++) {
            list.add(i * i);
        }
        IntegersPrinter.printIntegers(list);
        IntegersPrinter.
    }
}
