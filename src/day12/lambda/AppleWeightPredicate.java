package day12.lambda;

import java.util.function.Predicate;

public class  AppleWeightPredicate implements Predicate<Apple> {
    @Override
    public boolean test(Apple apple) {
        return apple.getWeight() >= 100;
    }
}
