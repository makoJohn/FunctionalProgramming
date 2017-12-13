package samples;

import java.util.Arrays;
import java.util.List;

import static java.util.stream.Collectors.*;
import static samples.Person.Gender.FEMALE;
import static samples.Person.Gender.MALE;

/**
 *
 */
public class FindPerson {
    public static void main(String[] args) {
        List<Person> persons = Arrays.asList(
                new Person("Jan", 15, MALE),
                new Person("Jan", 54, MALE),
                new Person("Kate", 32, FEMALE),
                new Person("Bob", 27, MALE),
                new Person("Fiona", 23, FEMALE),
                new Person("Jan", 42, MALE),
                new Person("Jack", 18, MALE),
                new Person("Bob", 79, MALE),
                new Person("Diana", 32, FEMALE)
        );

/*        System.out.println(
                persons.stream()
                .filter(p -> p.getAge() < 30)
                .filter(p -> p.getGender() == FEMALE)
                .map(p -> p.getName())
                .collect(toList())
        );*/

        System.out.println(
                persons.stream()
                        .collect(groupingBy(p -> p.getGender(),
                                mapping(p -> p.getName(), toSet())))
        );
    }
}
