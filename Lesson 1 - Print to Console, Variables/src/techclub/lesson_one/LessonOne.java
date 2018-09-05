package techclub.lesson_one;

/* Lesson 1: Printing to console, variables, arithmetic operators, primitive data types, initialization */
public class LessonOne {
	public static void main(String[] args) {
		/* Printing to console/terminal */
		System.out.println("Hello tech club!");
		
		/* Try printing various messages - will numbers work? What if I print nothing? */
		System.out.println("3");
		System.out.println("");
		System.out.println("hfjlha2w37ipry awieu@&*(RT&@*(F Sfh kejw");
		

		/*===================================================
		 * VARIABLES - used to store INFORMATION
		 * 
		 * Format: <DataType> <variableName> = <expression>;
		 * Equals sign is called the ASSIGNMENT OPERATOR
		 * 
		 * Variable names are written in "camel case"
		 *===================================================
		 */
		
		int myNumber = 5;
		System.out.println(myNumber);	// prints 5
		
		int aBiggerNumber = 7;
		System.out.println(aBiggerNumber);	// prints 7
		System.out.println(myNumber + aBiggerNumber);	// prints 12
		
		
		// You can put complex expressions on the right side of the equals sign. The expressions are first EVALUATED to a value,
		// then the value is assigned to the variable.
		
		int increasedNumber = myNumber * 3;
		System.out.println(increasedNumber);	// prints 15
		
		// You can reassign a variable's value. You do NOT need to re-declare its data type when you do this. Only declare the
		// data type when you create the variable for the first time.
		aBiggerNumber = 100;
		System.out.println(aBiggerNumber);	// prints 100
		
		
		/* ARITHMETIC OPERATORS */
		// + is the addition operator
		// - is the subtraction operator
		// * is the multiplication operator
		// / is the division operator
		// % is the REMAINDER operator and gives the remainder when one number is divided by another number
		
		/* Examples of remainder operator */
		int remainder = 7 % 3;
		System.out.println(remainder);	// prints 1, because 7 divided by 3 equals 2 remainder 1.
		
		int remainderTwo = 56 % 10;
		System.out.println(remainderTwo);	// before running the code, what do you think remainderTwo is equal to?
		
		
		/*========================================================
		 * THE 8 PRIMITIVE DATA TYPES:
		 * byte, short, int, long, float, double, char, boolean
		 *========================================================
		 */
		
		byte eightBits = 1; 		 // max value 2^7 - 1
		short twoBytes = -4; 		 // max value 2^15 - 1
		int fourBytes = 10; 		 // max value 2^31 - 1
		long eightBytes = 23943829L; // max value 2^63 - 1
		float singlePrecision = 3.14f;
		double doublePrecision = 2.71828d;
		char character = 'a';
		boolean trueOrFalse = false;
		
		
		/* What is INITIALIZATION? */
		// Definition: When you declare a variable and assign it a value, you are "initializing" it.
		
		// Complex expressions can be used to initialize variables. The computer evaluates (simplifies) the expression and assigns its
		// value to the variable.
		boolean twoIsLargerThanOne = 2 > 1;	// what is the value of this boolean?
		
		// Note: You do NOT need to initialize a variable at the same time that you declare it.
		// The following is valid code:
		int uninitializedInt;
		boolean uninitializedBoolean;
		
		// The 8 primitive data types are assigned default values if not initialized. For example, uninitializedInt above has a value of 0.
		// Uninitialized data types other than the 8 primitive types are assigned the value "null" by default.
		// An uninitialized variable needs to eventually be initialized. You will eventually see why we want to delay initialization
		// in some cases.
		
		
		/* PRACTICE:
		 * 	1. Write a line of code that creates a "double" variable named "pi" and assigns it a value of 3.14d
		 * 
		 * 	2. Write a line of code that prints the value of pi + 5.1
		 * 
		 * 	3. (Challenge) Use a boolean to help you determine whether the following sentence is true or false:
		 * 	   "pi - 2.06 is less than 0.8"
		 * 
		 * 	   Print the value of your boolean. Is the statement true?
		 * 
		 *  4a. Is 7456 divisible by 11? If not, what is the remainder?
		 *   b. Is 20306 divisible by 26? If not, what is the remainder?
		 */
	}
}
