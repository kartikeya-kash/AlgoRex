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
  -- Lifestyle
    smoking TINYINT CHECK (smoking BETWEEN 0 AND 5),
    alcohol TINYINT CHECK (alcohol BETWEEN 0 AND 5),
    drug TINYINT CHECK (drug BETWEEN 0 AND 5),
    exercise ENUM('daily_low', 'daily_moderate', 'daily_high', 
                  'weekends_low', 'weekends_moderate', 'weekends_high', 'none'),
	