CREATE SCHEMA IF NOT EXIST netology;

CREATE TABLE IF NOT EXIST netology.PERSONS
(
    name           VARCHAR(50),
    surname        VARCHAR(50),
    age            SMALLINT CHECK (age >= 0 AND age <= 150),
    phone_number   VARCHAR(30),
    city_of_living VARCHAR(50),
    PRIMARY KEY (NAME, surname, age)
);

INSERT INTO netology.PERSONS (NAME, surname, age, phone_number, city_of_living)
VALUES ('Ivan', 'Ivanov', 50, '+79160000000', 'Moscow'),
       ('Petr', 'Petrov', 40, '+79161111111', 'St.Petersburg'),
       ('Sidor', 'Sidorov', 20, NULL, 'Moscow'),
       ('Maxim', 'Maximov', 27, '+79162222222', 'Moscow'),
       ('Vasily', 'Vasechkin', 82, NULL, 'Vladivostok');