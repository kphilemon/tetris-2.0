import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;

/**
 * This class encapsulates all the Tetrominoes (Tetris Blocks) creation logic
 * Tetrominoes include: I, J, L, O, S, T, Z Tetris blocks
 *
 * @author kphilemon
 */
public class Tetromino {

    private static final Integer[] NUMBERS_WITHIN_BLOCKS = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
    private int orientation;
    private int[] numbers;
    private String[] pattern;
    private ArrayList<int[]> coordinates;

    /**
     * Making this private so that we can encapsulate its creation logic
     * This is to ensure every Tetris block is generated randomly via the static factory method
     */
    private Tetromino() {
    }

    /**
     * The static factory method for generating new random Tetrominoes
     *
     * @return a random-generated Tetromino object
     */
    public static Tetromino create() {

        Tetromino t = new Tetromino();
        t.numbers = new int[4];
        t.pattern = new String[2];
        t.coordinates = new ArrayList<>();

        // generating non-repeating numbers for the numbers within blocks
        Collections.shuffle(Arrays.asList(NUMBERS_WITHIN_BLOCKS));
        for (int i = 0; i < t.numbers.length; i++) {
            t.numbers[i] = NUMBERS_WITHIN_BLOCKS[i];
        }

        Random r = new Random();
        int type = r.nextInt(7);
        switch (type) {
            case 0:
                // type I
                t.pattern[0] = "          ";
                t.pattern[1] = String.format(" %d %d %d %d  ", t.numbers[0], t.numbers[1], t.numbers[2], t.numbers[3]);
                Collections.addAll(t.coordinates,
                        new int[]{0, 0, 0, 1, 0, 2, 0, 3},
                        new int[]{0, 0, 1, 0, 2, 0, 3, 0}
                );
                break;
            case 1:
                // type J
                t.pattern[0] = String.format(" %d      ", t.numbers[0]);
                t.pattern[1] = String.format(" %d %d %d  ", t.numbers[1], t.numbers[2], t.numbers[3]);
                Collections.addAll(
                        t.coordinates,
                        new int[]{0, 0, 1, 0, 1, 1, 1, 2},
                        new int[]{0, 1, 0, 0, 1, 0, 2, 0},
                        new int[]{1, 2, 0, 2, 0, 1, 0, 0},
                        new int[]{2, 0, 2, 1, 1, 1, 0, 1}
                );
                break;
            case 2:
                // type L
                t.pattern[0] = String.format("     %d  ", t.numbers[0]);
                t.pattern[1] = String.format(" %d %d %d  ", t.numbers[1], t.numbers[2], t.numbers[3]);
                Collections.addAll(
                        t.coordinates,
                        new int[]{0, 2, 1, 0, 1, 1, 1, 2},
                        new int[]{2, 1, 0, 0, 1, 0, 2, 0},
                        new int[]{1, 0, 0, 2, 0, 1, 0, 0},
                        new int[]{0, 0, 2, 1, 1, 1, 0, 1}
                );
                break;
            case 3:
                // type O
                t.pattern[0] = String.format(" %d %d  ", t.numbers[0], t.numbers[1]);
                t.pattern[1] = String.format(" %d %d  ", t.numbers[2], t.numbers[3]);
                Collections.addAll(
                        t.coordinates,
                        new int[]{0, 0, 0, 1, 1, 0, 1, 1}
                );
                break;
            case 4:
                // type Z
                t.pattern[0] = String.format(" %d %d    ", t.numbers[0], t.numbers[1]);
                t.pattern[1] = String.format("   %d %d  ", t.numbers[2], t.numbers[3]);
                Collections.addAll(
                        t.coordinates,
                        new int[]{0, 0, 0, 1, 1, 1, 1, 2},
                        new int[]{0, 1, 1, 0, 1, 1, 2, 0}
                );
                break;
            case 5:
                // type S
                t.pattern[0] = String.format("   %d %d  ", t.numbers[0], t.numbers[1]);
                t.pattern[1] = String.format(" %d %d    ", t.numbers[2], t.numbers[3]);
                Collections.addAll(
                        t.coordinates,
                        new int[]{0, 1, 0, 2, 1, 0, 1, 1},
                        new int[]{1, 1, 2, 1, 0, 0, 1, 0}
                );
                break;
            case 6:
                // type T
                t.pattern[0] = String.format(" %d %d %d  ", t.numbers[0], t.numbers[1], t.numbers[2]);
                t.pattern[1] = String.format("   %d    ", t.numbers[3]);
                Collections.addAll(
                        t.coordinates,
                        new int[]{0, 0, 0, 1, 0, 2, 1, 1},
                        new int[]{0, 1, 1, 1, 2, 1, 1, 0},
                        new int[]{1, 2, 1, 1, 1, 0, 0, 1},
                        new int[]{2, 0, 1, 0, 0, 0, 1, 1}
                );
                break;
        }

        return t;
    }

    public void rotate() {
        orientation++;
    }

    public void unrotate() {
        orientation--;
    }

    public int[] getNumbers() {
        return numbers;
    }

    public String[] getPattern() {
        return pattern;
    }

    public int[] getCoordinates() {
        return coordinates.get(orientation % coordinates.size());
    }

}
