package ru.netology.hibernate.repository;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import lombok.RequiredArgsConstructor;
import ru.netology.hibernate.entity.Person;

import java.util.List;

@org.springframework.stereotype.Repository
@RequiredArgsConstructor
public class RepositoryList implements Repository{

    @PersistenceContext
    private final EntityManager entityManager;

    @Override
    public List<Person> getPersonsByCity(String city) {
        return entityManager
                .createQuery("select p from Person p where p.cityOfLiving = :city", Person.class)
                .setParameter("city", city)
                .getResultList();
    }

}
