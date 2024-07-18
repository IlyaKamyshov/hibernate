CREATE TABLE netology.PERSONS
(
    NAME           VARCHAR(50),
    surname        VARCHAR(50),
    age            SMALLINT CHECK (age >= 0 AND age <= 150),
    phone_number   VARCHAR(30),
    city_of_living VARCHAR(50),
    PRIMARY KEY (NAME, surname, age)
);