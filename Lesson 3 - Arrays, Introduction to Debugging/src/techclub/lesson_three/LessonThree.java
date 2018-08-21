package techclub.lesson_three;

/* Lesson 3: Arrays, introduction to exceptions and debugging */
public class LessonThree {
	public static void main(String[] args) {
		// So far, we can only store one value per variable. We can only store one number in an int variable, or one string in a String variable.
		// What if we want to store more than one value?
		// Introducing: ARRAYS
		
		// Arrays store multiple ELEMENTS. This is what an array of 6 elements looks like:
		int[] anArrayOfInts = {4, 2, 35, -12, 0, 3};
		
		// Notice how every element in the array must be of the array's data type. Only ints can go in an array of ints, and only Strings
		// can go in an array of Strings.
		
		// You create arrays very similar to how you create normal variables. You just need square brackets [] beside the data type.
		// The elements of the array are enclosed in curly brackets {} and separated by commas.
		String[] sentence = {"These", "words", "form", "a", "sentence."};
		
		// Every element is assigned an INDEX starting from 0 and counting upwards by 1. The index indicates the position of the
		// element within the array. For example, the number 4 in the array above has an index of 0, and the number 35 has an index of 2.
		
		/* ACCESSING THE INDIVIDUAL ELEMENTS OF AN ARRAY */
		// Use the index of the element you want to access.
		int fourthInteger = anArrayOfInts[3];
		System.out.println(fourthInteger);	// prints -12
		
		// We can change the elements of an array by assigning them new values like so:
		anArrayOfInts[0] = 6;
		System.out.println(anArrayOfInts[0]);	// prints 6
		
		// Once an array has been created, its size cannot be changed. An array with 6 elements will always have exactly 6 elements.
		// What happens if we try to add a 7th number to anArrayOfInts?
		anArrayOfInts[6] = 10;
		
		// If we run the program, we get the following error message:
		// ===========================================================================
		// Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: 6
		// 	   at techclub.lesson_three.LessonThree.main(LessonThree.java:34)
		// ===========================================================================
		// This tells us about an "ArrayIndexOutOfBoundsException" at line 34 of our code. An EXCEPTION tells us that something went wrong
		// with our program. Knowing this, what do you think an "ArrayIndexOutOfBoundsException" is?
		
		// Error messages can appear complicated at first, but they are there to help us DEBUG our code. If we know how to
		// analyze error messages, we can easily identify problems in our code. We now know that the index we used in line 34 is out of bounds.
		// We can fix it by setting the index within the valid range of indexes for this array: 0 to 5.
		
		
		/* Using the "new" keyword to create an array */
		
		// Shown below is another way to create an array:
		double[] decimals = new double[5];	// 5 is the length of the array, i.e. how many elements it has
		
		// Assign a value for each index:
		decimals[0] = 3.14;
		decimals[1] = 2.71828;
		decimals[2] = -1.4142;
		decimals[3] = 2.118;
		decimals[4] = 0.1;
		
		// This may seem tedious, especially when we can create this same array with just one line. However, there are times when
		// we want to create an array but not assign any values to the indexes. At those times, using the "new" keyword is the way to go.
		
		
		/* PRACTICE:
		 * 
		 * 1. When I run a program, I get the following error message:
		 * 
		 * 	  ========================================================================
		 * 	  Exception in thread "main" java.lang.NullPointerException
		 *        at programming.myprogram.MainClass.myMethod(MainClass.java:1264)
		 *    ========================================================================
		 *    
		 *    What is the name of the exception I got? What line does it occur on?
		 * 
		 * 2. Consider an int array with the elements {100, 32, -123, 394}. Which element is at index 2?
		 * 
		 * 3. Assume I have the following line of code in my program:
		 * 
		 *    String[] myFavouriteCourses = {"Programming", "French", "Math", "Biology"};
		 *    
		 *    How can I change the 4th element to "Chemistry" using just 1 line of code?
		 * 
		 * 4. All String variables have a method called substring(). This method takes 2 arguments: int beginIndex and int endIndex.
		 *    All of the characters in a String are assigned an index in the exact same way that elements in an array are assigned an 
		 *    index. The substring() method returns a String containing only the characters from indexes beginIndex to endIndex - 1 of
		 *    the original String. For example:
		 *    
		 *    String exampleString = "This is a sentence.";
		 *    String exampleSubstring = exampleString.substring(3, 13);
		 *    // exampleSubstring contains the characters from index 3 to index 12 of exampleString.
		 *    System.out.println(exampleSubstring);	// will print "s is a sen"
		 *    
		 *    Having been familiarized with the substring() method, try using it to print the String "learned a new" given
		 *    the original String "You have learned a new method today".
		 * 
		 * 5. (Challenge) Copy the following line of code:
		 * 
		 * 	  String[] aSentence = {"This", "is", "a", "sentence."};
		 * 
		 * 	  Then, use only what you know about using indexes to access the individual elements of an array, as well as concatenation, 
		 *    to print the full sentence to the console: "This is a sentence." 
		 *    
		 *    Please do not just write System.out.println("This is a sentence.");.
		 */
	}
}
