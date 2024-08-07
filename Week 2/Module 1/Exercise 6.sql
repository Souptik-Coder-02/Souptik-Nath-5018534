-- Scenario 1

DECLARE
    CURSOR GenerateMonthlyStatements IS
        SELECT c.CustomerID, c.Name, t.TransactionDate, t.Amount, t.TransactionType
        FROM Customers c
        JOIN Accounts a ON c.CustomerID = a.CustomerID
        JOIN Transactions t ON a.AccountID = t.AccountID
        WHERE t.TransactionDate BETWEEN TRUNC(SYSDATE, 'MM') AND LAST_DAY(SYSDATE);

BEGIN
    FOR rec IN GenerateMonthlyStatements LOOP
        DBMS_OUTPUT.PUT_LINE('Customer: ' || rec.Name || ' | Date: ' || TO_CHAR(rec.TransactionDate, 'YYYY-MM-DD') || 
                             ' | Amount: ' || rec.Amount || ' | Type: ' || rec.TransactionType);
    END LOOP;
END;


-- Scenario 2

DECLARE
    CURSOR ApplyAnnualFee IS
        SELECT AccountID, Balance 
        FROM Accounts;

    v_Fee CONSTANT NUMBER := 50; -- Annual maintenance fee

BEGIN
    FOR rec IN ApplyAnnualFee LOOP
        UPDATE Accounts
        SET Balance = Balance - v_Fee
        WHERE AccountID = rec.AccountID;
    END LOOP;

    COMMIT;
END;


-- Scenario 3

DECLARE
    CURSOR UpdateLoanInterestRates IS
        SELECT LoanID, InterestRate 
        FROM Loans;

    v_NewInterestRate CONSTANT NUMBER := 6.5; -- New interest rate based on policy

BEGIN
    FOR rec IN UpdateLoanInterestRates LOOP
        UPDATE Loans
        SET InterestRate = v_NewInterestRate
        WHERE LoanID = rec.LoanID;
    END LOOP;

    COMMIT;
END;