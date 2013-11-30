Coding Interview Questions and Answers Part 1
========================

This programming interview questions can be found in HackerMeter interview preparation website and popular interview preparation book Crackcing the Coding Interview.

Part 1 includes Java Basics and Part 2 includes Data Structure and Algorithm relatead Questions. You will find the questions before every implementation. 

Interview Phone Screen
========================

These websites helped me a lot: 
1. http://www.codinghorror.com/blog/2008/01/getting-the-interview-phone-screen-right.html
2. https://sites.google.com/site/steveyegge2/five-essential-phone-screen-questions

Also here is most common Questions and Answers about Java Basics:
1. What are 4 pillars of object oreinted programming?

1. Abstraction – It means hiding the details and only exposing the essentioal parts
2. Polymorphism – Polymorphism means having many forms. In java you can see polymorphism when you have multiple methods with the same name
3. Inheritance – Inheritance means the child class inherits the non private properties of the parent class
4. Encapsulation – It means data hiding. In java with encapsulate the data by making it private and even we want some other class to work on that data then the setter and getter methods are provided

2. How are Java source code files named?

A Java source code file takes the name of a public class or interface that is defined within the file. A sourcecode file may contain at most one public class or interface. If a public class or interface is defined within a source code file, then the source code file must take the name of the public class or interface. If no public class or interface is defined within a source code file, then the file must take on a name that is different than its classes and interfaces. Source code files use the .java extension.

3. What do you mean by platform independence?

Platform independence means that we can write and compile the java code in one platform (eg Windows) and can execute the class in any other supported platform eg (Linux,Solaris,etc).

4. What is difference between Path and Classpath?

Path and Classpath are operating system level environment variales. Path is used define where the system can find the executables(.exe) files and classpath is used to specify the location .class files.

5. What is Encapsulation?

It is the technique of making the fields in a class private and providing access to the fields via public methods. If a field is declared private, it cannot be accessed by anyone outside the class, thereby hiding the fields within the class. Therefore encapsulation is also referred to as data hiding.

6. What is JVM (Java Virtual Machine)?

JVM stands for Java Virtual Machine. It’s an abstract computer or virtual computer which runs the compiled java programs. Actually JVM is a software implementation which stands on the top of the real hardware platform and operating system. It provides abstraction between the compiled java program and the hardware and operating system. So the compiled program does not have to worry about what hardware and operating system he has to run in, it’s all handled by the JVM and thus attaining portability. All Java programs are compiled in to bytecodes. JVM can only understand and execute Java bytecodes. we can visualize Java bytecodes as machine language for JVM. Java compiler takes the .java files and compiles it to a “bytecode” file with .class file extension. Compiler generates one class file for one source file.

7. What is the difference between constructors and other regular methods?

Constructors must have the same name as the class name and cannot return a value. The constructors are called only once per creation of an object while regular methods can be called many times.

8. What is an abstract class?

Abstract class must be extended/subclassed (to be useful). It serves as a template. A class that is abstract may not be instantiated (ie. you may not call its constructor), abstract class may contain static data.

Any class with an abstract method is automatically abstract itself, and must be declared as such. A class may be declared abstract even if it has no abstract methods. This prevents it from being instantiated.

9. What is the difference between the Boolean & operator and the && operator?

If an expression involving the Boolean & operator is evaluated, both operands are evaluated. Then the & operator is applied to the operand. When an expression involving the && operator is evaluated, the first operand is evaluated. If the first operand returns a value of true then the second operand is evaluated. The && operator is then applied to the first and second operands. If the first operand evaluates to false, the evaluation of the second operand is skipped.

 

10. In Java, what is the use of garbage collector?

Garbage collection is used to spot and remove objects that are not used by the program from long time and the allocate resources for that object is reclaimed and reused. The memory allocated by the Java object is deleted if it is unreachable within the same program.

11. Explain the usage of Java packages.

This is a way to organize files when a project consists of multiple modules. It also helps resolve naming conflicts when different packages have classes with the same names. Packages access level also allows you to protect data from being used by the non-authorized classes.

12. What is Synchronization in Java?

Synchronization is a process of controlling the access of shared resources by the multiple threads in such a manner that only one thread can access one resource at a time.

In non synchronized multithreaded application, it is possible for one thread to modify a shared object while another thread is in the process of using or updating the object’s value.

13. Difference between throw and throws?

It includes:

