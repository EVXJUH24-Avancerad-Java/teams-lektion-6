package se.deved;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class Main<T extends String> {
    public static void main(String[] args) {
        // (STREAMS) Testa övning 1
        List<Integer> numbers = List.of(1, 2, 3, 4);

        List<Integer> filtered = Exercises.filterOdd(numbers);
        // System.out.println(filtered);
        // filtered.stream().forEach((number) -> System.out.println(number));
        // filtered.forEach(System.out::println);

        // (STREAMS) Testa övning 2
        numbers = List.of(4, 3, 1, 2);
        List<Integer> sorted = Exercises.sortBySize(numbers);
        System.out.println(sorted);

        // (GENERICS) Testa övning 1
        List<String> countries = List.of("Sweden", "Norway", "Denmark", "Finland");

        boolean denmarkExists = Exercises.findObjectInList(countries, (name) -> name.equals("Denmark")).isPresent();
        System.out.println("Denmark is in list: " + denmarkExists);
        Optional<String> countryWithF = Exercises.findObjectInList(countries, (name) -> name.contains("F"));
        countryWithF.ifPresent(System.out::println);
    }
}