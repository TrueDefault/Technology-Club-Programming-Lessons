package techclub.lesson_five;

/* Lesson 5: If statements, logical operators */
public class LessonFive {
	public static void main(String[] args) {
		// Sometimes, we want certain conditions to be met before a segment of code runs. We saw this in loops - we needed
		// a condition to be true (e.g. a number to be less than 10) in order to run the loop.
		
		/* Besides loops, however, we also use conditions in "if" statements. All the examples in this lesson, however, use loops
		 * because that's the simplest way at this point to show off "if" statements.
		 */
		
		System.out.println("========== Example 1: ==========");
		
		// The syntax is easy to understand, so let's jump right into an example.
		for (int i = 0; i < 10; i++) {
			if (i <= 5) {
				System.out.println("i is less than or equal to 5");
			} else {
				System.out.println("i is greater than 5");
			}
		}
		
		// The code in the "if" block runs if the condition is evaluated to true. Otherwise, the code in the "else" block runs.
		// Note: It is not necessary to have an "else" block, but you can use one if you want.
		
		// Sometimes we have more than 2 scenarios that we want to write code for. In that case, a simple "if-else" will not
		// suffice. We need to use an "else if".
		
		System.out.println("========== Example with else if ==========");
		
		// Example:
		for (int i = 0; i < 10; i++) {
			if (i <= 3) {
				System.out.println("Message 1 prints when i = " + i);
			} else if (i >= 7) {
				System.out.println("Message 2 prints when i = " + i);
			} else {
				System.out.println("Message 3 prints when i = " + i);
			}
		}
		
		// Java evaluates the first "if" condition to see if it is true. If it is false, Java evaluates the "else if" condition.
		// If even that is false, Java will run the code in the "else" block.
		
		/* We also need to know the various symbols often used in "if" statements. Here is a chart: */
		
		//  SYMBOL        |  MEANING
		// ---------------|--------------------------------
		//  <             |  Less than
		//  >             |  Greater than
		//  <=            |  Less than or equal to
		//  >=            |  Greater than or equal to
		//  ==            |  Equal to
		//  !=            |  Not equal to
		
		
		/* There are also the LOGICAL OPERATORS shown below: */
		
		//  LOGICAL OPERATOR  |  MEANING
		// -------------------|----------------
		//  &&                |  And
		//  ||                |  Or
		//  !                 |  Not
		
		
		// The "and" operator is used when you want to check that multiple conditions are ALL true AT THE SAME TIME.
		
		System.out.println("========== Using the \"and\" operator ==========");
		
		// Example:
		for (int i = 0; i < 10; i++) {
			if (i >= 3 && i != 5 && i != 8) {
				System.out.println("This message will print if i = " + i);
			}
		}
		
		// The "or" operator is used when you have multiple conditions that you want to check, but you require AT LEAST ONE to be true.
		
		System.out.println("========== Using the \"or\" operator ==========");
		
		// Example:
		for (int i = 0; i < 10; i++) {
			if (i == 2 || i == 5) {
				System.out.println("i = " + i);
			}
		}
		
		// The "not" operator is used to flip a boolean expression's value. A "true" expression becomes "false", and a "false" expression
		// becomes "true".
		// In the following example, we place brackets around an expression to tell the program to evaluate that expression first.
		
		System.out.println("========== Using the \"not\" operator ==========");
		
		// Example:
		for (int i = 0; i < 10; i++) {
			if (!(i > 2 && i <= 7)) {
				System.out.println("i = " + i);
			}
		}
		
		// You can combine "and", "or", and "not" operators to make very complex if statements.
		
		// First, however, we have to understand how the computer evaluates complex expressions in if statements.
		// Practice: Evaluate the following expressions to either "true" or "false". Questions a-c are in-class worked examples.
		//     a) 2 > 1
		//     b) 1 == 3
		//     c) (3 < 2) || !(9 != 4)
		//     d) !(3 < 2) && (9 != 4)
		//     e) (4 == 5 && 5 >= 1) || 3 < 9
		//     f) (10 < 14 || 10 > 8) && !(7 > 9 || 8 < 3)
		
		
		// Now let's analyze complex if statements!
		
		System.out.println("========== Complex if statement challenge ==========");
		
		// Easy Challenge: Predict which values of "i" will cause the message to print in the loop below. Then check your answer by
		// actually running the loop.
		for (int i = 0; i < 10; i++) {
			if ((i != 2 && i < 4) || i >= 8) {
				System.out.println("This message will print if i = " + i);
			}
		}
		
		System.out.println("========== Medium-Hard Challenge ==========");
		
		// Medium-Hard Challenge: Predict which values of "i" will cause the message to print in the loop below. Then check your answer by
		// actually running the loop.
		for (int i = 0; i < 10; i++) {
			if ((i > 4 && (i != 6 || i == 5)) && !(i >= 8)) {
				System.out.println("This message will print if i = " + i);
			}
		}
	}
}
