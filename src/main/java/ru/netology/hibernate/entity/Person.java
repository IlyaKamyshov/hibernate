package ru.netology.hibernate.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "PERSONS", schema="netology")
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Person {

    @EmbeddedId
    PersonPrimaryKey personPrimaryKey;
    @Column(name="phone_number")
    private String phoneNumber;
    @Column(name="city_of_living")
    private String cityOfLiving;

}
