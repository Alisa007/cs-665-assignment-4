| CS-665       | Software Design & Patterns |
| ------------ | -------------------------- |
| Name         | ALISA BELOUSOVA            |
| Date         | 11/07/2023                 |
| Course       | Fall                       |
| Assignment # | 4                          |

# Assignment Overview

The primary objective of this assignment is to demonstrate the application of software design principles and patterns to create a system that integrates two distinct interfaces: an outdated legacy system and a newly developed system for managing customer data. The legacy system operates through a USB interface to access binary customer data, while the new system employs a secure HTTPS connection and a REST API.

# GitHub Repository Link:

https://github.com/alisa007/cs-665-assignment-4

# Implementation Description

## **Flexibility**

The implementation of the adapter design pattern provides a high degree of flexibility. This pattern creates a middle layer that translates calls between the new and legacy systems. Should the need arise to introduce new object types or data sources, one can simply extend or modify the adapter without altering the core logic of either system. This ensures that future enhancements or replacements of either system can be accommodated with minimal code changes.

## **Simplicity and Understandability**

Clarity has been prioritized in the codebase, with a focus on self-explanatory method names, succinct comments, and a logical structure that mirrors the flow of data between systems. Each component is responsible for a single aspect of the functionality, adhering to the Single Responsibility Principle. This approach facilitates ease of understanding and maintenance for other developers who may work on this system.

## **Avoidance of Duplication**

DRY (Don't Repeat Yourself) principles have been meticulously followed to prevent code duplication. Common functionalities are extracted into separate methods or classes, which can be reused across different parts of the application. This not only reduces the codebase size but also centralizes the logic, making it easier to update and reducing the risk of inconsistencies.

## **Design Patterns**

The Adapter pattern was chosen for its ability to reconcile the differences between the legacy and new systems' interfaces. By encapsulating the differences within the adapter, the rest of the application can interact with the legacy system as if it were the new system, thus ensuring compatibility and simplifying integration. This pattern is particularly well-suited for situations where altering existing interfaces is impractical or impossible, as is the case with many legacy systems.

# Commands

## Compile

Type on the command line:

```bash
mvn clean compile
```

## JUnit Tests

To run, use the following command:

```bash
mvn clean test
```

## Spotbugs

Use the following command:

```bash
mvn spotbugs:gui 
```

## Checkstyle

The following command will generate a report in HTML format that you can open in a web browser.

```bash
mvn checkstyle:checkstyle
```

The HTML page will be found at the following location:
`target/site/checkstyle.html`
