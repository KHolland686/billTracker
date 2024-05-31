DROP DATABASE IF EXISTS BillTracker;
CREATE DATABASE BillTracker;
USE BillTracker;

CREATE TABLE IF NOT EXISTS Company (
Company_ID INT not null auto_increment,
Company_name VARCHAR(100) not null,
Category VARCHAR(50),
PRIMARY KEY (Company_ID)
);

CREATE TABLE IF NOT EXISTS Bills (
Bill_ID INT not null auto_increment,
Company_ID INT,
Total_Amount FLOAT NOT NULL,
Automatic_Payment BOOL not null,
Date_Received DATE not null,
Notes VARCHAR(300),
FOREIGN KEY (Company_ID) REFERENCES Company(Company_ID) on update cascade on delete cascade,
PRIMARY KEY (Bill_ID)
);

CREATE TABLE IF NOT EXISTS Payments (
Payment_ID INT NOT NULL AUTO_INCREMENT,
Bill_ID INT,
Date_Paid DATE,
Payment_Frequency VARCHAR(20),
Is_Installment BOOL not null,
Installment_Number INT,
Total_Installments INT,
Amount_Paid FLOAT,
Due_Date DATE,
FOREIGN KEY (Bill_ID) REFERENCES Bills(Bill_ID) ON UPDATE CASCADE ON DELETE CASCADE,
PRIMARY KEY (Payment_ID)
);

CREATE TABLE IF NOT EXISTS Credentials (
Credential_ID INT NOT NULL AUTO_INCREMENT,
Company_ID INT,
Website VARCHAR(200),
User_ID VARCHAR(20),
`Password` VARCHAR (20),
FOREIGN KEY (Company_ID) REFERENCES Company(Company_ID),
PRIMARY KEY (Credential_ID)
);
