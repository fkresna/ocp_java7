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

3. Look at the following code and shoose the right option for the word <access-modifier>:
//Shape.java
public class Shape {
	protected void display() {
		System.out.println("Display-base");
	}
}

//Circle.java
public class Circle extends Shape {
	<access-modifier> void display() {
		System.out.println("Display-derived")
	}
}

A. Only protected can be used.
B. Public and protected both can be used.
C. Public, protected and private can be used.
D. Only public can be used.

Answer B
You can provide only a less restrictive or same access modifier when overriding a method.

4. Consider this program to answer the following question:
class Shape {
	public Shape() {
		System.out.println("Shape constructor");
	}
	public class Color {
		public Color() {
			System.out.println("Color constructor");
		}
	}
}

class TestColor {
	public static void main(String[] args) {
		Shape.Color black = new Shape().Color();  //#1
	}
}
What will be the output of the program?
A. Compile error: the method Color() is undefined for the type Shape.
B. Compile error: invalid inner class.
C. Works fine: Shape constructor, Color constructor.
D. Works fine: Color constructor, Shape constructor.

Answer A
You need to create an instance of outer class Shape in order to create an inner class Instance.

5. If you replace the Color class instantiation statement (tagged as #1 inside a comment in the program given in the previous questions) with the following statement, what would be the output of the program?
Shape.Color black - new SHape().new Color()
A. Works fine and will print this putput:
		Shape constructor
		Color constructor
B. Worksfine and will print thisoutput:
 		Color constructor
 		Shape constructor
C. Compiler error: The method Color() is undefined for the type Shape.
D. Compile withour error but results in a runtime exception.

Answer A

6. What will be the output of the given program?
class Shape {
	private boolean isDisplayed;
	protected int canvas ID;
	public Shape() {
		isDisplayed = false;
		canvasID = 0;
	}
	public class Color {
		public void display() {
			System.out.println("isDisplayed: "+isDisplayed);
			System.out.println("canvasID: "+canvasID);
		}
	}
}

class TestColor {
	public static void main(String[] args) {
		Shape.Color black - new Shape().new Color();
		black.display();
	}
}
A. Compiler error: an inner class can only access public members of the outer class.
B. Compiler error: an inner class cannot access private members of the outer class.
C. Runs and prints this output:
		isDisplayed: false
		canvasID: 0
D. Compiles fine but crashes with a runtime exception.
Answer C
An inner class can access all members of an outer class, including the private members of the outer class.

7. Look at this program and predict the output:
8. 