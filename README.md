# Campus Course & Records Manager (CCRM)

## 1. Project Overview

The Campus Course & Records Manager (CCRM) is a console-based Java application designed for an educational institute to manage student records, course catalogs, enrollments, and grades. It provides a command-line interface (CLI) for administrators to perform various operations like adding students, creating courses, enrolling students, recording grades, and generating transcripts. The project also includes file utilities for data import/export and backup management.

This project is built using Java SE and demonstrates a wide range of core Java concepts, from object-oriented programming principles to modern APIs like NIO.2, Streams, and the Date/Time API.

## 2. How to Run

### Prerequisites
* Java Development Kit (JDK) 11 or higher.

### Steps
1.  **Clone the Repository:**
    ```bash
    git clone <your-repository-link>
    cd CCRM_Project
    ```
2.  **Compile the Code:**
    Navigate to the `src` directory and run the `javac` compiler.
    ```bash
    cd src
    javac edu/ccrm/cli/MainMenu.java -d ../bin 
    ```
    (Note: This might require compiling files in order. Using an IDE like Eclipse or IntelliJ is recommended for easier compilation.)

3.  **Run the Application:**
    Navigate to the `bin` directory (or wherever the compiled `.class` files are) and run the main class.
    ```bash
    cd ../bin
    java edu.ccrm.cli.MainMenu
    ```

4.  **Enable Assertions:**
    To run the application with assertions enabled (as used in the `Course.Builder` class), use the `-ea` flag.
    ```bash
    java -ea edu.ccrm.cli.MainMenu
    ```

## 3. Technical Explanations

### Evolution of Java (Short Timeline)
* **1995:** Java 1.0 released by Sun Microsystems.
* **1998:** J2SE 1.2 released, introducing Swing and Collections Framework.
* **2004:** J2SE 5.0 (Tiger) released, adding Generics, Enums, Annotations, and Autoboxing.
* **2011:** Java SE 7 released by Oracle, with features like Strings in switch and try-with-resources.
* **2014:** Java SE 8, a major release introducing Lambda Expressions, the Stream API, and a new Date/Time API.
* **2017:** Java SE 9 introduced the Module System (Project Jigsaw).
* **2018:** New 6-month release cadence begins. Java SE 11 (LTS) released.
* **2021:** Java SE 17 (LTS) released.

### Java ME vs SE vs EE

| Feature           | Java ME (Micro Edition)                             | Java SE (Standard Edition)                            | Java EE (Enterprise Edition)                            |
| ----------------- | --------------------------------------------------- | ----------------------------------------------------- | ------------------------------------------------------- |
| **Target** | Resource-constrained devices (e.g., mobile, IoT)    | Desktop, servers, general-purpose applications        | Large-scale, distributed, web-based enterprise apps     |
| **Core API** | A subset of Java SE's API + specific mobile libraries | The core Java programming platform (Core APIs)        | Builds on top of Java SE, adding APIs for web services  |
| **Components** | `CLDC`, `CDC` configurations; `MIDP` profiles          | `JDK`, `JRE`, `JVM`                                   | Servlets, JSP, EJB, JPA, etc.                           |
| **Typical Use** | Old feature phones, embedded systems                | This project (CCRM), desktop GUI apps (Swing, JavaFX) | Banking systems, e-commerce sites, web portals          |

### Java Architecture: JDK, JRE, JVM

* **JVM (Java Virtual Machine):** The JVM is an abstract machine. It's a specification that provides a runtime environment in which Java bytecode can be executed. It interprets the compiled `.class` file and executes it on the host machine, which makes Java "write once, run anywhere."
* **JRE (Java Runtime Environment):** The JRE is the implementation of the JVM. It contains the JVM, core libraries, and other components necessary to *run* Java applications. If you only want to run a Java program, you only need the JRE.
* **JDK (Java Development Kit):** The JDK is a full-featured software development kit for Java. It contains everything in the JRE, plus development tools like the compiler (`javac`), debugger (`jdb`), and archiver (`jar`). You need the JDK to *develop* Java applications.

**Interaction:** `JDK` > `JRE` > `JVM`. A developer writes code and uses the `JDK` to compile it. The compiled code is then run on a machine with a `JRE`, which uses its `JVM` to execute the code.

## 4. Setup and Installation


### Installing Java on Windows
1.  Download the JDK from the official Oracle website or an open-source provider like Adoptium (Temurin).
2.  Run the installer and follow the on-screen instructions.
3.  Set the `JAVA_HOME` environment variable to your JDK installation directory (e.g., `C:\Program Files\Java\jdk-17`).
4.  Add the JDK's `bin` directory to the system `Path` variable (e.g., `%JAVA_HOME%\bin`).
5.  **Verification:** Open a new command prompt and run `java -version` and `javac -version`.