Throw is used to trigger an exception where as throws is used in declaration of exception.
Without throws, Checked exception cannot be handled where as checked exception can be propagated with throws.
14. What is JAR file?

JAR files is Java Archive fles and it aggregates many files into one. It holds Java classes in a library. JAR files are built on ZIP file format and have .jar file extension.

15. What are applets ?

Applets are small applications that are accessed from web server automatically installed, and run from the browser. Once an applet arrives on the client it has limited access to resources thus ensuring security for the end user. An applet is controlled by the software that runs it. Usually, the underlying software is a browser, but it can also be applet viewer. If you run the applet source code from eclipse it runs inside an applet viewer. All applets should inherit from applet class.

Below are sequences of events which occur in applet:-
The init Method: The init method is called when the applet is first loaded. Init method can be used to initialize color, fonts or any type of one type operation needed for the applet.
The start Method: The start method is called when user visits a browser with an applet on it. In start method applet spawns a thread in which it runs the paint method.
paint() is called every time when applet has to re-display everything.

16. What is the Locale class? 

This class is used in conjunction with DateFormat and NumberFormat to format dates, numbers and currency for specific locales. With the help of the Locale class you’ll be able to convert a date like “10/10/2005” to “Segunda-feira, 10 de Outubro de 2005” in no time. If you want to manipulate dates without producing formatted output, you can use the Locale class directly with the Calendar class

17. What are the rules for overriding 

The rules for Overriding are:

Private method can be overridden by private, protected or public methods
Friendly method can be overridden by protected or public methods
Protected method can be overridden by protected or public methods
Public method can be overridden by public method

18. What are the Final fields & Final Methods ? 

Fields and methods can also be declared final. A final method cannot be overridden in a subclass. A final field is like a constant: once it has been given a value, it cannot be assigned again.

19. What is the difference between an Abstract class and Interface in Java ? or can you explain when you use Abstract classes ? 

Abstract classes let you define some behavior while forcing your subclasses to provide the rest. These abstract classes will provide the basic funcationality of your application, child class which inherit this class will provide the funtionality of the abstract methods in abstract class.

Whereas, An Interface can only declare constants and instance methods, but cannot implement any default behavior.

If you want your class to extend some other class but at the same time re-use some features outlined in a parent class/interface – Interfaces are your only option because Java does not allow multiple inheritance and once you extend an abstract class, you cannot extend any other class. But, if you implement an interface, you are free to extend any other concrete class as per your wish.

Also, Interfaces are slow as it requires extra indirection to find corresponding method in the actual class. Abstract classes are fast.

20. What are different types of inner classes ? 

Inner classes nest within other classes. A normal class is a direct member of a package. Inner classes are of four types

1. Static member classes
2. Member classes
3. Local classes
4. Anonymous classes

21. Define checked and unchecked exceptions?

According to checked exception is an exception of a subclass other than subclasses and class Runtime Exception. The method which is used to throw IOException is read () of java.io.FileInputStream is an example of checked exception. In general, unchecked exceptions are RuntimeExceptions and its subclasses. Class error and its subclasses are the unchecked exceptions. The client programmers are not forced to declare in throws class or to catch the exception by the compiler with unchecked exception. Client programmer is not aware that the exception can be thrown. String’s charAt () method throws StringIndexOutOfBoundsException is an example. At the compile time, these checked exceptions are caught. Often, errors cannot be caught.

22. What is multi-threading in Java?

Multi-threading in Java is a technique that enables multitasking in a single process at the same time. When you do this, you are open to multitasking at the same time. For instance, when using Microsoft Excel you perform many task concurrently, that is, typing, spell checking and printing. Therefore, in this way you can use many programs at a time.

23.What’s the difference between the methods sleep() and wait()?

The code sleep(1000); puts thread aside for exactly one second. The code wait(1000), causes a wait of up to one second. A thread could stop waiting earlier if it receives the notify() or notifyAll() call. The method wait() is defined in the class Object and the method sleep() is defined in the class Thread.

24. What is the finalize method do?

Before the invalid objects get garbage collected, the JVM give the user a chance to clean up some resources before it got garbage collected.

25. What is the purpose of Void class?

The Void class is an uninstantiable placeholder class to hold a reference to the Class object representing the primitive Java type void.



Read more: http://www.bukkas.com/soft-skills/interview-tips/java-interview-questions.html#ixzz2mAJmtQm0
