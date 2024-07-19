package ru.netology.hibernate.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.entity.PersonPrimaryKey;

import java.util.List;
import java.util.Optional;

@Repository
public interface PersonRepository extends JpaRepository<Person, PersonPrimaryKey> {

    @Query(value = "SELECT * FROM netology.PERSONS p WHERE p.city_of_living = :city", nativeQuery = true)
    List<Person> findAllByCityOfLiving(String city);

    @Query(value = "SELECT * FROM netology.PERSONS p WHERE p.age < :age ORDER BY p.age", nativeQuery = true)
    List<Person> findAllByIdAgeLessThanOrderByIdAge(short age);

    @Query(value = "SELECT * FROM netology.PERSONS p WHERE p.name = :name AND p.surname = :surname", nativeQuery = true)
    Optional<Person> findAllByIdNameAndIdSurname(String name, String surname);

}
