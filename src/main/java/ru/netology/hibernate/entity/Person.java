package ru.netology.hibernate.entity;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "PERSONS", schema="netology")
@NoArgsConstructor
@Getter
@Setter
public class Person {

    @EmbeddedId
    PersonPrimaryKey id;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="city_of_living")
    private String cityOfLiving;

}
