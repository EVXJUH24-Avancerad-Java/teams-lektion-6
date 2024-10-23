package se.deved;

import java.util.List;
import java.util.Optional;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class Exercises {

    // (STREAMS) Övning 1
    public static List<Integer> filterOdd(List<Integer> list) {
        return list.stream()
                .filter((number) -> number % 2 == 0)
                .toList();
    }

    // (STREAMS) Övning 2
    public static List<Integer> sortBySize(List<Integer> list) {
        return list.stream()
                .sorted((a, b) -> b - a)
                .toList();
    }

    // (STREAMS) Övning 3
    public static List<Integer> sortBySizeAndFilterOdd(List<Integer> list) {
        return list.stream()
                .filter((number) -> number % 2 == 0)
                .sorted((a, b) -> b - a)
                .toList();
    }

    // (GENERICS) Övning 1
    public static <T> Optional<T> findObjectInList(List<T> objects, Predicate<T> condition) {
        // Med streams
        // return objects.stream().filter(condition).findFirst();

        // Manuellt
        for (T object : objects) {
            if (condition.test(object)) {
                return Optional.of(object);
            }
        }

        return Optional.empty();
    }
}
