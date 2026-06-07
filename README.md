# Java Library Management System

A console-based library management system built in Java, demonstrating core object-oriented programming principles including encapsulation, static fields, constructors, and ArrayList-based data management.

---

## Overview

This project simulates a real-world library system where books can be cataloged, searched, checked out, and returned by registered members. It was built from memory as a demonstration of fundamental Java OOP concepts.

---

## Features

- Add and remove books from the library catalog
- Register and remove library members
- Check out and return books with availability tracking
- Search the catalog by title, ISBN, or author
- Automatic member ID generation via static field
- Automatic book count tracking via static field
- Full encapsulation with protected internal data structures

---

## Project Structure

```
Java-Library-Management-System/
│
├── Book.java       # Book entity with checkout/return logic and availability tracking
├── Member.java     # Member entity with personal checkout list management
├── Library.java    # Core catalog and member registry with search functionality
└── Main.java       # Driver class demonstrating all system features
```

---

## Concepts Demonstrated

| Concept | Where Used |
|---|---|
| Classes & Constructors | `Book`, `Member`, `Library` |
| Encapsulation | Private fields, public getters/setters throughout |
| Static Fields | `totalBooks` in `Book`, `nextId` in `Member` |
| ArrayLists | Catalog, member registry, checked out books |
| Defensive Copying | `getCatalog()`, `getMembers()`, `getCheckedOutBooks()` |
| Method Design | Single-responsibility methods across all classes |
| toString() Override | All three classes |

---

## How to Run

1. Clone the repository
```bash
git clone https://github.com/LAF06/Java-Library-Management-System.git
```
2. Navigate to the project folder
```bash
cd Java-Library-Management-System
```
3. Compile all files
```bash
javac *.java
```
4. Run the program
```bash
java Main
```

---

## Author

**Luis** | [GitHub: LAF06](https://github.com/LAF06)

*First project in a series demonstrating progressive Java development — from core OOP fundamentals through advanced concepts.*

---

## Coming Soon

This is the first of several Java projects. Future repositories will cover inheritance, polymorphism, interfaces, file I/O, and more complex system design.
