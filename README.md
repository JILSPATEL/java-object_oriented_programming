# Java Object-Oriented Programming (OOP) Concepts

Welcome to the Java OOP Concepts repository! This repository serves as a learning resource to understand and practice the fundamental concepts of Object-Oriented Programming using Java. Whether you're new to programming or looking to refresh your knowledge, this repository aims to provide comprehensive explanations and hands-on examples.

## Table of Contents

- [Introduction to OOP](#introduction-to-oop)
- [Key Concepts](#key-concepts)
  - [Classes and Objects](#classes-and-objects)
  - [Inheritance](#inheritance)
  - [Polymorphism](#polymorphism)
  - [Encapsulation](#encapsulation)
  - [Abstraction](#abstraction)
  - [Static Keyword](#static)
- [Getting Started](#getting-started)
- [Examples](#examples)

## Introduction to OOP

Object-Oriented Programming (OOP) is a programming paradigm that organizes code into objects, each of which represents a real-world entity or concept. Java is an object-oriented programming language that provides a robust framework for developing software using OOP principles.

## Key Concepts

### Classes and Objects

Classes are blueprints for creating objects. They define the attributes (fields) and behaviors (methods) that objects of that class will have. Objects are instances of classes and can interact with each other by invoking methods and accessing attributes.

### Inheritance

Inheritance is a mechanism where a new class (subclass or derived class) can inherit attributes and behaviors from an existing class (superclass or base class). This promotes code reusability and allows creating specialized classes based on more general ones.

### Polymorphism

Polymorphism allows objects of different classes to be treated as objects of a common superclass. It enables methods to be invoked on objects without knowing their exact types. This is achieved through method overriding and interfaces.

### Encapsulation

Encapsulation is the practice of bundling data (attributes) and methods that operate on the data into a single unit, known as a class. Access to the internal details of a class is controlled, promoting data security and preventing unintended modifications.

### Abstraction

Abstraction involves representing complex real-world entities with simplified models in code. It hides unnecessary implementation details and focuses on essential features, making code more manageable and maintainable.

### Static 

In Java, the `static` keyword is used to define class-level members that are shared among all instances of a class, rather than being associated with a specific instance. These members are commonly referred to as "static members" and can include variables and methods. Here's a breakdown of how the `static` keyword works:

1. **Static Variables:** When a variable is declared as `static` within a class, it becomes a class variable, shared by all instances of that class. Modifications to a static variable by one instance will reflect in all other instances of the class. Static variables are initialized only once, at the start of the program, and they retain their values throughout the program's lifecycle.

2. **Static Methods:** A method declared as `static` belongs to the class rather than an instance of the class. These methods can be called using the class name, without creating an object of the class. Static methods are often used for utility functions that don't require access to instance-specific data.

3. **Static Blocks:** These are special blocks of code enclosed in `{}` and are executed only once when the class is loaded. They are used to initialize static variables or perform one-time setup tasks for the class.


## Getting Started

To explore the examples and concepts in this repository, follow these steps:

1. Clone this repository to your local machine.
2. Navigate to the specific concept's folder you're interested in.
3. Read the documentation and study the code examples provided.

## Examples

This repository provides practical examples for each key OOP concept discussed above. The examples are organized into folders corresponding to each concept. Each example includes a README file explaining the concept and how it's implemented in the code.

