Java :-
Java is a programming language and a platform. Java is a high level, robust, object-oriented and secure programming language. It is a General purpose programming language...Java Code can Run Everywhere on any system it follows WORA(Write once run everywhere).It Generates the byte code the compiled code where it is portable you can run on any system without recompiling the program..
java is both Compiled and Interpreted language..
------------------------------------------------------------------------------------------------
Java is not a Pure Object oriented programming language Why??

Pure Object Oriented Language or Complete Object Oriented Language are Fully Object Oriented Language which supports or have features which treats everything inside program as objects. It doesn’t support primitive datatype(like int, char, float, bool, etc.). There are seven qualities to be satisfied for a programming language to be pure Object Oriented. They are:

Encapsulation/Data Hiding
Inheritance
Polymorphism
Abstraction
All predefined types are objects
All user defined types are objects
All operations performed on objects must be only through methods exposed at the objects.
-------------------------------------------------------------------------------------------------
Platform:- Any hardware or software environment in which a program runs, is known as a platform. Since Java has a runtime environment (JRE) and API, it is called a platform.
----------------------------------------------------------------------
Simple.java -> Sample example of Java Code 

class Simple{  
    public static void main(String args[]){  
     System.out.println("Hello Java");  
    }  
}  
Class name and file name should be same in java...It is Mandatory to same name
-----------------------------------------------------------------
Another Method to write the java code :-

public class Code1{
    public static void main(String...args) { // here you can also put three dots in place of square brackets..
        System.out.println("Hey Jarvis!");
        System.out.print("Hello Sir How Are You!");

    
    }
}
-----------------------------------------------------------------------
Four types of applications we can create with java language :-

1) Standalone Application:-

Standalone applications are also known as desktop applications or window-based applications. These are traditional software that we need to install on every machine. Examples of standalone application are Media player, antivirus, etc. AWT and Swing are used in Java for creating standalone applications.

2) Web Application:-

An application that runs on the server side and creates a dynamic page is called a web application. Currently, Servlet, JSP, Struts, Spring, Hibernate, JSF, etc. technologies are used for creating web applications in Java.

3) Enterprise Application:-

An application that is distributed in nature, such as banking applications, etc. is called an enterprise application. It has advantages like high-level security, load balancing, and clustering. In Java, EJB is used for creating enterprise applications.

4) Mobile Application:-

An application which is created for mobile devices is called a mobile application. Currently, Android and Java ME are used for creating mobile applications.
--------------------------------------------------------------------------

Features of java :-

Simple
object oriented
Portable
Robust 
Multithreaded
Secured 
Platform Independent
Dynamic
--------------------------------------------------------------------------------------------
java is Secured Why??

Java is best known for its security. With Java, we can develop virus-free systems. Java is secured because:

1) No explicit pointer
2) Java Programs run inside a virtual machine sandbox
3) Classloader: Classloader in Java is a part of the Java Runtime Environment (JRE) which is used to load Java classes into the Java Virtual Machine dynamically.
4) Bytecode Verifier: It checks the code fragments for illegal code that can violate access rights to objects.
5) Security Manager: It determines what resources a class can access such as reading and writing to the local disk.
------------------------------------------------------------------------------------------------------
What is JDK and JRE?
JDK:- Java Development Kit is a Collection of tools used for developing and running java programs..
JRE:- Java Runtime Environment helps in executing the program which is developed in java...
---------------------------------------------------------------------------------------------------------------
Why Java is robust?

The English mining of Robust is strong. Java is robust because:

1)It uses strong memory management.
2)There is a lack of pointers that avoids security problems.
3)Java provides automatic garbage collection which runs on the Java Virtual Machine to get rid of objects which are not being used by a Java application anymore.

More About Java :-
Java doesn't Support Operator Overloading but C++ Does...
1) Java uses both compiler and interpreter. Java source code is converted into bytecode at compilation time.The interpreter executes this bytecode at runtime and produces output.
2) Java supports call by value only. There is no call by reference in java.
3) Java doesn't support structures and unions.
4) Java has built-in thread support.
5) Java does not support header files like C++. Java uses the import keyword to include different classes and methods.

Source code Information:-
1) class keyword is used to declare a class in Java.

2) public keyword is an access modifier that represents visibility. It means it is visible to all.

) static is a keyword. If we declare any method as static, it is known as the static method. The core advantage of the static method is that there is no need to create an object to invoke the static method. The main() method is executed by the JVM, so it doesn't require creating an object to invoke the main() method. So, it saves memory.

4) void is the return type of the method. It means it doesn't return any value.

5) main represents the starting point of the program.

6) String[] args or String args[] is used for command line argument. We will discuss it in coming section.

7) System.out.println() is used to print statement. Here, System is a class, out is an object of the PrintStream class, println() is a method of the PrintStream class. We will discuss the internal working of System.out.println() statement in the coming section.
-----------------------------------------------------------------------------------------------------------------------
What happens at runtime in java?
Following steps are performed :-
Source code Converted it into a class file by the compilation process and the steps shown below-
1) Class File
2) ClassLoader
3) Bytecode Verified
4) Interpreter
5) Runtime
6) Hardware

Classloader: It is the subsystem of JVM that is used to load class files.

