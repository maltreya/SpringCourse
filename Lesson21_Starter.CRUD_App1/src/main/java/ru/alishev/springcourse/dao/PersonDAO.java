package ru.alishev.springcourse.dao;

import org.springframework.stereotype.Component;
import ru.alishev.springcourse.models.Person;

import java.util.ArrayList;
import java.util.List;
@Component
public class PersonDAO {
    private static int PEOPLE_COUNT = 1;
    private List<Person> people;

    {
        people = new ArrayList<>();
        people.add(new Person(PEOPLE_COUNT++, "Maria"));
        people.add(new Person(PEOPLE_COUNT++, "Koscja"));
        people.add(new Person(PEOPLE_COUNT++, "Aglaja"));
        people.add(new Person(PEOPLE_COUNT++, "Toby"));
    }

    public List<Person> index() {
        return people;
    }

    public Person show(int id) {
        return  people.stream().filter(person -> person.getId() == id)
                .findAny().orElse(null);
    }
}