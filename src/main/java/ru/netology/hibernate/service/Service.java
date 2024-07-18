package ru.netology.hibernate.service;

import ru.netology.hibernate.entity.Person;

import java.util.List;

public interface Service {
    List<Person> getPersonsByCity(String city);
}
