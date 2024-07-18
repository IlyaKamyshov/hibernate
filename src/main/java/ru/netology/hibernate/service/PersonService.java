package ru.netology.hibernate.service;

import ru.netology.hibernate.entity.Person;

import java.util.List;
import java.util.Optional;

public interface PersonService {

    List<Person> findAllByCity(String city);
    List<Person> findAllByAge(short age);
    Optional<Person> findAllByNameAndSurname(String name, String surname);

}
