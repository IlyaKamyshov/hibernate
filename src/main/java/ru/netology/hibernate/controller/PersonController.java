package ru.netology.hibernate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.service.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/persons")
public class PersonController {
    private final PersonService service;

    public PersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/by-city")
    private List<Person> getPersonsByCity(@RequestParam String city) {
        return service.findAllByCity(city);
    }

    @GetMapping("/by-age")
    public List<Person> getPersonsByAge(@RequestParam short age) {
        return service.findAllByAge(age);
    }

    @GetMapping("/by-name-and-surname")
    private Optional<Person> getPersonsByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return service.findAllByNameAndSurname(name, surname);
    }

}
