package fancynumbers.sequences;

/**
 *
 * @author xenon
 */
public class Squares extends Sequence {

    public Squares() {
        super("Squares");
        initializeSequence();
    }

    @Override
    final protected void initializeSequence() {
        for (int i = 1; i * i <= max; i++) {
            sequence.add(i * i);
        }

    }

}
