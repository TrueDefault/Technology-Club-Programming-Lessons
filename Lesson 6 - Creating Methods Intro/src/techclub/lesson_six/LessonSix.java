package techclub.lesson_six;

/* Lesson 6: Creating your own methods introduction */
public class LessonSix {
	// Note: All methods created for now will be "public" and "static"
	
	// Up until now, we have used a few pre-made methods, such as System.out.println(), String.toUpperCase(), and
	// String.replace(). Now, we will make our own methods.
	
	// Methods are invaluable in programming. We all know what System.out.println() does, but do we know how exactly it prints
	// messages to the console? Fortunately, we don't need to know how it works; someone else has already done the hard work of
	// writing the code for System.out.println(). All we need to do now is use the method that they created. We will never have to
	// write the code for System.out.println() ourselves.
	// Here's an analogy: we don't need to know how to make a screwdriver in order to use one. Someone else has already made it for us.
	// Methods work the same way. When we create methods, we make tools that we and other programmers can easily use in the future.
	
	// Furthermore, making our own methods allows us to reuse code. They serve a similar purpose to loops - they make coding less
	// of a hassle. Remember that without loops, we would have to copy and paste code over and over, and that gets annoying
	// very quickly. If we didn't have methods in Java, a similar problem would result.
	
	// Methods also help us organize our code.
	
	// --------------------------------------
	// Let's see an example of a method.
	
	/** 
	 * Adds two integers together, a and b, and returns the sum. 
	 */
	public static int addTwoInts(int a, int b) {
		int sum = a + b;
		return sum;
	}
	
	// Refer to the main method at the bottom to see how it is used.
	// Every method made in this lesson will be "public" and "static". I will teach you what they mean later.
	
	/* Deconstructing the syntax: */
	// The "int" after "static" refers to the method's RETURN TYPE. The method RETURNS the sum, which is an integer.
	// "addTwoInts" is the NAME of the method.
	// "int a" and "int b" are the PARAMETERS. Notice how we have to specify the data type of the parameters.
	// We have a "return" statement at the end of the method body. It specifies what integer to return.
	
	
	// Methods are hard to understand at first, so I will provide some more examples. Refer to the main method to see how these
	// methods are used.
	
	/** 
	 * Concatenates an exclamation mark to the end of the given String. 
	 */
	public static String addAnExclamationMark(String str) {
		return (str + "!");
	}
	
	/**
	 * Concatenates all the elements of the given String array into one String, then returns the String. 
	 */
	public static String concatenateArray(String[] array) {
		String concatenatedString = "";
		for (int index = 0; index < array.length; index++) {	// We use array.length to get the size of the array
			concatenatedString += array[index];
		}
		return concatenatedString;
	}
	
	
	// Methods do not necessarily have a return value. For example, System.out.println() does not return anything.
	// We put "void" as the return type in those cases. Example:
	
	/** 
	 * Prints the elements of the given String array in reverse order.
	 */
	public static void printStringArrayBackwards(String[] array) {
		for (int index = array.length - 1; index >= 0; index--) {
			System.out.println(array[index]);
		}
	}
	
	
	/** 
	 * Adds up all the numbers in the array, and prints out the result.
	 */
	public static void addUpNumbers(double[] array) {
		double sum = 0;
		for (int index = 0; index < array.length; index++) {
			sum += array[index];
		}
		System.out.println(sum);
	}
	
	// Sometimes you will see methods returning "null". If you see the line "return null;" in a method, then it
	// is returning nothing. In one of the problems on the Programming Contest, you will be asked to return null
	// in a method. Here is a quick example:
	
	/**
	 * Calculates the area of the rectangle given its length and width. Returns
	 * the area as a String. If the length or width are negative, then the
	 * method returns null.
	 */
	public static String calcRectangleArea(int length, int width) {
		if (length < 0 || width < 0) {
			return null;
		}
		int area = length * width;
		return String.valueOf(area);	// String.valueOf() converts an int into a String.
	}
	
	// Note: you cannot return null when the method's return type is a primitive data type. This is why
	// the above example returns a String and not an int.
	
	
	// Main method
	public static void main(String[] args) {
		// You may remember when we use methods on String variables, the syntax for invoking a method is variableName.methodName().
		// Those methods are called INSTANCE methods. In this lesson, we are making STATIC methods, which are invoked differently.
		
		// Use the following syntax for calling static methods: ClassName.methodName().
		int mySum = LessonSix.addTwoInts(5, 3);
		System.out.println(mySum);
		
		mySum = LessonSix.addTwoInts(10, -4);
		System.out.println(mySum);
		
		String addedExclamation = LessonSix.addAnExclamationMark("Test");
		System.out.println(addedExclamation);
		
		String[] sentenceArray = {"This", "sentence", "is", "short"};
		System.out.println(LessonSix.concatenateArray(sentenceArray));
		LessonSix.printStringArrayBackwards(sentenceArray);
		
		String rectArea = calcRectangleArea(4, 6);
		System.out.println(rectArea);
		
		String nullRectArea = calcRectangleArea(-3, 5);
		System.out.println(nullRectArea);
	}
	
	
	/* PRACTICE:
	 * 
	 * Remember that all methods for now are "public" and "static".
	 * 
	 * 1. Write a method that multiplies two doubles called num1 and num2, and returns the result.
	 * 
	 * 2. Write a method that divides a double called "dividend" by a double called "divisor", and PRINTS (not returns) the result. 
	 *    Bonus points if you can print an error message in case someone tries to divide by 0.
	 * 
	 *    Reminder: the symbol for division is /
	 * 
	 * 3. (Easy Challenge) Write a method that prints out the contents of a String array ON ONE LINE, with the elements separated by commas.
	 * 
	 * 4. (Medium-Hard Challenge) Write a method that takes two String arrays, and joins their elements into one big array as if you were
	 *    concatenating the two arrays. The method should return the big array.
	 */
}
