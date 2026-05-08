<div align="center">

<!-- Animated Header Banner -->
<img src="https://capsule-render.vercel.app/api?type=waving&color=0:0f2027,50:203a43,100:2c5364&height=200&section=header&text=Employee%20Management%20System&fontSize=40&fontColor=ffffff&fontAlignY=38&desc=Java%20%7C%20JDBC%20%7C%20MySQL%20%7C%20Console%20App&descAlignY=58&descSize=18&animation=fadeIn" width="100%"/>

<!-- Badges Row -->
<p>
  <img src="https://img.shields.io/badge/Java-ED8B00?style=for-the-badge&logo=openjdk&logoColor=white"/>
  <img src="https://img.shields.io/badge/MySQL-005C84?style=for-the-badge&logo=mysql&logoColor=white"/>
  <img src="https://img.shields.io/badge/JDBC-007396?style=for-the-badge&logo=java&logoColor=white"/>
  <img src="https://img.shields.io/badge/VS%20Code-007ACC?style=for-the-badge&logo=visual-studio-code&logoColor=white"/>
</p>

<p>
  <img src="https://img.shields.io/badge/Status-Complete-brightgreen?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Type-Console%20App-blueviolet?style=for-the-badge"/>
  <img src="https://img.shields.io/badge/Level-Beginner%20Friendly-orange?style=for-the-badge"/>
</p>

<!-- Typing animation using readme-typing-svg -->
<a href="https://git.io/typing-svg">
  <img src="https://readme-typing-svg.demolab.com?font=Fira+Code&size=22&pause=1000&color=2C9CF7&center=true&vCenter=true&width=600&lines=Console-Based+HR+Management+System;Add+%7C+View+%7C+Search+%7C+Update+%7C+Delete;Built+with+Java+%2B+JDBC+%2B+MySQL;Clean+OOP+Architecture+%F0%9F%9A%80" alt="Typing SVG" />
</a>

</div>

---

## 📋 Table of Contents

