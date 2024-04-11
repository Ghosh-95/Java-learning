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

    - Download [VS Codez🔗](https://code.visualstudio.com/)
    - Download [IntelliJIDEAz🔗](https://www.jetbrains.com/idea/?var=1)

2. You need to install a Java Development Kit (JDK) to run Java program in your machine. You can choose any JDK you can find on the internet. Here is one you might like:
    - [JDK by Oraclez🔗](https://www.oracle.com/in/java/technologies/downloads/)

## JVM
JVM (Java Virtual Machine) is an abstract machine. It is called virtual machine because it is not physically exist. It is a specification that provides a runtime environment to run and execute Java bytecode.

A JVM is:
- A specification where working of Java Virtual Machine is specified. But implementation provider is independent to choose the algorithm. Its implementation has been provided by Oracle and other companies.
- An implementation - Its implementation is known as JRE (Java Runtime Environment).
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

- Every line of code that runs in Java must be inside a `class`. In the example above, we named the class Main.
- A class should always be capitalized/PascalCase, such as Main, MyClass.
- 'public' keyword before any class name indicates that the class can be used in any other files.
- 'main' is a function/method which executes with the class and always executes. It is convention to keep a main function inside any class.
- 'void' means the function/method is not returning anything.
- 'String[]' represents an array data type. 'args' are the arguments that are passed to the main function while running the file:
  ```java
  class File{
    public static void main(String[] args) {
      System.out.println(args[0]);
    }
  }

  // terminal
  java File.java "Sushovan" "John Doe"

  // will give "Sushovan" as output
  ```

>Java is case-sensitive: "MyClass" and "myclass" has different meaning.

The name of the java file **must match the class name**, if you are using 'public' keyword before it. When saving the file, save it using the class name and add ".java" to the end of the filename. To run the example above on your computer, make sure that Java is properly installed. The output should be:
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
- You can just declare a variable and assign a value sometimes later. You can change the value of a particular variable.
    ```java
    int x, y;
    x = 10;
    y = 20;
    System.out.println(x + y); // 30

    // changing the value
    x = 80;
    y = 200;
    System.out.println(x + y); // 280
    ```
- You can make a variable final, so that the value of that variable cannot be changed (becomes constant).
    ```java
    final int pi = 3.14;
    final int g = 9.8;

    // changing these will throw an error
    pi = 4.2;
    g = 23;
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

## Strings
A String variable contains a collection of characters surrounded by double quotes:
```java
String name = "Sushovan Ghosh";
```
### String Length: 
The length of a string can be found by `length()` method.
```java
System.out.println("abcdefghijklmnopqrstuvwxyz".length()); // 26
```
### Changing Case:
There are to metods to change case of a string: `toUpperCase()` and `toLowerCase()`:
```java
System.out.println(name.toUpperCase()); // SUSHOVAN GHOSH
System.out.println(name.toLowerCase()); // sushovan ghosh
```
### Finding a character in a String:
To find a certain character in a string we need to use `indexOf()` method. It returns the index (the position) of the first occurrence of a specified text in a string (including whitespace).
```java
String learning = "I am learning Java";
System.out.println(learning.indexOf("am")); // 2
```
### Concatenation of Strings:
To concatenate two string we need to use either of "+" operator or `concat()` method. While using string "+" operator acts as a concatenation.

> Java uses the '+' operator for both addition and concatenation. Numbers are added, Strings are concatenated.

```java
String firstName = "Sushovan";
String lastName = "Ghosh";

System.out.println(firstName + " " + lastName);

// OR use concat method
System.out.println(firstName.concat(lastName));

int x = 5, y = 3;
System.out.println(x + y); // 8 (addition)

String a = "10", b = "20"
System.out.println(a + b); // 1020 (concatenation)
```
### Special Characters:

Sometiems we need to put quote inside a string. But Java will misunderstand those type of string and throws an error:
```java
String txt = "We are the so-called "Vikings" from the north.";
```
To avoid these type of error, we use **escape sequences.** In this case we can use `backslash escape character`. It turns the special characters into string character.
```java
String txt = "We are the so-called \"Vikings\" from the north.";
```
>Use `\'` for single quotes and `\\` for backward-slash(\\).

Other common escape sequences are:
- \n (New line)
- \b (Backspace)
- \t (Tab)
- \r (Return Carriage)
- \f (Form feed)

## Math

The Java Math class has many methods that allows you to perform mathematical operation on numbers.

> These methods always converts the passed number to double and return value likewise.

`Math.max(double x, double y)` : This method can be used to find the highest value of x and y.
```java
Math.max(5, 6); // 6
```

`Math.min(double x, double y)` : This method can be used to find the lowest value of x and y.
```java
Math.min(3, 6); // 3
```

`Math.abs(double x)` : This method returns the absolute (positive) value of x.
```java
Math.abs(-4.2); // 4.2
```
`Math.sqrt(double x)` Returns square root of x. `Math.cbrt(double x)` Returns cube root of x.
```java
int sqRoot = (int) Math.sqrt(9); // OR Math.round(Math.sqrt(9));

int cbRoot = (int) Math.cbrt(27);
```

`Math.random()`: Returns a random number from 0 (inclusive) to 1.0 (exclusive).
```java
int random = (int) Math.random();
```

Read more about Math [here 🔗](https://www.javatpoint.com/java-math)

## Boolean 

Java has a boolean data type, which can store true or false values.
```java
boolean isJavaFun = true;
boolean isMarried = false;

System.out.println(isJavaFun); // true
System.out.println(isMarried); // false
```
`Boolean Expression`: A boolean expression returns a boolean value, true or false. It is use for building logic. For example you can use a comparison operator, such as greater than (>) operator:
```java
int x = 10, y = 98;
System.out.println(y > x); // true
```

## Conditionals

You already know that Java supports the usual logical conditions from mathematics, for example >, >=, <, == etc.
- Use if to specify a block of code to be executed, if a specified condition is true.
- Use else to specify a block of code to be executed, if the same condition is false.
- Use else if to specify a new condition to test, if the first condition is false.

`if`: Use the if statement to specify a block of Java code to be executed if a condition is true.
```txt
if (condition) {
  // block of code to be executed if the condition is true
}
```
`if..else`: Use else statement to specify if the first condition is false.
```txt
if (condition) {
  // block of code to be executed if the condition is true
} else {
  // block of code to be executed if the condition is false
}
```
`if..else if..else`: Use else if statement to specify a new condition if the first condition is false. You can put many else..if to execute a code by certain conditions.
```txt
if (condition1) {
  // codes to be executed if condition1 is true
} else if (condition2) {
  // codes to be executed if the condition1 is false and condition2 is true
} else {
  // codes to be executed if the condition1 is false and condition2 is false
}
```

`Ternary Operator`: There is a shorthand operator for if..else statement called Ternary operator. 
```txt
variable = (condition) ? expressionIfTrue :  expressionIfFalse;
```
```java
int age = 21;

String result = (age >= 18) ? "Eligible to drive" ? "Not Eligible";

System.out.println(result); // Output: Eligible to drive

// You can use these directly in a print statement
System.out.println((age >= 18) ? "Eligible to drive" ? "Not Eligible");
```

`Switch Statement`: Instead of writing many if..else statements, you can use the switch statement.
```java
int day = 2;
switch(day) {
  case 1:
    System.out.println("Monday");
    break;
  case 2:
    System.out.println("Tuesday");
    break;
  default:
    System.out.println("Invalid input");
}
```

## Loops

### While loop
Checks for a condition and loops till that condition matches. you have to either increment or decrement to keep the loop in a ranged number of time. Unless it will loop until infinity.
```java
int i = 0;
while (i < 6) {
  System.out.println(i); 
  i++;
}
```
### Do While
Do while loop is an extended version of While loop. It performs something before checking any condition and runs atleast once.

```java
int i = 0;
do{
  System.out.println(i);
  i++;
}
while(i > 5);
```

### For loop
Checks for a condition and loops till that condition matches.
```java
for(int i = 0; i < 10; i++) {
  System.out.println(i);
}

// This code will print 0 to 9 in asscending order.
```
### For Each Loop
There is another loop which is exclusively used to loop through array elements.
```java
for(dataType variableName : arrayName) {
  // other code operation
}

String[] cars = {"Volvo", "Toyota", "Ford", "BMW"};

for(String i: cars) {
  System.out.println(i);
}
```

## Break and Continue

- `break`: This keyword can be used to break out of a loop.
  ```java
  for (int i = 0; i < 10; i++) {
    if (i == 4) {
      break;
    }
    System.out.println(i);
  }
  ```
- `continute`: Continue breaks **one** iteration (in the loop). It ignores a certain iteration and move forward to next loop.
  ```java
  for(int i = 0; i < 10; i++>) {
    if(i == 4) {
      continue;
    }

    System.out.println(i);
  }
  ```