package ru.netology.hibernate.controller;

import jakarta.annotation.security.RolesAllowed;
import org.springframework.security.access.annotation.Secured;
import org.springframework.security.access.prepost.PostAuthorize;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import ru.netology.hibernate.entity.Person;
import ru.netology.hibernate.service.PersonService;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("/securitypersons")
public class SecurityPersonController {

    private final PersonService service;

    public SecurityPersonController(PersonService service) {
        this.service = service;
    }

    @GetMapping("/by-city")
    @Secured("ROLE_READ")
    public List<Person> getPersonsByCity(@RequestParam String city) {
        return service.findAllByCity(city);
    }

    @GetMapping("/by-age")
    @RolesAllowed("WRITE") // ROLE_WRITE in @RolesAllowed don't work
    public List<Person> getPersonsByAge(@RequestParam short age) {
        return service.findAllByAge(age);
    }

    @GetMapping("/by-name-and-surname")
    @PreAuthorize("hasRole('ROLE_WRITE') or hasRole('ROLE_DELETE')")
    public Optional<Person> getPersonsByNameAndSurname(@RequestParam String name, @RequestParam String surname) {
        return service.findAllByNameAndSurname(name, surname);
    }

    @PreAuthorize("#username == authentication.principal.username")
    @GetMapping("/who")
    public String checkWho(@RequestParam("username") String username) {
        return username;
    }

}
