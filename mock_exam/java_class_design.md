# Java Class Design
## Ganesh & Sharma
1. Which of the following statements is true?
A. You cannot extend a concrete class and declare that derived class abstract
B. You cannot extend an abstract class from another abstract class.
C. An abstract class must declare at least one abstract method in it.
D. You can create an instance of a concrete subclass of an abstract class but cannot create instance of an abstract class itself.

Answer: D 

2. Choose the best answer based on the following class definition:

public abstract final class Shape {}

A. Compiler error: aclass must not be empty.
B. Compiler error: illegal combination of modifiers abstract and final.
C. Compoler error: an abstract must declare at least one abstract method.
D. No compiler error: this class deifinition is fine and will compile successfully.

Answer B
You cannot declare an abstract class final since an abstract class must be extended. Class can be empty in Java including abstract classes. An abstract class can declare zero or more abstract methods.