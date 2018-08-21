package techclub.lesson_seven;

/* Lesson 7 - An introduction to the process of method design */
public class LessonSeven {
	// Methods can get large and complex. In this lesson, you will learn the basic steps of how to design methods that can
	// make writing methods easier.
	
	// The process shown in this lesson is adapted from the design methods of "How to Design Programs" by Felleisen, Findler, 
	// Flatt, & Krishnamurthi, 2001. UBC's course on Systematic Program Design (CPSC 110) goes into this design process in great detail.
	
	// There are five key steps to designing a good method:
	// 1. Comment stating method purpose and any restrictions on parameters
	// 2. Header (and default return value, if applicable) - determine return type and parameters
	// 3. Test cases (in main method for now, but programmers in the industry use testing suites, e.g. JUnit)
	// 4. Determine any special constructs the method body must contain (e.g. "if" statements, loops, accumulators) and begin implementation
	// 5. Body (replace default return value here)
	
	// Example: Use the design process to write a method that takes an integer and returns the integer multiplied by 2.
	
	// Step 1: comment stating the purpose
	/**
	 * Multiplies the given integer by 2, and returns the result.
	 */
	public static int doubleTheInteger(int integer) {	// step 2 - the header and default return value
		// default return value: return 0;
		return (integer * 2);	// step 5 - Write the body and replace return value
	}
	
	
	// Example: Write a method that adds an exclamation mark to the end of a String UNLESS the String already ends in an exclamation, and
	// returns the changed String (or the original String if it already ends in an exclamation).
	
	/** 
	 * Adds an exclamation mark to the end of the specified String unless the String already ends in an exclamation mark. Returns the
	 * changed String, or the original String if it already ends in an exclamation. 
	 */
	public static String addExclamation(String string) {
		if (string.endsWith("!")) {	// Step 4 - Method requires "if" statement
			return string;
		} else {
			return string + "!";
		}
	}
	
	
	// Example: Write a method that calculates and prints the area of a triangle given its base and height.
	
	/**
	 * Prints the area of a triangle given the length of its base and height. The base and height must both be greater than
	 * or equal to 0. If not, the method prints -1.0 as the area.
	 */
	public static void printTriangleArea(double base, double height) {
		if (base < 0 || height < 0) {
			System.out.println(-1.0);
		} else {
			System.out.println(base * height / 2.0);
		}
	}
	
	// Main method
	public static void main(String[] args) {
		// Step 3 - test cases in main method.
		// When writing test cases, always remember to check the "edge" cases
		
		// NOTE: In this lesson, we do not check "null" cases here. Trying to use "null" in a method results in a NullPointerException (NPE), 
		// which is useful because it tells the programmer that their variable is null and that they should initialize it. We will
		// go into more detail about "null" when we learn about classes, as well as when you should write null checks to prevent NPEs.
		
		// doubleTheInteger test cases
		System.out.println(LessonSeven.doubleTheInteger(8));	// should print 16
		System.out.println(LessonSeven.doubleTheInteger(-2));	// should print -4
		System.out.println(LessonSeven.doubleTheInteger(0));	// should print 0
		
		// addExclamation test cases
		System.out.println(LessonSeven.addExclamation("Add an exclamation"));
		System.out.println(LessonSeven.addExclamation(""));
		System.out.println(LessonSeven.addExclamation("!"));
		System.out.println(LessonSeven.addExclamation("I am yelling!"));
		System.out.println(LessonSeven.addExclamation("Test ! string with exclamation in middle"));
		
		// printTriangleArea test cases
		LessonSeven.printTriangleArea(-6.0, 2.0);	// should print -1.0
		LessonSeven.printTriangleArea(6.0, -2.0);	// should print -1.0
		LessonSeven.printTriangleArea(-6.0, -2.0);	// should print -1.0
		LessonSeven.printTriangleArea(4.5, 4.0);	// should print 9.0
		LessonSeven.printTriangleArea(0.0, 4.3);	// should print 0.0
	}
	
	
	/* PRACTICE: Using the method design process, complete the practice problems from Lesson 6. Here are the problems.
	 * 
	 * 1. Write a method that multiplies two doubles called num1 and num2, and returns the result.
	 * 
	 * 2. Write a method that divides a double called "dividend" by a double called "divisor", and PRINTS (not returns) the result. 
	 *    Bonus points if you can print an error message in case someone tries to divide by 0 (hint: use an "if" statement!).
	 * 
	 *    Reminder: the symbol for division is /
	 * 
	 * 3. (Easy Challenge) Write a method that prints out the contents of a String array ON ONE LINE, with the elements separated by commas.
	 * 
	 * 4. (Medium-Hard Challenge) Write a method that takes two String arrays, and joins their elements into one big array as if you were
	 *    concatenating the two arrays. The method should return the big array.
	 */
}
