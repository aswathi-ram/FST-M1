-- Activity 1
DROP TABLE salesman;
CREATE TABLE salesman(salesman_id int, salesman_name varchar(32), salesman_city varchar(32), commission int);
DESCRIBE salesman;

-- Activity 2
 
INSERT ALL
INTO salesman VALUES(5001,'James Hoog', 'New York',15)
 INTO salesman VALUES(5001,'Hoog', 'New York',15)
 INTO salesman VALUES(5002,'Nail Knite','Paris',13)
 INTO salesman VALUES(5005,'Pit Alex','London',12)
 INTO salesman VALUES(5005,'Alex','London',10)
 INTO salesman VALUES(5006,'McLyon','Paris',14)
 INTO salesman VALUES(5007,'Paul Adam', 'Rome',16)
 SELECT 1 FROM DUAL;
SELECT * FROM salesman;

-- Activity 3
-- Show data from the salesman_id and city columns
SELECT salesman_id, salesman_city FROM salesman;
-- Show data of salesman from Paris
SELECT * FROM salesman WHERE salesman_city='Paris';
-- Show salesman_id and commission of Paul Adam
SELECT salesman_id, commission FROM salesman WHERE salesman_name='Paul Adam';

 -- Activity 4
 -- Add the grade column
ALTER TABLE salesman ADD grade int;
-- Update the values in the grade column
UPDATE salesman SET grade=88;
-- Display data
SELECT * FROM salesman;

-- Actiity 5
UPDATE salesman SET grade=200 WHERE salesman_city ='Rome';
UPDATE salesman SET grade=300 WHERE salesman_city ='New York';
UPDATE salesman SET salesman_name='James Hoog' WHERE salesman_name ='Alex';
SELECT * FROM salesman;
