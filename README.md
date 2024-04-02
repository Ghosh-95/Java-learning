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