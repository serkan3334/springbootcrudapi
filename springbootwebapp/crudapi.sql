CREATE DATABASE crudapi;

USE crudapi;

CREATE TABLE tbl_employee
(
	id INT NOT NULL PRIMARY KEY AUTO_INCREMENT,
	cid VARCHAR(255),
    name VARCHAR(255),
    phoneNumber VARCHAR(255),
    gender VARCHAR(255),
    companyInfo VARCHAR(255),
    department VARCHAR(255),
    email VARCHAR(255),
    dob DATE
);