### Using Eclipse IDE
1.  Go to `File > New > Java Project`.
2.  Enter a project name (e.g., `CCRM_Project`).
3.  Select the appropriate JRE.
4.  Create packages by right-clicking the `src` folder and selecting `New > Package`.
5.  Create classes within those packages.
6.  To run the project, right-click `MainMenu.java` and select `Run As > Java Application`.

## 5. Syllabus Topic to Code Mapping

| Syllabus Topic | File / Class / Method Where Demonstrated |
|---|---|
| **Packages & `main` class** | `edu.ccrm.cli.MainMenu` and overall project structure. |
| **Primitives, Objects, Operators** | Used throughout. Bitwise operators specifically in `RecursiveFileUtils.demoControlFlow()`. |
| **Decision Structures (if, switch)** | `MainMenu.java` (enhanced switch), `StudentMenu.java` (if-else). |
| **Loops (while, for, enhanced-for)** | `MainMenu.java` (while loop), `StudentMenu.java` (enhanced-for loop to list students). |
| **Jump Control (break, labeled break)** | Labeled break in `RecursiveFileUtils.demoControlFlow()`. |
| **Arrays & `Arrays` class** | `StudentService` could use `Arrays.sort()` on student registration numbers if stored in an array. |
| **Strings & common methods** | `FileService.java` for splitting CSV lines (`line.split(",")`). |
| **OOP: Encapsulation** | `Person.java` (private fields, public getters/setters). |
| **OOP: Inheritance** | `Student.java extends Person`. |
| **OOP: Abstraction (abstract class)** | `Person.java` is an abstract class with an abstract `getProfile()` method. |
| **OOP: Polymorphism** | Calling `getProfile()` on a `Person` reference holding a `Student` object. |
| **Access Levels** | Used throughout (public classes, private fields, protected members). |
| **Constructors in Inheritance (`super`)** | `Student` constructor calls `super(name, email)`. |
| **Immutability** | `CourseCode.java` is an immutable class with final fields. |
| **Nested Classes (static, inner)** | `Course.Builder` is a static nested class. An anonymous inner class is used for sorting in `ReportService`. |
| **Interfaces** | `Searchable.java`. |
| **Diamond Problem Resolution** | A class implementing `Loggable` and `Archivable` would be forced to override `log()`. |
| **Functional Interfaces & Lambdas** | `CourseService` uses lambda predicates in `.filter()`. `ReportService` uses a Comparator lambda. |
| **Anonymous Inner Classes** | `ReportService` uses one for a custom comparator demonstration. |
| **Enums with Constructors & Fields**| `Grade.java` and `Semester.java`. |
| **Upcast & Downcast (`instanceof`)** | A `Person` object can be downcast to `Student` after an `instanceof Student` check. |
| **Overriding & Overloading**| `Student.java` overrides `getProfile()` and `toString()`. Overloading could be done with multiple `add` methods. |
| **Design Pattern: Singleton**| `AppConfig.java` and `DataStore.java`. |
| **Design Pattern: Builder**| `Course.java` uses the Builder pattern via its static nested `Builder` class. |
| **Exceptions (custom, try-catch)** | `DuplicateEnrollmentException.java`, `FileService.java` uses try-with-resources and multi-catch. |
| **Assertions** | `Course.Builder.build()` uses an assertion to validate credits. |
| **File I/O (NIO.2 `Path`, `Files`)** | `BackupService.java` uses `Files.createDirectories()`, `Files.copy()`. |
| **I/O with Streams** | `FileService.java` uses `Files.lines()` to read files as a stream. |
| **Stream API Pipeline**| `ReportService.printGpaDistribution()` uses `map`, `collect`, `groupingBy`. |
| **Date/Time API** | `BackupService.java` uses `LocalDateTime` for timestamps. `Student.java` uses `LocalDate`. |
| **Recursion** | `RecursiveFileUtils.calculateDirectorySize(Path)`. |

## 6. USAGE - Sample Commands & Data

When you run the application, you will be greeted with the main menu.

**Sample Workflow:**
1.  On start, the app attempts to load data from `data/students.csv` and `data/courses.csv`.
2.  Select `1. Manage Students` -> `1. List All Students` to see the imported data.
3.  Select `2. Manage Courses` -> `3. Search Courses` to filter courses by department (e.g., `CS`).
4.  Select `3. Manage Enrollment & Grades` to enroll a student in a course and assign a grade.
5.  Select `4. Data Utilities` -> `2. Export All Data` to save the current state.
6.  Select `4. Data Utilities` -> `3. Create a Backup`. A new timestamped folder will be created in the `backups/` directory.
7.  Select `5. View Reports` to see stream-based data aggregations.

### Data File Format (`test-data` folder)
The application can import data from simple CSV files.

**`students.csv`**
```csv
ID,RegNo,FirstName,LastName,Email
101,S2024001,John,Doe,john.doe@example.com
...