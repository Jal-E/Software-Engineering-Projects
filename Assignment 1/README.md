# Assignment 1: Object-Oriented Programming Concepts in Java

## Overview
This repository contains the implementation of four fundamental object-oriented programming concepts in Java:

- **Inheritance** ("IS-A" Relationship)
- **Polymorphism**
- **Aggregation** ("HAS-A" Relationship)
- **Composition** ("OWN-A" Relationship)

Each concept is implemented in a separate Java program, demonstrating its use through real-world examples.

## Table of Contents
1. [Inheritance](#inheritance)
2. [Polymorphism](#polymorphism)
3. [Aggregation](#aggregation)
4. [Composition](#composition)
5. [How to Run](#how-to-run)

## Inheritance
- **Classes**: `Employee`, `SalariedEmployee`, `HourlyEmployee`, `CommissionEmployee`, `BaseEmployee`
- **Description**: Demonstrates the "IS-A" relationship where different types of employees inherit common properties and methods from the base `Employee` class.
- **Key Features**:
  - Subclasses inherit attributes and methods from the `Employee` class.
  - Method overriding to calculate and display employee-specific information.

## Polymorphism
- **Classes**: `Ship`, `CruiseShip`, `CargoShip`
- **Description**: Demonstrates polymorphism by using a base class `Ship` and two derived classes `CruiseShip` and `CargoShip`.
- **Key Features**:
  - Overriding the `print` method in derived classes.
  - Using an array of `Ship` references to call overridden methods, showcasing polymorphic behavior.

## Aggregation
- **Classes**: `Course`, `Instructor`, `Textbook`
- **Description**: Demonstrates the "HAS-A" relationship, where a `Course` object aggregates `Instructor` and `Textbook` objects.
- **Key Features**:
  - A `Course` contains references to `Instructor` and `Textbook`.
  - Methods to access and display aggregated data.

## Composition
- **Classes**: `Folder`, `File`
- **Description**: Demonstrates the "OWN-A" relationship, where a `Folder` object owns `File` objects and other `Folder` objects.
- **Key Features**:
  - Recursive structure allowing folders to contain other folders and files.
  - Lifetime of contained objects (`File`, subfolders) is managed by the parent `Folder`.

## How to Run
1. **Clone the repository**:
    ```bash
    git clone https://github.com/Jal-E/Software-Engineering-Projects.git
    ```
2. **Navigate to the 'Assignment 1' directory**:
    ```bash
    cd Software-Engineering-Projects/Assignment\ 1
    ```
3. **Navigate to the specific project folder** (`Aggregation`, `Composition`, `Inheritance`, `Polymorphism`) and compile and run the Java programs:
    ```bash
    cd Inheritance
    javac src/Main.java
    java src/Main
    ```
    Replace `Inheritance` with the name of the folder you want to run.