Bytecode Verifier: Checks the code fragments for illegal code that can violate access rights to objects.

Interpreter: Read bytecode stream then execute the instructions.

Which of the following operations JVM perform?

The JVM performs following operations:-->

1) Loads code
2) Verifies code
3) Executes code 
4) Provides runtime environment

Java Variables:-

A variable is a container which holds some value while the Java program is executed. A variable is assigned with a data type.

Variable is a name of memory location. There are three types of variables in java:- local, instance and static.

There are two types of data types in Java: primitive and non-primitive.

What is Type Casting?

In Java, type casting is a method or process that converts a data type into another data type in both ways manually and automatically.

Java is a Object Oriented Language Because Everything in java is an object like example we (System.out.println) So , If we write an object we need class.  
----------------------------------------------------
For Data Types :- Data types specifies the differernt sizes and What type of values that can be stored in our in the variable..
example- Int , float, char, short ,long, boolean etc.
------------------
There are two types of data types in Java:-

Primitive data types: The primitive data types include boolean, char, byte, short, int, long, float and double.

Non-primitive data types: The non-primitive data types include Classes, Interfaces, and Arrays.
---------------------------------------------------
Operators in Java:--
Operator in Java is a symbol that is used to perform operations. For example: +, -, *, / etc.

There are many types of operators in Java which are given below:

Unary Operator,
Arithmetic Operator,
Shift Operator,
Relational Operator,
Bitwise Operator,
Logical Operator,
Ternary Operator and
Assignment Operator.
----------------------------------------------------
Java Operator Precedence:-

Operator Type	Category	Precedence
Unary	postfix	expr++ expr--
prefix	++expr --expr +expr -expr ~ !
Arithmetic	multiplicative	* / %
additive	+ -
Shift	shift	<< >> >>>
Relational	comparison	< > <= >= instanceof
equality	== !=
Bitwise	bitwise AND	&
bitwise exclusive OR	^
bitwise inclusive OR	|
Logical	logical AND	&&
logical OR	||
Ternary	ternary	? :
Assignment	assignment	= += -= *= /= %= &= ^= |= <<= >>= >>>=
-----------------------------------------------
We cannot convert float to int. We can only Convert int to float 
---------------------------------------
double num = 5.6;
float num =5.6f; // here f shows that it is a float type value. If you are not using f then java will automatically set this value to double. Java already set on to the double not float ...
----------------------------------------------
Java follows UNICODE System In which it supports all world languages.. In java Char has 2 Bytes because of UNICODE system..But in C char has only 1 Byte..
-------------------------------------------------
Java Keywords:-
Keywords are the reserved words they are predefined words by java so they cannot be used as a variable or object name or class name..
for Example :-
Abstract
boolean
break
case
byte
catch
class 
continue
default
final 
else
int
float 
these all are reserved words we cannot use it as a variable..
----------------------------------------------
Taking User input:-
First you need to import java after that you can use scanner class.... 

Sample Code for taking Input from the User--
import java.util.*;
public class Code1{
    public static void main(String...args){
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        System.out.println(a);
    }
} 
--------------------------------------------------------------------------
When we use Suppose for example :-
 String name= sc.next();
 
 //Here next() can only accepts one token at a time so if you want to print your full name then you need to Write the Statememt :-

String name =sc.nextLine(); 

// here It takes the whole line and print your full name..
----------------------------------------------------------------------------------
Operator Priority:-
Java Not follows the BODMASS Rule It follows Operator Priority:-
 *,/,%,+,-
 These are the sequence wise priority for Solving some Arithematic operations...
 ===================================================================================================
 When you can Convert the Integer value to the Byte value through typecasting:-
 int x=15;
 byte b =(byte)x; // here Integer value Convert it into the byte value..
 
Another Example:-
int x=257;
byte c=(byte)x; // here the result is 1 Because it performs Modulo Operator and gives 1 as a remainder 
=======================================================================================================
Type Promotions:-
byte a = 10;
byte b = 30;
int result= a*b; // but here the result will go outer the range of the byte so java will promote the value to the integer and it will print 300 in the result...
System.out.println(result);
=============================================================================================
Conditional Statements:--
if (Condition)
Statement;
========================================================================
if(Condition)
statement;
else
statement;
========================================================================================
if(Condition)
statement;
else if(Conditions) //It is used for multiple Conditions 
statement;
========================================================================================================
Switch Case:-
Syntax:-
switch(Variable){ //Variable should be integer or Character 
case 1:
statement;  // Printing the value
break;
case 2:
statement;
break;     //Break is used for get out of the button or End of the Statement or termination..
case 3:
statement;
break;
default:
statement;
}
================================================================================================================
Loops :- loops are used to repeat or iterate the given task....
Types of loops and their Syntax:-
1) for loop -
Syntax:-
for(i=1;i<=n;i++){

}
2) while loop -
Syntax:-
while(i<2){
    Sout;
    i++/i--;
}
3) do while loop -
Syntax:-
do{
    Sout;
    i++/i--;
}
while(i<2);
===============================================================================================================
Patterns:-
********
********
********
********

this is the pattern we use any loop for printing the star pattern or any other kind of pattern.


