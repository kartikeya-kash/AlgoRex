create database hackx;
use hackx;

CREATE TABLE HealthProfile (
    id INT AUTO_INCREMENT PRIMARY KEY,
    username VARCHAR(100),
    userid VARCHAR(50),
    DOB DATE,
    sex ENUM('Male', 'Female', 'Other'),
    height DOUBLE,
    weight DOUBLE,
    BMI DOUBLE GENERATED ALWAYS AS (weight / POW(height / 100, 2)) STORED,
    age SMALLINT,
    country VARCHAR(100),
    state VARCHAR(100),
    district VARCHAR(100),
