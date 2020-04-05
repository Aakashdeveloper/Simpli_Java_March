//To See all the TABLES;
SHOW FULL TABLES

//@To Check tabel structre
DESCRIBE customers;

//CreatTable

CREATE TABLE Sqlapr(
    id INT(6) UNASIGNED AUTO_INCREMENT PRIMARY KEY,
    fistname VARCHAR(50) NOT NULL,
    email VARCHAR(50) NOT NULL,
    joining_date TIMESTAMP DEFAULT CURRENT_TIMESTAMP
)

INSERT INTO Sqlapr(fistname, email) 
VALUES('Mayank','mayank.gupta@gmail.com')

INSERT INTO Sqlapr(id, fistname, email) 
VALUES(2,'Aakash','aakash.gupta@gmail.com')

SELECT * FROM Sqlapr;

SELECT COUNT(*) FROM customers;
SELECT * FROM customers;
SELECT customerName, city, country FROM customers;
SELECT customerName, city, country FROM customers WHERE country = "USA";
select count(customername) from customers where country ="USA";
select count(*) from customers where country ="USA";
SELECT DISTINCT country from customers;
SELECT * FROM customers where customerNumber = 112;
SELECT * FROM customers where state="NY" or country="Germany";
SELECT * FROM customers where state="NY" AND country="USA";

SELECT * FROM customers where country="USA" AND (state="MA" OR state="NY");
SELECT * FROM customers where country="USA" AND NOT state="NY";
SELECT * FROM customers ORDER BY country;
SELECT * FROM customers ORDER BY country DESC;
select country, customername from customers order by country desc, customerName asc;
select * from customers order by country desc, customerName
select * from customers where addressLine2 IS NULL;
select * from customers where addressLine2 IS NOT NULL;
select * from customers where country='Germany' LIMIT 3;

SELECT MIN(buyPrice) AS SmallestPrice from products;
SELECT MAX(buyPrice) AS HighestPrice from products;
select SUM(quantityInStock) from products;
UPDATE Employee SET lastname="ammy" where id=21;
DELETE FROM Employee where id=21;

SELECT * FROM customers WHERE customerName LIKE 'a%'
SELECT * FROM customers WHERE customerName LIKE '%a%'
SELECT * FROM customers WHERE customerName LIKE 'a%r'
SELECT * FROM customers WHERE customerName LIKE '__a%'


SELECT * FROM customers WHERE country IN ('INDIA','FRANCE','JAPAN')
SELECT * FROM customers WHERE city IN (SELECT city FROM offices);
SELECT * FROM products where buyPrice NOT BETWEEN 50 AND 60;
SELECT * FROM products where buyPrice BETWEEN 50 AND 60;

SELECT * FROM products where buyPrice BETWEEN 0 AND 50 AND productLine NOT IN ('Classic Cars','Motorcycles')
SELECT * FROM products where buyPrice BETWEEN 0 AND 50 AND productLine IN ('Ships','Planes')


INNERJOIN
> SElect records that have matching values in both tables

LEFTJOIN
> Return all the records from the left table and matched record from the right TABLE

RIGHTJOIN
> Return all the records from the right table and matched record from the left TABLE

FULLOUTERJOIN
> Return all records when there is match in left or rigth table

SELECT orders.orderNumber, customers.customerName 
FROM customers INNER JOIN orders 
ON orders.customerNumber = customers.customerNumber

SELECT orders.orderNumber, customers.customerName 
FROM customers RIGHT JOIN orders 
ON orders.customerNumber = customers.customerNumber

SELECT orders.orderNumber, customers.customerName 
FROM customers LEFT JOIN orders 
ON orders.customerNumber = customers.customerNumber;

SELECT customers.customerName ,payments.amount 
FROM customers LEFT JOIN payments 
ON payments.customerNumber = customers.customerNumber;

SELECT X.customerNumber AS customerName1, Y.customerNumber as customerName2, X.city
FROM customers X, customers Y 
WHERE X.customerNumber <> Y.customerNumber
AND X.city = Y.city
order by X.city;



SELECT City FROM customers
UNION
SELECT city from offices;


SELECT COUNT(orderNumber),orderDate ,customerNumber FROM orders GROUP BY customerNumber;

SELECT orders.customerNumber, customers.customerName,COUNT(orders.orderNumber) AS totalorder
FROM orders LEFT JOIN customers ON orders.customerNumber=customers.customerNumber Group BY customerNumber;

SELECT orders.customerNumber, customers.customerName,COUNT(orders.orderNumber) AS totalorder
FROM orders LEFT JOIN customers ON orders.customerNumber=customers.customerNumber Group BY customerNumber HAVING COUNT(orders.orderNumber) >5;

SELECT customerName FROM customers WHERE exists(SELECT checkNumber from payments 
where payments.customerNumber= customers.customerNumber AND amount <1000);

SELECT productName, quantityInStock from products 
where productCode = ANY(SELECT productCode from orderdetails where quantityOrdered >80)

SELECT productName, quantityInStock from products 
where productCode = ALL(SELECT productCode from orderdetails where quantityOrdered >80)

SELECT firstNamme,lastName INTO SimpliEmp FROM Employee where name = "d";

INSERT INTO table2 SELECT * FROM table1 WHERE condition;

SELECT orderNumber, quantityOrdered,
CASE
    WHEN quantityOrdered >40 THEN 'The quantity is big'
    WHEN quantityOrdered >30 THEN 'The quantity is medim'
    ELSE 'The quantity is small'
END AS OrderType
FROM orderdetails;

Map Reduce
Stored PROCEDURE