package se.deved;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;

public class Person {
    public String name;
    public String email;
    public int age;

    public Person(String name, String email, int age) {
        this.name = name;
        this.email = email;
        this.age = age;
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Ironman", "tony@stark.com", 43));
        people.add(new Person("Superman", null, 43));
        people.add(new Person("Batman", "bruce@wayne.com", 2));
        people.add(new Person("Black Widow", "natasha@romanoff.com", 9));
        people.add(new Person("Hulk", null, 47));

        List<Person> newList = getPeopleAboveTwentyWithMailSorted(people);

        for (Person person : newList) {
            System.out.println(person.name);
        }

        System.out.println(sumAges(people));

        getOldestPerson(people).ifPresent(person -> System.out.println(person.name));

        System.out.println("10 oldest:");
        getTenOldestPeople(people).forEach(person -> System.out.println(person.name));

        Optional<Person> firstPersonAboveThirty = Exercises.findObjectInList(people, (person) -> person.age > 30);
        if (firstPersonAboveThirty.isPresent()) {
            System.out.println(firstPersonAboveThirty.get().name);
        }
    }

    // (STREAMS) Övning 4
    public static List<Person>
    getPeopleAboveTwentyWithMailSorted(List<Person> people) {
        return people.stream()
                .filter((person) -> person.age > 20)
                .filter((person) -> person.email != null)
                .sorted(Comparator.comparing(a -> a.name))
                //.sorted((a, b) -> a.name.compareTo(b.name))
                .toList();
    }

    // (STREAMS) Övning 5
    public static int sumAges(List<Person> people) {
        return people.stream()
                .mapToInt((person) -> person.age)
                .sum();
    }

    // (STREAMS) Övning 6
    public static Optional<Person> getOldestPerson(List<Person> people) {
        return people.stream()
                .max(Comparator.comparingInt(a -> a.age));
        //.max((a, b) -> a.age - b.age);
    }

    // (STREAMS) Övning 7
    public static List<Person> getTenOldestPeople(List<Person> people) {
        return people.stream()
                .sorted((a, b) -> b.age - a.age)
                .limit(10)
                .toList();
    }
}