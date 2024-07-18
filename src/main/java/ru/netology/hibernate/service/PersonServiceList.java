package ru.netology.hibernate.service;

import org.springframework.stereotype.Service;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.repository.PersonRepository;

import java.util.List;
import java.util.Optional;

@Service
public class PersonServiceList implements PersonService {

    private final PersonRepository repository;

    public PersonServiceList(PersonRepository repository) {
        this.repository = repository;
    }

    @Override
    public List<Person> findAllByCity(String city) {
        return repository.findAllByCityOfLiving(city);
    }

    @Override
    public List<Person> findAllByAge(short age) {
        return repository.findAllByIdAgeLessThanOrderByIdAge(age);
    }

    @Override
    public Optional<Person> findAllByNameAndSurname(String name, String surname) {
        return repository.findAllByIdNameAndIdSurname(name, surname);
    }
}
