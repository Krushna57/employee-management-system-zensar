# Employee Management System

## Introduction
The **Employee Management System** is a Java-based application designed to manage employee records efficiently. This system provides functionalities for adding, updating, deleting, and viewing employee details. It is a simple yet powerful tool for organizations to keep track of their workforce.

## Features
- Add new employees with details such as name, age, department, and salary.
- View all employee records in a structured format.
- Update existing employee details.
- Delete employee records.
- Search for employees by ID or name.
- Display all employee records.
- Increase all employees' salaries by a percentage.
- Delete all employee records.

## Technology Stack
- **Programming Language**: Java
- **Database**: MySQL
- **IDE**: Eclipse

## Prerequisites
1. Install Java Development Kit (JDK) 8 or higher.
2. Set up a relational database like MySQL.
3. Install a database client (e.g., MySQL Workbench).
4. Optionally, install an IDE for Java development.

## Setup and Installation

### 1. Clone the Repository
```bash
$ git clone https://github.com/Krushna57/employee-management-system-zensar.git
$ cd employee-management-system-zensar
```

### 2. Configure the Database
- Create a database named `employee_management`.
- Run the provided `schema.sql` script to create necessary tables.

### Example Schema
```sql
CREATE DATABASE employee_management;

USE employee_management;

CREATE TABLE employees (
    id INT PRIMARY KEY,
    age INT NOT NULL,
    fname VARCHAR(255) NOT NULL,
    lname VARCHAR(255) NOT NULL,
    salary FLOAT NOT NULL
);
```

### 3. Update Database Credentials
Update the database credentials in the Java application:
```java
// Example: DBConnection.java
Class.forName("com.mysql.cj.jdbc.Driver");
con = DriverManager.getConnection("jdbc:mysql://localhost:3307/employee_management?useSSL=false","root","admin");
```

### 4. Build and Run the Application
- Compile the application:
  ```bash
  $ javac -d bin src/com/acc/**/*.java
  ```
- Run the application:
  ```bash
  $ java -cp bin com.acc.EmployeeManager
  ```

## Usage
1. Launch the application.
2. Choose an operation from the menu:
   - Display All Employee Records
   - Find Employee Record
   - Add New Employee Record
   - Delete Employee Record
   - Update Employee Age
   - Update Employee Salary
   - Delete All Employee Records
   - Increase All Employees Salary by Percentage
3. Follow the on-screen instructions to perform actions.

## Directory Structure
```
EmployeeManagementSystem/
|-- src/
|   |-- com/
|       |-- acc/
|           |-- model/
|               |-- Employee.java
|           |-- service/
|               |-- Operable.java
|               |-- OperableImp1.java
|           |-- util/
|               |-- DBConnection.java
|           |-- EmployeeManager.java
|-- bin/
|-- schema.sql
|-- README.md
```

## Future Enhancements
- Implement a graphical user interface (GUI) using JavaFX or Swing.
- Add authentication and role-based access control.
- Generate detailed reports for management.
- Deploy as a web application using Spring Boot.

## Contact
For questions or feedback, contact:
- **Name**: krushna sahane
- **College Name**: AVCOE Sangamner
- **Departments**: Computer Engineering
- **Email**: krushnasahane57@gmail.com

