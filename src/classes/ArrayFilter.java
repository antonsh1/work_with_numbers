package classes;

import java.util.*;

public class ArrayFilter {
    private List<Integer> numbers;

    public ArrayFilter(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void getResult() {
        List<Integer> result = new ArrayList<>();
        for(Integer number : numbers) {
            if(number > 0 && number % 2 == 0) {
                result.add(number);
            }
        }
        Collections.sort(result);
        System.out.println(result);
    }
}