- [✨ About](#-about)
- [🎯 Features](#-features)
- [🛠️ Tech Stack](#️-tech-stack)
- [📁 Project Structure](#-project-structure)
- [⚙️ Setup & Installation](#️-setup--installation)
- [🚀 How to Run](#-how-to-run)
- [🔐 Login Credentials](#-login-credentials)
- [🗄️ Database Schema](#️-database-schema)
- [🔄 Application Flow](#-application-flow)
- [💡 OOP Concepts Used](#-oop-concepts-used)
- [📈 Future Improvements](#-future-improvements)
- [👨‍💻 Author](#-author)

---

## ✨ About

> A **Console-Based Employee Management System** built in Java, designed to simulate real-world HR software used in companies to manage employee records efficiently.

This project demonstrates:
- 🔌 **Database Connectivity** via JDBC
- ✅ **Real CRUD Operations**
- 🏗️ **Object-Oriented Design**
- 📂 **File Export Feature**
- 🔐 **Authentication System**
- 🧪 **Input Validation**

---

## 🎯 Features

| Feature | Description |
|--------|-------------|
| ➕ **Add Employee** | Insert new employee record into database |
| 👁️ **View Employees** | Display all employee records in table format |
| 🔍 **Search Employee** | Find employee by ID or name |
| ✏️ **Update Employee** | Modify existing employee details |
| 🗑️ **Delete Employee** | Remove employee from the system |
| 🏢 **Department Filter** | View employees by specific department |
| 💰 **Salary Filter** | View employees within salary range |
| 📤 **Export Data** | Export employee data to `.txt` file |
| 🔒 **Admin Login** | Secure access with username/password |

---

## 🛠️ Tech Stack

<div align="center">

| Technology | Purpose |
|------------|---------|
| ☕ **Java** | Core programming language |
| 🗄️ **MySQL** | Relational database |
| 🔌 **JDBC** | Java ↔ MySQL connectivity |
| 💻 **VS Code** | Development environment |
| 📁 **File I/O** | Data export feature |
| 🧩 **OOP** | Code architecture |

</div>

---

## 📁 Project Structure

```
EMPLOYEE MANAGEMENT SYSTEM
│
├── 📂 lib/
│   └── mysql-connector-j-9.7.0.jar       ← MySQL JDBC Driver
│
├── 📂 src/
│   ├── 📂 auth/
│   │   └── AdminLogin.java                ← Authentication Logic
│   │
│   ├── 📂 database/
│   │   └── DBConnection.java              ← MySQL Connection Handler
│   │
│   ├── 📂 main/
│   │   └── Main.java                      ← Entry Point + Menu Controller
│   │
│   ├── 📂 model/
│   │   └── Employee.java                  ← Employee Data Model
│   │
│   ├── 📂 service/
│   │   └── EmployeeService.java           ← Business Logic + CRUD
│   │
│   └── 📂 util/
│       ├── Validation.java                ← Input Validation
│       └── FileExporter.java              ← Export Feature
│
├── 📂 out/                                ← Compiled .class Files
│
└── 📂 .vscode/
    └── settings.json
```

---

## ⚙️ Setup & Installation

### ✅ Prerequisites

Make sure you have the following installed:

- [Java JDK 11+](https://www.oracle.com/java/technologies/downloads/)
- [MySQL Server](https://dev.mysql.com/downloads/mysql/)
- [VS Code](https://code.visualstudio.com/) *(with Java Extension Pack)*
- MySQL JDBC Connector *(already in `/lib` folder)*

---

### 🗄️ Database Setup

Open **MySQL Workbench** or any MySQL client and run the following:

```sql
-- Create the database
CREATE DATABASE employee_db;

-- Use it
USE employee_db;

-- Create the employees table
CREATE TABLE employees (
    id         INT AUTO_INCREMENT PRIMARY KEY,
    name       VARCHAR(100)   NOT NULL,
    email      VARCHAR(100)   UNIQUE NOT NULL,
    department VARCHAR(50)    NOT NULL,
    salary     DOUBLE         NOT NULL
);
```

---

### ⚙️ Configure Database Connection

Open `src/database/DBConnection.java` and update your MySQL credentials:

```java
String url      = "jdbc:mysql://localhost:3306/employee_db";
String username = "root";         // your MySQL username
String password = "yourpassword"; // your MySQL password
```

---

## 🚀 How to Run

### Using VS Code:

```bash
# Step 1: Clone the repository
git clone https://github.com/niraj-codes-07/employee-management-system.git

# Step 2: Open in VS Code
cd employee-management-system

# Step 3: Make sure JDBC .jar is in /lib folder

# Step 4: Run Main.java from VS Code
# Right-click Main.java → Run Java
```

### Using Terminal:

```bash
# Compile
javac -cp lib/mysql-connector-j-9.7.0.jar -d out src/**/*.java

# Run
java -cp "out;lib/mysql-connector-j-9.7.0.jar" main.Main
```
> **On Linux/macOS**, replace `;` with `:` in the classpath.

---

## 🔐 Login Credentials

```
╔══════════════════════════════╗
║      🔒 Admin Login Panel    ║
╠══════════════════════════════╣
║  Username  :   admin         ║
║  Password  :   admin123      ║
╚══════════════════════════════╝
```

> ⚠️ Password is currently stored in plain text. Hashing (BCrypt) is planned for future versions.

---

## 🗄️ Database Schema

```
Database : employee_db
Table    : employees
```

| Column | Type | Constraint |
|--------|------|------------|
| `id` | INT | PRIMARY KEY, AUTO_INCREMENT |
| `name` | VARCHAR(100) | NOT NULL |
| `email` | VARCHAR(100) | UNIQUE, NOT NULL |
| `department` | VARCHAR(50) | NOT NULL |
| `salary` | DOUBLE | NOT NULL |

---

## 🔄 Application Flow

```
🟢 Start Application
        │
        ▼
🔐 Admin Login  ──── ❌ Wrong Password → Access Denied
        │
     ✅ Correct
        │
        ▼
📋 Main Menu
  ├── 1. Add Employee
  ├── 2. View All Employees
  ├── 3. Search Employee
  ├── 4. Update Employee
  ├── 5. Delete Employee
  ├── 6. Filter by Department
  ├── 7. Filter by Salary
  ├── 8. Export to File
  └── 9. Exit
        │
        ▼
🧪 Validation Check
        │
        ▼
⚡ JDBC Executes SQL Query
        │
        ▼
🗄️ MySQL Stores/Retrieves Data
        │
        ▼
✅ Output Displayed to User
```

---

## 💡 OOP Concepts Used

| Concept | Implementation |
|---------|---------------|
| **Class & Object** | `Employee` class with objects |
| **Encapsulation** | Private fields + Getters/Setters in `Employee.java` |
| **Abstraction** | Service layer hides SQL complexity |
| **Modularity** | Separate packages for each concern |
| **Separation of Concerns** | Model / Service / Util layers |

---

## 📸 Sample Console Output

```
╔════════════════════════════════════════╗
║    EMPLOYEE MANAGEMENT SYSTEM          ║
╠════════════════════════════════════════╣
║  1. Add Employee                       ║
║  2. View All Employees                 ║
║  3. Search Employee                    ║
║  4. Update Employee                    ║
║  5. Delete Employee                    ║
║  6. Filter by Department               ║
║  7. Filter by Salary Range             ║
║  8. Export Data to File                ║
║  9. Exit                               ║
╚════════════════════════════════════════╝
Enter your choice: _
```

---

## 📈 Future Improvements

| Upgrade | Benefit |
|---------|---------|
| 🖥️ **Swing / JavaFX GUI** | Better visual interface |
| 🌐 **Spring Boot API** | RESTful backend |
| 🔑 **Password Hashing (BCrypt)** | Enhanced security |
| 📊 **CSV / PDF Export** | Professional reporting |
| 👥 **Role-based Login** | Multi-user access levels |
| ☁️ **Cloud Database** | Remote data access |

---

## ⚠️ Known Limitations

- 🖥️ Console-based only (no GUI)
- 🔓 Password not encrypted
- 👤 Single admin user only
- 🌐 No network/multi-user support

---

## 👨‍💻 Author

<div align="center">

<img src="https://avatars.githubusercontent.com/niraj-codes-07" width="100px" style="border-radius:50%"/>

### Niraj
**Java Developer | CS Student**

[![GitHub](https://img.shields.io/badge/GitHub-niraj--codes--07-black?style=for-the-badge&logo=github)](https://github.com/niraj-codes-07)

</div>

---

<div align="center">

### ⭐ If you found this project helpful, please give it a Star!

<img src="https://capsule-render.vercel.app/api?type=waving&color=0:2c5364,50:203a43,100:0f2027&height=120&section=footer" width="100%"/>

</div>
