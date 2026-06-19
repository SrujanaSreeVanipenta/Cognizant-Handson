//Create Customer Table
CREATE TABLE Customers (
    CustomerID NUMBER PRIMARY KEY,
    Name VARCHAR2(50),
    Age NUMBER,
    LoanInterestRate NUMBER(5,2)
);



//PL/SQL Block



DECLARE
    CURSOR cust_cursor IS
        SELECT CustomerID, Age, LoanInterestRate
        FROM Customers;
BEGIN
    FOR cust IN cust_cursor LOOP

        IF cust.Age > 60 THEN

            UPDATE Customers
            SET LoanInterestRate =
                LoanInterestRate - 1
            WHERE CustomerID = cust.CustomerID;

        END IF;

    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('Interest rates updated successfully.');

END;
/