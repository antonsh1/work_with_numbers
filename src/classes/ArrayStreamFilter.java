package classes;

import java.util.List;

public class ArrayStreamFilter {
    private List<Integer> numbers;

    public ArrayStreamFilter(List<Integer> numbers) {
        this.numbers = numbers;
    }

    public void getResult() {
        numbers.stream().filter(x -> x > 0).filter(x -> x % 2 == 0).sorted().forEach(System.out::println);
    }
}
