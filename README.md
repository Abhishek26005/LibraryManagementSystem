# 📚 Library Management System using Core Java

A console-based **Library Management System** developed using Core Java. This project helps librarians manage books, register members, issue and return books, search the library collection, and track book availability.

## 📌 Project Overview

The Library Management System is a menu-driven Java application designed to simplify basic library operations. It uses object-oriented programming concepts and the Java Collections Framework to manage books and members.

## ✨ Features

### 1. Book Management
- Add new books to the library.
- View all available and issued books.
- Search books by book ID or title.
- Display book details, including title, author, and availability status.

### 2. Member Management
- Register new library members.
- View registered member details.
- Maintain member information using unique member IDs.

### 3. Issue and Return Books
- Issue available books to registered members.
- Prevent issuing books that are already issued.
- Return previously issued books.
- Validate book and member details during transactions.

### 4. Library Records
- View currently issued books.
- Identify the member who has borrowed each book.
- Track the availability status of books.

## 🛠️ Technologies Used

- **Programming Language:** Java
- **Java Version:** JDK 8 or above
- **Concepts:** Object-Oriented Programming (OOP)
- **Collections Framework:** HashMap, Map
- **User Input:** Scanner
- **Application Type:** Console-Based Application
- **IDE:** Eclipse / IntelliJ IDEA / Visual Studio Code

## 📂 Project Structure

```text
LibraryManagementSystem/
│
└── src/
    ├── Main.java
    ├── Book.java
    ├── Member.java
    └── Library.java
```

### File Description

| File | Description |
|---|---|
| `Main.java` | Entry point of the application; displays the menu and handles user input. |
| `Book.java` | Defines book properties and manages book availability. |
| `Member.java` | Represents library members and their details. |
| `Library.java` | Manages books, members, searching, issuing, and returning books. |

## ⚙️ Prerequisites

Before running the project, ensure that you have:

- Java Development Kit (JDK 8 or above) installed.
- A Java IDE or terminal.
- Basic knowledge of Java programming.

Verify your Java installation:

```bash
java -version
javac -version
```

## 🚀 How to Run the Project

### Step 1: Clone the Repository

If your project is hosted on GitHub, clone it using:

```bash
git clone https://github.com/Abhishek26005/LibraryManagementSystem.git
```

Navigate to the project directory:

```bash
cd LibraryManagementSystem
```

### Step 2: Compile the Java Files

Open a terminal in the `src` directory and execute:

```bash
javac Book.java Member.java Library.java Main.java
```

### Step 3: Run the Application

```bash
java Main
```

**Note:** If you are using a Java IDE, open the project and run `Main.java` directly. Make sure all four classes belong to the same package, or leave them in the default package as shown in the project structure.

## 🖥️ Application Menu

When the application starts, the following menu is displayed:

```text
================================
   LIBRARY MANAGEMENT SYSTEM
================================
1. Add Book
2. View All Books
3. Search Book
4. Register Member
5. View Members
6. Issue Book
7. Return Book
8. View Issued Books
9. Exit

Enter your choice:
```

### Example Workflow

1. Select **Add Book** to add a book with its ID, title, and author.
2. Select **Register Member** to register a library member.
3. Select **Issue Book** and enter the book ID and member ID.
4. Select **View Issued Books** to see the current borrowing records.
5. Select **Return Book** to mark an issued book as available again.

## 🧠 Core Java Concepts Implemented

- **Classes and Objects:** Represent books, members, and the library.
- **Encapsulation:** Protect data using private fields and public methods.
- **Constructors:** Initialize book and member objects.
- **Collections Framework:** Store and retrieve records using `HashMap`.
- **Conditional Statements:** Validate user input and book availability.
- **Loops:** Repeat the menu until the user exits.
- **Methods:** Separate application operations into reusable methods.
- **Scanner Class:** Accept input from the user.

## ⚠️ Current Limitations

- Data is stored in memory and is lost when the application closes.
- The application does not use a database.
- Each book ID represents one physical copy.
- Login authentication, due dates, and late-return fines are not implemented.

## 🔮 Future Enhancements

- Integrate MySQL using JDBC for permanent data storage.
- Add librarian login and authentication.
- Implement book due dates and late-return fines.
- Support multiple copies of the same book.
- Add borrowing history and reports.
- Develop a graphical user interface using Java Swing or JavaFX.

## 🎯 Learning Objectives

This project demonstrates how Core Java can be used to build a practical, menu-driven application using object-oriented programming, collections, input handling, and basic validation.

## 👨‍💻 Abhishek Deshmukh

**Your Name**

## 📄 License

This project is intended for educational and learning purposes. You may modify and extend it for academic projects and personal practice.
