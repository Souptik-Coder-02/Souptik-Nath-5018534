-- Scenario 1

CREATE OR REPLACE FUNCTION CalculateAge (
    p_DOB IN DATE
) 
RETURN NUMBER 
IS
    v_Age NUMBER;
BEGIN
    v_Age := FLOOR(MONTHS_BETWEEN(SYSDATE, p_DOB) / 12);
    RETURN v_Age;
END CalculateAge;


-- Scenario 2

CREATE OR REPLACE FUNCTION CalculateMonthlyInstallment (
    p_LoanAmount IN NUMBER,
    p_InterestRate IN NUMBER,
    p_DurationYears IN NUMBER
) 
RETURN NUMBER 
IS
    v_MonthlyRate NUMBER;
    v_TotalMonths NUMBER;
    v_MonthlyInstallment NUMBER;
BEGIN
    v_MonthlyRate := p_InterestRate / 1200;  -- Convert annual interest rate to monthly
    v_TotalMonths := p_DurationYears * 12;
    v_MonthlyInstallment := p_LoanAmount * v_MonthlyRate / (1 - POWER(1 + v_MonthlyRate, -v_TotalMonths));
    RETURN v_MonthlyInstallment;
END CalculateMonthlyInstallment;


-- Scenario 3

CREATE OR REPLACE FUNCTION HasSufficientBalance (
    p_AccountID IN NUMBER,
    p_Amount IN NUMBER
) 
RETURN BOOLEAN 
IS
    v_Balance NUMBER;
BEGIN
    SELECT Balance INTO v_Balance FROM Accounts WHERE AccountID = p_AccountID;
    
    IF v_Balance >= p_Amount THEN
        RETURN TRUE;
    ELSE
        RETURN FALSE;
    END IF;
END HasSufficientBalance;