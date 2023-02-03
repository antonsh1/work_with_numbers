import classes.ArrayFilter;
import classes.ArrayStreamFilter;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1, 2, 5, 16, -1, -2, 0, 32, 3, 5, 8, 23, 4);
        ArrayFilter filter = new ArrayFilter(numbers);
        ArrayStreamFilter streamFilter = new ArrayStreamFilter(numbers);
        filter.getResult();
        streamFilter.getResult();

    }
}