package techclub.lesson_eight;

/* Introduction to Classes and Object-Oriented Programming */
public class MyClass {
	// Java programs are run through OBJECTS interacting with each other. All of the variables we have been creating - ints, Strings,
	// arrays, and so on - are actually representations of objects (citation: Java Language Specification section 4.3.1,
	// https://docs.oracle.com/javase/specs/jls/se8/html/jls-4.html#jls-4.3.1).
	
	// A Java object is comparable to a real-life object because both have STATE and BEHAVIOUR (citation: The Java Tutorials - What
	// is an Object?, https://docs.oracle.com/javase/tutorial/java/concepts/object.html). Consider a car. A car can have many states.
	// For example, its gasoline levels are continually decreasing until you fill up its tank. Its value continually depreciates - a
	// used car is less valuable than a new car. Its engine and tires wear out over time. Such is the constantly-changing
	// state of a car. As for a car's behaviour, it can move, brake, honk, etc. A car can also have its engine replaced,
	// have its tank filled up with gas, and have repairs done on its tires - this also falls under a car's behaviour. In Java,
	// a car object has state and behaviour just like a real car. All objects have state and behaviour.
	
	// We will now momentarily digress to discuss what pointers and references are, and how they relate to objects.
	
	// Variables are formally called POINTERS, or REFERENCES, because they point to, or reference, an object in the Java Virtual 
	// Machine (JVM). Java is called an OBJECT-ORIENTED PROGRAMMING LANGUAGE because practically all code you write in Java 
	// either creates or manipulates objects.
	
	// The relationship between an object and its reference can be explained with an analogy. A large, spherical green fruit is an object 
	// in real life. We REFER to it as a watermelon. Here, watermelon is the REFERENCE to the actual object, which is a large, 
	// spherical green fruit. We can point to the object, but we cannot point to the reference (words are intangible in real life,
	// and we cannot point to an actual word).
	
	// myString is a reference to the real String object in the JVM.
	String myString = "Test string";
	
	// We can use the reference to invoke methods on the object.
	String mySubstring = myString.substring(5, 11);
	
	// We can also change the object that the reference points to through reassignment.
	// e.g. myString = "Different string";
	
	
	// Most objects have ATTRIBUTES and METHODS defined by their CLASS. Recall that every variable has a DATATYPE. The datatype of
	// most variables is associated with a class of the same name - the only exceptions being the 8 primitive data types (int, float, 
	// char, boolean, etc.). We have been using Strings and some of the methods associated with them - these methods are defined
	// in the String class that comes with the Java API (Application Programmer Interface).
	
	// By the way, the 8 primitive data types are not objects (citation: The Java Tutorials - Primitive Data Types,
	// https://docs.oracle.com/javase/tutorial/java/nutsandbolts/datatypes.html). They do not have defined behaviour.
	
	// In this lesson, you will learn to write a class called Automobile. CLASSES are used to create objects, which, again, are the 
	// backbone of all Java programs. They define an object's state and behaviour in the form of ATTRIBUTES and METHODS. Please go  
	// through the Automobile class now (Automobile.java).
	
	public static void main(String[] args) {
		// You create an object using the "new" keyword and the constructor. Notice that the datatype is Automobile - the same
		// name as the class.
		Automobile usedCar = new Automobile(4, 3000, 1600, 50, 70);
		
		// We can invoke INSTANCE METHODS on the Automobile object using our reference.
		// Instance method = non-static method.
		usedCar.drive(50);
		usedCar.drive(500);
		usedCar.drive(100);	// cannot drive now
		usedCar.fillUpGas();
		
		// Let's also invoke the static method. Note the difference in syntax. We do not need to use an object reference
		// because the BEHAVIOUR of the brake() method does not depend on an actual Automobile object. This point is
		// important: static methods do NOT behave differently depending on the object.
		Automobile.brake();
	}
	
	
	/* PRACTICE:
	 * 
	 * Object-oriented programming and classes are hard to understand at first (and designing practice problems on these concepts 
	 * are challenging as well), so these are just comprehension questions to check your understanding.
	 * 
	 * 1. When designing classes, when should you write static methods, and when should you write instance methods?
	 * 
	 * 2. Fill in the blank: an object's state is defined by its _____________.
	 * 
	 * 3. What is the difference between a reference/pointer and an object?
	 * 
	 * 4. Is a boolean an object? Why or why not?
	 * 
	 * 5. List two purposes of classes.
	 * 
	 * 6. Fill in the blank: a variable's data type and class have the same _________, except if the data type is one of 
	 *    the eight primitive data types.
	 * 
	 * 7. What does a constructor do? What is the syntax for calling a constructor?
	 * 
	 * 8. Fill in the blank: methods define an object's _____________.
	 */
}
