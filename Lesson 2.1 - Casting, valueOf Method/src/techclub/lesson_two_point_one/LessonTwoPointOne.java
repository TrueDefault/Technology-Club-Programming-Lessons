package techclub.lesson_two_point_one;

public class LessonTwoPointOne {
	public static void main(String[] args) {
		String testString = "Test";
		
		// Method arguments must be of a certain data type specified by the method itself.
		// For instance, consider the String method endsWith(String). This method takes one argument,
		// which MUST be a String (as shown in the brackets).
		
		// Correct usage:
		boolean endsWithT = testString.endsWith("t");
		
		// INCORRECT usage:
		// boolean endsWithThree = testString.endsWith(3);
		
		// Why does the above line of code result in an error?
		// Answer: We cannot use an int argument when the method requires a String argument.
		
		// Sometimes, we can convert a variable of one data type to another by using CASTING.
		// We can cast a primitive data type to other primitive data types. Here is an example:
		int myInteger = 9;
		double castedInteger = (double) myInteger;
		
		System.out.println(myInteger);	// prints 9
		System.out.println(castedInteger);	// prints 9.0 -- because doubles are decimal numbers
		
		// We cannot just cast any data type to any data type. The following line of code
		// does not compile:
		
		// String integerAsString = (String) myInteger;
		
		// int and String are not closely related to one another, so you cannot cast an int to a String
		// or vice versa. That would be like trying to turn an apple into an orange - it wouldn't make sense.
		
		/* ==================== */
		
		// There are some instances, however, where we want to use a number in String form. We can convert
		// a primitive data type to a String using the method String.valueOf(number).
		// NOTE: The syntax we have been using for calling methods thus far has been variableName.methodName(arguments)
		// (e.g. testString.endsWith("t")). The String.valueOf() method uses "String" in place of the variableName.
		
		// Here is an example of String.valueOf() being used:
		double pi = 3.14;
		String piAsString = String.valueOf(pi);
		
		// We now have a String representation of pi. Our new String piAsString has the exact same behaviour
		// as any other String. For example, we can concatenate other Strings to it.
		System.out.println(piAsString);
		String piSentence = piAsString + " is a very nice number.";
		System.out.println(piSentence);
		
		/* ==================== */
		
		// A more advanced concept:
		// If a String's value can be represented as a number, we can convert the String to a number.
		// For every primitive type that represents numbers, there is a method that converts a String
		// representation of a number into its respective data type. The methods are as follows:
		
		// String to int conversion: Integer.parseInt(String s)
		// String to double conversion: Double.parseDouble(String s)
		// String to long conversion: Long.parseLong(String s)
		// String to float conversion: Float.parseFloat(String s)
		// String to short conversion: Short.parseShort(String s)
		// String to byte conversion: Byte.parseByte(String s)
		
		// Demonstration: String to int conversion
		String representationOfInt = "495";
		int theActualInt = Integer.parseInt(representationOfInt);
		System.out.println(theActualInt + 5);
		
		/* ==================== */
		
		/* In what situations would we want to convert a number to a String? */
		// Answer: if we want our number to have the functionality of a String, then we convert it
		// to a String. Strings have a lot of methods that plain numbers do not (e.g. the contains() method).
		
		/* In what situations would we want to convert a String representation of a number to a primitive type? */
		// Answer: if we want to do math with the number stored as a String, then we must convert it into 
		// a primitive type. We cannot "add" and "subtract" Strings like we do with numbers.
		
		/* ==================== */
		
		// One last note: We can convert a String to a number IF AND ONLY IF the String's value is a number. The
		// following line of code will compile, but when you try to run the program, it displays an
		// error message (in this case, a NumberFormatException).
		
		int willThisWork = Integer.parseInt("Test");
		
		
		/* PRACTICE:
		 * 
		 * 1. All doubles have a decimal component, while ints do not. What happens when you cast a double to an int? 
		 *    Will the value of the number change? If so, in what cases will it change? Test this with code.
		 * 
		 * 2. Can you directly cast a String to a primitive type?
		 * 
		 * 3. I have three integers:
		 * 
		 *    int first = 34;
		 *    int second = 23;
		 *    int third = 987;
		 *    
		 *    Using the String.valueOf() method, "concatenate" the integers together and print the result
		 *    to the console.
		 * 
		 * 4. I have two ints represented as Strings:
		 * 
		 *    String x = "45";
		 *    String y = "37";
		 *    
		 *    Using the Integer.parseInt() method, find the sum of the ints represented in the Strings x and y, and print the result.
		 */
	}
}
