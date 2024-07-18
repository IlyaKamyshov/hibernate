CREATE TABLE CUSTOMERS
(
    id           INT PRIMARY KEY AUTO_INCREMENT,
    name         VARCHAR(50),
    surname      VARCHAR(50),
    age          SMALLINT CHECK (age >= 0 AND age < 150),
    phone_number VARCHAR(50)
    );