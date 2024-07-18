package ru.netology.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.entity.PersonPrimaryKey;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonPrimaryKey> {
    List<Person> findAllByCityOfLiving(String city);
    List<Person> findAllByIdAgeLessThanOrderByIdAge(short age);
    Optional<Person> findAllByIdNameAndIdSurname(String name, String surname);
}
