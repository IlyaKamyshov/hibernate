package ru.netology.hibernate.service;

import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.repository.Repository;

import java.util.List;

@org.springframework.stereotype.Service
public class ServiceList implements Service {

    Repository repository;

    public ServiceList(Repository repository) {
        this.repository = repository;
    }

    @Override
    public List<Person> getPersonsByCity(String city) {
        return repository.getPersonsByCity(city);
    }

}
