--  Scenario 1: 
DECLARE
    v_age NUMBER;
    v_dob DATE;
BEGIN
    FOR cust_rec IN (SELECT CustomerID, DOB FROM Customers) LOOP
        v_dob := cust_rec.DOB;
        v_age := FLOOR(MONTHS_BETWEEN(SYSDATE, v_dob) / 12);
        
        IF v_age > 60 THEN
            UPDATE Loans
            SET InterestRate = InterestRate - 1
            WHERE CustomerID = cust_rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;

-- Scenario 2: 

BEGIN
    FOR cust_rec IN (SELECT CustomerID, Balance FROM Customers) LOOP
        IF cust_rec.Balance > 10000 THEN
            UPDATE Customers
            SET IsVIP = 'TRUE'
            WHERE CustomerID = cust_rec.CustomerID;
        END IF;
    END LOOP;
    COMMIT;
END;

-- Scenario 3: 

BEGIN
    FOR loan_rec IN (SELECT LoanID, CustomerID, EndDate 
                     FROM Loans 
                     WHERE EndDate BETWEEN SYSDATE AND SYSDATE + 30) LOOP
        DBMS_OUTPUT.PUT_LINE('Reminder: Loan ' || loan_rec.LoanID || ' for Customer ' || loan_rec.CustomerID || ' is due on ' || TO_CHAR(loan_rec.EndDate, 'YYYY-MM-DD'));
    END LOOP;
END;