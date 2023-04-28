package chapterSeventeen.functionalInterface;

import java.util.function.Predicate;

public class PredicateSample {
    public static void main(String[] args) {
        System.out.println(predicate.test(10));
        Predicate<Integer> andOperator = predicate.and(after);
        System.out.println(andOperator.test(10));
    }
    static Predicate<Integer> predicate = input -> input % 2 == 0;
    static Predicate<Integer> after = afterInput -> afterInput >= 5;
}
