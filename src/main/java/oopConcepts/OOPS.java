package oopConcepts;

public class OOPS {
	
	
	//1.Class ==> Class is a blueprint or a template that is going to help us store variables, methods, and objects together at one place. It's a non-primitive data type.
	
	//2.Object ==> Object is an instance of the class. (new copy of the class)
	
	//3.Constructor ==> The constructor is a special method created by Java every time you're going to create a new class. The name of the constructor will be the same as your class name, without any return type.
	//Default Constructor ==> A constructor that is created by Java itself if you don't create any constructor in your class.
	//Parameterized Constructor ==> A constructor that is created by the user with some parameters.
	
	//4.Method ==> A method is a block of code or collection of statements written together to complete a specific task.
	
	//5.Inheritance ==> Extending parent class properties into child class without creating object is called as inheritance. (extends)
	//Types of Inheritance:
		//1.Single Inheritance ==> When a child class inherits the properties of a single parent class.
		//2.Multilevel Inheritance ==> When a child class inherits the properties of a parent class, and that parent class is also a child class to another parent class.
		//3.Hierarchical Inheritance ==> When multiple child classes inherit the properties of a single parent class.
	//Note: Java does not support Multiple Inheritance (When a child class inherits the properties of multiple parent classes) to avoid ambiguity.

	//6. Encapsulation ==> Encapsulation is a concept of hiding the information.
	//How to achieve Encapsulation in Java?
		//1.Declare the variables of a class as private.
		//2.Provide public setter (modify private info using public method) and getter (get private info using public method) methods to modify and view the variables values.
	//7. Abstraction ==> Abstraction is a concept of hiding the implementation details and showing only functionality to the user. (abstract keyword)
	
	//8. Interface ==> An interface is a special abstract class that contains only abstract methods (methods without body) (implements keyword)
	//after Java 8, interfaces can also have default and static methods with a body. (implements keyword)
	//after Java 9, interfaces can also have private methods with a body.
	
	//9. Polymorphism ==> Multiple methods implemented with the same name but different functionality. That is called as polymorphism.
	
	//Types of Polymorphism:
		//1. Compile-time Polymorphism (Method Overloading) ==> Multiple methods with the same name but different parameters within the same class. 
		//2. Run-time Polymorphism (Method Overriding) ==> When a method is overridden in the child class that is already present in the parent class, it is called method overriding.
}