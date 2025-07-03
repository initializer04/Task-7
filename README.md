# Task-7

# 👨‍💼 Java JDBC Employee Management App

A **console-based Java application** that performs **CRUD (Create, Read, Update, Delete)** operations on an employee database using **JDBC** and **PostgreSQL**.

> 🔧 This project helps you master Java-PostgreSQL integration using the JDBC API with real-world functionality.

---

## 📚 Table of Contents

- [Features](#-features)
- [Technologies Used](#-technologies-used)
- [Project Structure](#-project-structure)
- [Database Setup](#-database-setup)
- [JDBC Driver Setup](#-jdbc-driver-setup)
- [VS Code Setup](#-vs-code-setup)
- [How to Run](#-how-to-run)
- [Sample Demo](#-sample-demo)


---

## ✨ Features

✅ Add new employee  
✅ View all employees  
✅ Update existing employee details  
✅ Delete an employee by ID  
✅ PostgreSQL integration using JDBC  
✅ Clean modular Java code (DAO pattern)

---

## 🛠️ Technologies Used

- **Java** (JDK 8 or higher)
- **JDBC API**
- **PostgreSQL** (as backend database)
- **VS Code** (or any Java IDE)
- **PostgreSQL JDBC Driver**

---

## 📂 Project Structure
Java-JDBC-EmployeeApp/
├── lib/ # Contains JDBC .jar driver
├── src/ # Java source files
│ ├── DBConnection.java # DB connection logic
│ ├── Employee.java # Model class
│ ├── EmployeeDAO.java # CRUD operations
│ └── Main.java # Entry point and CLI
├── .gitignore
├── README.md

## 🛢️ Database Setup

1. Open PostgreSQL terminal or pgAdmin.
2. Run the following SQL:

```sql
CREATE DATABASE employee_db;

\c employee_db

CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(100),
    department VARCHAR(50),
    salary NUMERIC
);
🔗 JDBC Driver Setup
Download PostgreSQL JDBC driver from:
👉 https://jdbc.postgresql.org/download/

Place the .jar file (e.g., postgresql-42.7.3.jar) in the lib/ directory of your project.

💡 VS Code Setup
If you're using Visual Studio Code:

Install the Extension Pack for Java.

Create .vscode/settings.json:

json
Copy
Edit
{
  "java.project.referencedLibraries": [
    "lib/**/*.jar"
  ]
}
This tells VS Code to include the JDBC driver during compilation.

▶️ How to Run
📌 Compile the Code
bash
Copy
Edit
javac -cp "lib/*" src/*.java
🏃 Run the App
bash
Copy
Edit
java -cp "lib/*;src" Main
🧪 Sample Demo
markdown
Copy
Edit
===== Employee DB App =====
1. Add Employee
2. View All Employees
3. Update Employee
4. Delete Employee
5. Exit
Enter choice:
✅ Example:

mathematica
Copy
Edit
Enter choice: 1
Enter name: Alice
Enter department: IT
Enter salary: 80000
✅ Employee added!

Enter choice: 2
-- Employee List --
1 | Alice | IT | $80000.0
