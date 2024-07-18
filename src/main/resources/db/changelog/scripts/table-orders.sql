CREATE TABLE ORDERS
(
    id           INT PRIMARY KEY AUTO_INCREMENT,
    date         DATETIME,
    customer_id  INT,
    product_name VARCHAR(255),
    amount       INT,
    FOREIGN KEY (customer_id) REFERENCES CUSTOMERS (id)
);