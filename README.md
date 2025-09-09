# Simple Calculator

A Java-based command-line calculator application built with Maven.

## Features

- Basic arithmetic operations:
  - Addition
  - Subtraction
  - Multiplication
  - Division
- Error handling for division by zero
- Unit tests for all operations

## Prerequisites

- Java JDK 11 or higher
- Maven 3.6 or higher

## Building the Project

To build the project, run:

```bash
mvn clean package
```

## Running the Application

After building, run the application with:

```bash
java -jar target/simple-calculator-1.0-SNAPSHOT.jar
```

## Running Tests

To run the tests:

```bash
mvn test
```

## Usage

1. Run the application
2. Choose an operation:
   - 1 for Addition
   - 2 for Subtraction
   - 3 for Multiplication
   - 4 for Division
   - 5 to Exit
3. Enter two numbers when prompted
4. View the result

## Project Structure

```
simple-calculator/
├── src/
│   ├── main/
│   │   └── java/
│   │       └── com/
│   │           └── example/
│   │               └── calculator/
│   │                   └── Calculator.java
│   └── test/
│       └── java/
│           └── com/
│               └── example/
│                   └── calculator/
│                       └── CalculatorTest.java
├── pom.xml
└── README.md
```

## Contributing

Feel free to fork the project and submit pull requests with improvements.
