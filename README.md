# Basics of Java

Java is a class-based, secured, object-oriented and general-purpose programming language. It is widely used to build robust software application. Some of them are:

- Desktop Applications such as acrobat reader, media player, antivirus, etc.
- Web Applications such as irctc.co.in, javatpoint.com, etc.
- Enterprise Applications such as banking applications.
- Mobile
- Robotics
- Games, etc

## Example
```java
public class FirstClass {
    public static void main(String[] args) {
        System.out.pringln("Hello World!!");
    }
}
```
## Get Started with Java

1. You need a IDE (Intregated Development Environment) to write and edit Java Programs. There are many IDEs like VS Code, IntelliJ IDEA etc. that you can choose.

    - Download [VS Code](https://code.visualstudio.com/)
    - Download [IntelliJIDEA](https://www.jetbrains.com/idea/?var=1)

2. You need to install a Java Development Kit (JDK) to run Java program in your machine. You can choose any JDK you can find on the internet. Here is one you might like:
    - [JDK by Oracle](https://www.oracle.com/in/java/technologies/downloads/)

## JVM
JVM (Java Virtual Machine) is an abstract machine. It is called virtual machine because it is not physically exist. It is a specification that provides a runtime environment to run Java bytecode can be executed.

A JVM is:
- A specification where working of Java Virtual Machine is specified. But implementation provider is independent to choose the algorithm. Its implementation has been provided by Oracle and other companies.
- An implementation Its implementation is known as JRE (Java Runtime Environment).
- Runtime Instance Whenever you write java command on the command prompt to run the java class, an instance of JVM is created.

JVM can performs following main tasks:
- Loads code
- Verifies Code
- Executes Code
- Provides runtime environment

## JRE 

JRE stands for Java Runtime Environment, also writeen as Java RTE, is a set of software tools to develop Java Application. It is used to provide runtime environment. It is physical implementatioin of JVM and it physically exists. It contains a lot of libraries and other files that JVM uses at runtime.

## JDK

JDK or Java Development Kit is a software development environment which is used to develop Java application. It physically exists and it contains JRE and all the necessarry development tools.

The JDK contains a private Java Virtual Machine (JVM) and a few other resources such as an interpreter/loader (java), a compiler (javac), an archiver (jar), a documentation generator (Javadoc), etc. to complete the development of a Java Application.

## First Class

```java
public class Main{
    public static void main(String[] args) {
        System.out.println("Hello World!!");
    }
}
```

Every line of code that runs in Java must be inside a `class`. In our example, we named the class Main. A class should always start with an uppercase first letter.

>Java is case-sensitive: "MyClass" and "myclass" has different meaning.

The name of the java file `must match the class name`. When saving the file, save it using the class name and add ".java" to the end of the filename. To run the example above on your computer, make sure that Java is properly installed. The output should be:
```
Hello World!!
```

## Variables

To declare a variable: 
> data-type variable-name = value;
```java
int x = 5;
int y = 7;
int z = 37;

// OR
int x = 5, y = 7, z = 37;
```

There are three type of variables in Java: local variable, instance variable, static variable

1. Local Variable: A variable declared inside the body of method is called local variable. A local variable is only valid within the method, it is unavailable to other methods.
    >It cannot be defined with static keyword.

2. Instance Variable: A varialbe delcared inside the class but outside the body of the method, is called instance variable. It is not declared as static. It is a instance-specific variable and it is not shared among instances.

3. Static Variable: A variable that is declared as static is called static variable. It is not local, you can create a single copy of the static variable and share it among all the instances of the class. Memory allocation is happened only once when the class is loaded in the memory.

The general rules for naming variables are:

- Names can contain letters, digits, underscores, and dollar signs.
- Names must begin with a letter.
- Names should start with a lowercase letter, and cannot contain  whitespace.
- Names can also begin with $ and _ (but we will not use it in this tutorial).
- Names are case-sensitive ("myVar" and "myvar" are different variables).
- Reserved words (like Java keywords, such as int or boolean) cannot be used as names.

## Data Types

1. `Primitive Data Types`: There are 8 primitive data types in Java
    - `byte` (1 byte) : Stores whole number fron -128 to 127.
    - `short` (2 bytes) : Stores whole number fron -32,768 to 32,767.
    - `int` (4 bytes) : Stores whole number fron -214,74,83,648 to 214,74,83,647.
    - `long` (8 bytes) : Stores whole number fron -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807.
    - `float` (4 bytes) : Stores fractional numbers, can store upto 7 decimal digits.
    - `double` (8 bytes) : Stores fractional numbers, can store upto 15 decimal digits.
    - `double` (2 bytes) : Stores true or false values.
    - `char` (1 bytes) : Stores a single character/letter or ASCII values

    ```java
    public class Primitive {

        public static void main(String[] args) {

            byte x = 127;
            short a = 32767;
            int b = 2147483647;
            long c = 9223372036854775807L; // ends with L

            float d = 9.8f; // ends with f
            double pi = 3.14159265359d; // ends with d

            char myInitial = 'S'; // within single quote
            char myValue = 86; // V (ASCII value)

            boolean isEligible = true;

            System.out.println(x + "\n" + a + "\n" + b + "\n" + c + "\n" + d + "\n" + pi + "\n" + myInitial);

    
        }
    }
    ```
    > Generally, 'double' is used for its capacity of storing more (15) decimal digits instead of 'float'. For whole numbers 'int' is usefull.

2. `Non-Primitive Data Types`: These are called refrence types because they refer to objects. Examples of non-primitive types are Strings, Arrays, Classes, Interface, etc.

### The main difference between primitive and non-primitive data types are:

 - Primitive types are predefined (already defined) in Java. Non-primitive types are created by the programmer and is not defined by Java (except for String).
 - Non-primitive types can be used to call methods to perform certain operations, while primitive types cannot.
 - A primitive type has always a value, while non-primitive types can be null.
 - A primitive type starts with a lowercase letter, while non-primitive types starts with an uppercase letter.

 ## Taking input in Java

 You need to import `Scanner` class which is a inbuilt utility class in Java. Then define a scanner variable inside the function with `new Scanner()` keyword and pass `System.in` inside it:
 ```java
 import java.util.Scanner;
 // OR import java.util.*

 public class Input {
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        String greetings = sc.next();

        System.out.println(greetings);
    }
}
 ```

 - You can take input of any data type. For integer you can use `sc.nextInt()` and `sc.nextFloat` for float.
 - In the above code, sc.next() will only take one token - one word - and doesn't print more than one word. To avoid this we can use `sc.nextLine()` to print strings.

 ## Java Type Casting

 Java type casting is when you assign a value of a primitive data type to another type. There are two types of casting in Java:
 - Widening Casting: Casting happens from smaller type to larger data types and it happens automatically.
    > byte --> short --> char --> int --> long --> float --> double
 - Narrowing Casting: Converting a larger data type to smaller types. It needs to be done manually by placing the type in parenthesis in front of the value that to be casted.
    > double --> float --> long --> int --> char --> short --> byte
    ```java
    public class TypeCasting {
        public static void main(String[] args) {

            int myAge = 24;
            double floatAge = myAge; // Widening casting

            System.out.println(floatAge);

            double gravity = 9.8d;
            int intGravity = (int) gravity; // Narrowing casting

            System.out.println(intGravity);
        }
    }
    ```
## Java Operators

Operators are used to do operatioins on variables and values. Like, with substraction operator one can substract a value from another:
```java
int x = 5, y = 10;
int a = y - x;
```

Java divides the operators into the following groups:
- Arithmetic operators (+, -, /, %, *, ++, --)
- Assignment operators (=, +=, -=, /=, *=, %=)
- Comparison operators (==, !=, >, >=, <, <=)
- Logical operators (&&, ||, !)
- Bitwise operators

```java
int x = 29, y = 32;

// Arithmatic Operators
int sum = 5 + 7;
int substraction = 10 - 5;
int multiply = x * y;
int divide = 10 / 5;
++x;
--y;

// Assignment Operators
int a = 25;
int sum1 += 25;
int sub1 -= 10;

```