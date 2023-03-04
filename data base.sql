use bank;
CREATE TABLE employes1 (
  idEmploye VARCHAR(50) PRIMARY KEY,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL
);
CREATE TABLE client1 (
  id VARCHAR(50) PRIMARY KEY,
  first_name VARCHAR(50) NOT NULL,
  last_name VARCHAR(50) NOT NULL,
  phone_number VARCHAR(50) NOT NULL,
  adresse VARCHAR(50) NOT NULL
);
CREATE TABLE account1 (
  account_number VARCHAR(50) PRIMARY KEY,
  balance VARCHAR(255) NOT NULL,
  id varchar(50) NOT NULL,
  FOREIGN KEY (id) REFERENCES client(id)
);
CREATE TABLE employee_auth1 (
  idEmployee VARCHAR(50) PRIMARY KEY,
  password VARCHAR(255) NOT NULL
);
CREATE TABLE transaction1 (
  account_number VARCHAR(50) PRIMARY KEY,
  amount VARCHAR(255) NOT NULL,
  date VARCHAR(50) NOT NULL,
  reason varchar(50) not null,
   FOREIGN KEY (account_number) REFERENCES account(account_number)
);
CREATE TABLE operation1 (
  idEmploye VARCHAR(50) not null,
  account_number VARCHAR(50)  NOT NULL,
  date VARCHAR(50) NOT NULL,
  type VARCHAR(50) NOT NULL,
  toAccount VARCHAR(50) NOT NULL,
  amount VARCHAR(50) NOT NULL
);


INSERT INTO employes1(idEmploye,first_name,last_name)
VALUES ("123","EL OMARI","Lokmane");

INSERT INTO employee_auth1(idEmployee,password)
VALUES ("123","123");

select * from account1;
select * from client1;
select * from employes1;
select * from operation1;
select * from transaction1;
select * from employee_auth1;