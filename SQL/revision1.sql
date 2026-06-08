```sql
-- Display all employees
SELECT *
FROM HR.EMPLOYEES;

-- Describe table structure
DESC HR.EMPLOYEES;

-- Employees with salary greater than 15000
SELECT
    EMPLOYEE_ID,
    FIRST_NAME,
    SALARY
FROM
    HR.EMPLOYEES
WHERE
    SALARY > 15000;

-- Employees with salary > 10000, department 60 or 90,
-- hired after 01-JAN-2005
SELECT
    *
FROM
    HR.EMPLOYEES
WHERE
    SALARY > 10000
    AND DEPARTMENT_ID IN (60, 90)
    AND HIRE_DATE > TO_DATE('01-JAN-2005', 'DD-MON-YYYY')
ORDER BY
    SALARY DESC;

--------------------------------------------------
-- ALL WHERE OPERATORS
--------------------------------------------------

-- Equal To (=)
SELECT *
FROM HR.EMPLOYEES
WHERE SALARY = 24000;

-- Greater Than (>)
SELECT *
FROM HR.EMPLOYEES
WHERE SALARY > 10000;

-- Between
SELECT *
FROM HR.EMPLOYEES
WHERE SALARY BETWEEN 5000 AND 10000;

-- LIKE
SELECT *
FROM HR.EMPLOYEES
WHERE FIRST_NAME LIKE 'S%';

-- Second character is 'a'
SELECT *
FROM HR.EMPLOYEES
WHERE FIRST_NAME LIKE '_a%';

-- IS NULL
SELECT *
FROM HR.EMPLOYEES
WHERE COMMISSION_PCT IS NULL;

-- NOT IN
SELECT *
FROM HR.EMPLOYEES
WHERE DEPARTMENT_ID NOT IN (10, 20);

--------------------------------------------------
-- LIKE EXAMPLES
--------------------------------------------------

-- Show employees whose first name contains 'i'
-- and last name contains 'e'
SELECT *
FROM HR.EMPLOYEES
WHERE FIRST_NAME LIKE '%i%'
  AND LAST_NAME LIKE '%e%';

--------------------------------------------------
-- ORDER BY
--------------------------------------------------

SELECT
    FIRST_NAME,
    SALARY,
    DEPARTMENT_ID
FROM
    HR.EMPLOYEES
ORDER BY
    SALARY DESC;

SELECT
    FIRST_NAME,
    SALARY,
    DEPARTMENT_ID
FROM
    HR.EMPLOYEES
ORDER BY
    SALARY ASC;

SELECT
    FIRST_NAME,
    SALARY,
    DEPARTMENT_ID
FROM
    HR.EMPLOYEES
ORDER BY
    DEPARTMENT_ID,
    SALARY;

-- Order by 3rd column (DEPARTMENT_ID)
SELECT
    FIRST_NAME,
    SALARY,
    DEPARTMENT_ID
FROM
    HR.EMPLOYEES
ORDER BY
    3 DESC;

SELECT
    FIRST_NAME,
    SALARY,
    DEPARTMENT_ID
FROM
    HR.EMPLOYEES
ORDER BY
    3 ASC;

--------------------------------------------------
-- NULL CONTROL IN SORTING
--------------------------------------------------

SELECT
    FIRST_NAME,
    SALARY,
    COMMISSION_PCT
FROM
    HR.EMPLOYEES
ORDER BY
    COMMISSION_PCT DESC NULLS LAST;

--------------------------------------------------
-- DISTINCT
--------------------------------------------------

SELECT DISTINCT
    DEPARTMENT_ID
FROM
    HR.EMPLOYEES;

SELECT DISTINCT
    DEPARTMENT_ID,
    JOB_ID
FROM
    HR.EMPLOYEES;

--------------------------------------------------
-- FETCH FIRST (Oracle 12c+)
--------------------------------------------------

SELECT
    FIRST_NAME,
    SALARY
FROM
    HR.EMPLOYEES
ORDER BY
    SALARY DESC
FETCH FIRST 5 ROWS ONLY;

--------------------------------------------------
-- OFFSET + FETCH
--------------------------------------------------

SELECT
    FIRST_NAME,
    SALARY
FROM
    HR.EMPLOYEES
ORDER BY
    SALARY DESC
OFFSET 10 ROWS
FETCH NEXT 5 ROWS ONLY;

--------------------------------------------------
-- WRONG (Oracle has no LIMIT keyword)
--------------------------------------------------

-- SELECT * FROM HR.EMPLOYEES LIMIT 3;

--------------------------------------------------
-- STRING FUNCTIONS
--------------------------------------------------

SELECT
    UPPER(FIRST_NAME) AS UPPER_NAME,
    LOWER(LAST_NAME) AS LOWER_NAME,
    LENGTH(FIRST_NAME) AS NAME_LENGTH,
    SUBSTR(FIRST_NAME, 1, 3) AS FIRST_3_CHARS,
    FIRST_NAME || ' ' || LAST_NAME AS FULL_NAME
FROM
    HR.EMPLOYEES
WHERE
    ROWNUM <= 3;

--------------------------------------------------
-- NUMBER FUNCTIONS
--------------------------------------------------

SELECT
    SALARY,
    ROUND(SALARY / 30, 2) AS ROUND_VALUE,
    TRUNC(SALARY / 30, 2) AS TRUNC_VALUE,
    MOD(SALARY, 1000) AS REMAINDER,
    ABS(-SALARY) AS ABSOLUTE_VALUE
FROM
    HR.EMPLOYEES
WHERE
    ROWNUM <= 3;

--------------------------------------------------
-- DATE FUNCTIONS
--------------------------------------------------

SELECT
    HIRE_DATE,
    TO_CHAR(HIRE_DATE, 'DD-MON-YYYY') AS FORMATTED_DATE,
    ROUND(MONTHS_BETWEEN(SYSDATE, HIRE_DATE) / 12) AS YEARS_OF_SERVICE,
    ADD_MONTHS(HIRE_DATE, 12) AS ONE_YEAR_LATER,
    TRUNC(SYSDATE, 'MM') AS FIRST_DAY_OF_MONTH
FROM
    HR.EMPLOYEES
WHERE
    ROWNUM <= 3;
```

```sql
-- NULL FUNCTIONS

SELECT
    NVL(COMMISSION_PCT, 0),
    NVL2(COMMISSION_PCT, 'Has', 'None'),
    COALESCE(COMMISSION_PCT, 0.05, 0)
FROM
    HR.EMPLOYEES
WHERE
    ROWNUM <= 3;
```
