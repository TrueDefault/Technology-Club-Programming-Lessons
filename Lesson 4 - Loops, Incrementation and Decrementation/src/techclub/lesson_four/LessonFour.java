package techclub.lesson_four;

/* Lesson 4: Loops, incrementation and decrementation */
public class LessonFour {
	public static void main(String[] args) {
		// There is a trick to increase or decrease a number stored in a variable. We call this incrementation and decrementation, respectively.
		int myNumber = 5;
		
		// To increase a number by another number, use +=
		myNumber += 2;	// What do you think myNumber is equal to after this line of code?
		
		// To decrease a number by another number, use -=
		myNumber -= 4;	// What do you think myNumber is equal to after this line of code?
		
		// When we want to increase a number by 1, we can use this shorthand form below:
		myNumber++;
		
		// Decreasing a number by 1 looks like this:
		myNumber--;
		
		// Before moving on: what do you think myNumber is equal to now?
		
		System.out.println("myNumber = " + myNumber);
		
		
		// Why would we want to use incrementation and decrementation? We often use them in LOOPS.
		
		// Loops are used for performing repetitive tasks. Using what I've taught you so far, how would you print
		// each element of the following array to the console?
		String[] longArray = {"This", "is", "quite", "a", "long", "array.", "It", "contains", "10", "elements."};
		
		// You would have to do this:
		System.out.println(longArray[0]);
		System.out.println(longArray[1]);
		System.out.println(longArray[2]);
		System.out.println(longArray[3]);
		System.out.println(longArray[4]);
		System.out.println(longArray[5]);
		System.out.println(longArray[6]);
		System.out.println(longArray[7]);
		System.out.println(longArray[8]);
		System.out.println(longArray[9]);
		
		// Printing 10 elements like this is already quite annoying. What if we had an array with 1000 elements? We'd be here forever!
		// Fortunately, loops allow us to perform this task very efficiently.
		
		// EXAMPLE: Print the elements of longArray using a loop.
		for (int index = 0; index < 10; index++) {
			System.out.println(longArray[index]);
		}
		
		// This is called a "for" loop. The variable "index" increases from 0 to 9, and the line System.out.println(longArray[index]); runs
		// over and over until index is no longer less than 10.
		
		// Let's deconstruct the syntax:
		//     - "int index = 0" creates the index variable and initializes it to 0.
		//     - "index < 10" is the condition that needs to be true for the loop to run. The program checks that this condition is
		//		 true before running the loop. If the condition is false, the program exits the loop and continues with program execution.
		//	   - "index++" specifies what the program should do after running the loop once. In this case, we increase index by 1.
		
		// In-class practice: Print out all the numbers from 10 to 60 while counting up by 5's.
		for (int number = 10; number <= 60; number += 5) {
			System.out.println(number);
		}
		
		// In-class practice: Count down from 10 to 1, printing the numbers to the console.
		for (int number = 10; number >= 1; number--) {
			System.out.println(number);
		}
		
		// In-class challenge: Find the sum of all of the integers from 3 to 40.
		int currentSum = 0;	// by the way, this is called an "accumulator variable"
		for (int i = 3; i <= 40; i++) {
			currentSum += i;
		}
		System.out.println(currentSum);
		
		
		/* =============== */
		// There is another type of loop called the "while" loop. It's syntax is a lot simpler than the for loop's syntax.
		
		// EXAMPLE: Let's print the numbers from 1 to 10 using a while loop.
		int currentNumber = 1;
		while (currentNumber <= 10) {
			System.out.println(currentNumber);
			currentNumber++;	// this is a VERY IMPORTANT line. Why?
		}
		
		// Be careful of INFINITE LOOPS! Make sure your condition (e.g. currentNumber <= 10) can actually be false. In the
		// loop above, we must make sure that currentNumber is being incremented each time the loop runs. Otherwise,
		// currentNumber will always equal 1, and the loop will run forever. This causes our program to crash.
		
		// In-class practice: Use a while loop to find the sum of the following sequence of numbers: 3, 5, 7, 9, ... 21.
		currentSum = 0;
		currentNumber = 3;
		while (currentNumber <= 21) {
			currentSum += currentNumber;
			currentNumber += 2;
		}
		System.out.println(currentSum);
		
		// One more type of loop is called the "do-while" loop. This is a while loop that is guaranteed to run at least once.
		// A do-while loop is rarely used because a while loop will suffice most of the time.
		currentNumber = 10;
		do {
			currentNumber--;
		} while (currentNumber < 0);	// condition is only checked after going through the loop once. Remember that
										// Java executes code from top to bottom.
		System.out.println(currentNumber);	// prints 9
		
		
		/* PRACTICE:
		 * 
		 * 1. What's going to happen if I run this loop?
		 * 
		 *    for (int i = 0; i > -1; i++) {
		 *        System.out.println(i);
		 *    }
		 * 
		 * 2. What's going to happen if I run this loop?
		 *    
		 *    while (true) {
		 *        System.out.println("I am careless");
		 *    }
		 * 
		 * 3. Create an array with the elements {"sentence.", "good", "very", "a", "is", "This"}. Then, print out the elements
		 *    in REVERSE ORDER.
		 * 
		 * 4. (Easy-Medium challenge) Concatenate the elements of the array in question 3 into a single String, then print the String.
		 * 
		 * 5. (Easy challenge) Find the sum of the numbers in the sequence 10, 7, 4, 1, -2, ... -23.
		 * 
		 * 6. (HARD CHALLENGE) Find the sum of the numbers in the sequence 2.1, -5.6, 9.1, -12.6, ... 72.1, -75.6.
		 *    
		 *    Note #1: Java does NOT allow you to add an integer and a double together. To circumvent this problem, add ".0" to the end
		 *    of any integers you use to make Java think that you have a double. For example, 2 would become 2.0 instead.
		 *    
		 *    Note #2: You might get a long decimal as your answer, such as 10.700000002, or -83.499999987. If you get such an answer, round
		 *    it to one decimal place. For example, you would round 10.700000002 to 10.7.
		 */
	}
}
