package techclub.lesson_two;

/* Lesson 2: Strings, manipulating Strings, and introduction to methods */
public class LessonTwo {
	public static void main(String[] args) {
		// A "String" is a data type representing a string of characters. We use quotes to assign values to Strings
		String greeting = "Hi!";
		
		// You can directly print String variables to the console.
		System.out.println(greeting);
		
		// String variables have numerous "methods" associated with them. Methods are blocks of code that perform specific tasks.
		// Most lines of code goes inside methods, hence the somewhat-vague definition. Right now, we are writing code in a "main" method.
		
		// Methods always have a set of round brackets () at the end. Many methods require ARGUMENTS that go inside the brackets.
		// For example, the method System.out.println() takes a String argument and prints out the String to the console.
		// Methods usually have JavaDocs explaining what they do and what arguments they require. If your IDE does not show JavaDocs, you
		// can usually find them online. For example, the JavaDocs for the String methods can be found by Googling "Java 8 String JavaDoc".
		
		
		/* Some methods have return values, and some do not. The System.out.println() method does NOT return a value. However, the methods we
		 * will look at in the following examples DO have return values, and because of that, we should create variables to store those values.
		 */
		
		// Observe the syntax of how we call methods: variableName.methodName().
		// 
		
		// Example 1: Some String methods manipulate String variables to get information about the actual String stored inside.
		boolean endsInExclamationMark = greeting.endsWith("!");
		System.out.println(endsInExclamationMark);	// prints "true"
		
		// Example 2: We can also create new Strings using the original String.
		String modifiedGreeting = greeting.replace('H', 'L');
		System.out.println(modifiedGreeting);	// prints "Li!"
		
		// Example 3: Not all methods require arguments
		String loudGreeting = greeting.toUpperCase();	// Just by its name, guess what this method does?
		System.out.println(loudGreeting);	// prints "HI!"
		
		
		// IMPORTANT NOTE: The original "greeting" String does not actually change! It still stores the original "Hi!" string. The changed
		// Strings are stored in new variables (modifiedGreeting, loudGreeting).
		// If you want to change the String stored inside the "greeting" variable itself, you have to assign a new String value to the variable.
		
		
		
		/* CONCATENATION */
		// To concatenate a string to another string means to join them together one after another. A new String is created as a result
		// of concatenation. We concatenate strings using the + sign.
		
		String enthusiasticGreeting = greeting + "!!!";
		System.out.println(enthusiasticGreeting);	// prints "Hi!!!!"
		

		/* PRACTICE:
		 * 
		 * 1. The String method toLowerCase() takes no arguments and returns a String in which all the uppercase letters in the original
		 * 	  String are converted to lowercase letters. Create a String variable called "upperCase", and assign it the value "I LIKE STRINGS". 
		 * 	  Create another String variable called "lowerCase", then use toLowerCase() to convert all of the letters in the upperCase variable 
		 *    to lowercase.
		 * 
		 * 2. (Challenge) The lowerCase variable from question 1 should have the value "i like strings". However, this String is not
		 * 	  grammatically correct because the "i" is not capitalized, and there is no period. Use ONLY the replace() method and concatenation
		 *    to convert "i like strings" into the grammatically-correct sentence "I like strings." Store the corrected String in a variable.
		 *    
		 * You may wish to print out your variables to the console to check if you got the correct results.
		 */
	}
}
