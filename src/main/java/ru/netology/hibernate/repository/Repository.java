package ru.netology.hibernate.repository;

import ru.netology.hibernate.entity.Person;

import java.util.List;

public interface Repository {
    List<Person> getPersonsByCity(String city);
}
