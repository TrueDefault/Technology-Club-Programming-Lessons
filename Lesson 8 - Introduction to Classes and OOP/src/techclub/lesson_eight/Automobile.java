package techclub.lesson_eight;

/** 
 * An automobile is a vehicle that runs on an engine and travels along a road. Cars, trucks, and motorcycles are examples of automobiles.
 */
public class Automobile {
	/* What attributes/qualities would an automobile have? We declare attributes within the class but outside of methods. */
	// Some examples of attributes:
	int numOfWheels;
	int cost;	// how much the Automobile costs in dollars
	int weight;	// how much the Automobile weighs in kilograms
	double currentLitresOfGas;	// how much gas, in litres, is currently in the Automobile's tank
	double gasTankCapacity;	// how much gas, in litres, the tank can hold
	
	// We (usually) do not initialize the attributes. Consider that different Automobiles have different numbers of wheels, different
	// costs, different weights, etc. We leave it to a special method called the CONSTRUCTOR to initialize the attributes.
	
	/* What actions would an Automobile perform? What actions would get performed on an Automobile? */
	// These actions are the class's methods, and define the BEHAVIOUR of Automobiles. ALL Automobiles must either perform the action 
	// or have the action performed on them. We cannot have a method called doAWheelie() because while a motorcycle can do a wheelie, 
	// a truck cannot. We can, however, have a method called drive() because any Automobile can be driven.
	
	// We have been creating "static" methods up until now. When designing methods that refer to the STATE of an object, we
	// must not make the method static. We must omit the "static" keyword from the header.
	
	/* What is an object's state? */
	// If we drive an Automobile, the amount of gas it has decreases. This is a change in the Automobile's state. An object's state 
	// is defined by its attributes. If the attributes change in value, the object's state changes as well.
	
	// Here are some examples of Automobile methods.
	
	/**
	 * Drives the Automobile the specified distance in kilometres. Prints a warning message if there are less than 2 litres of
	 * gas left in the tank after driving. If, before driving, the Automobile has no gas left in its tank, then the method
	 * will only print a warning message to fill up the tank.
	 */
	public void drive(double kilometres) {
		// This method uses currentLitresOfGas, which is a part of the Automobile's state. Thus, we cannot make this method static.
		if (currentLitresOfGas <= 0) {
			System.out.println("You cannot drive because your automobile has no gas.");
		} else {
			double gasConsumed = kilometres * 0.16;
			currentLitresOfGas -= gasConsumed;
			System.out.println("You drove " + kilometres + " kilometres and used up " + gasConsumed + " litres of gas.");
			if (currentLitresOfGas <= 2) {
				System.out.println("You need to fill up your gas tank.");
			}
		}
	}
	
	/**
	 * Fills up the Automobile's tank to full capacity.
	 */
	public void fillUpGas() {
		currentLitresOfGas = gasTankCapacity;
		System.out.println("Your automobile's tank was filled to full capacity (" + gasTankCapacity + " litres).");
	}
	
	
	// For comparisons' sake, here is a static method. Notice how it does not make any reference to an Automobile's state.
	
	/**
	 * Applies the brakes.
	 */
	public static void brake() {
		System.out.println("Screeeech!");
	}
	
	
	// How do we actually create an Automobile object? We must use a CONSTRUCTOR. A constructor is a special method that returns
	// an INSTANCE of the class. "Instance" is another word for object.
	
	// This is the constructor for an Automobile:
	// Header syntax: public ClassName(parameters...)
	
	/**
	 * Creates an Automobile with the specified number of wheels, value in dollars, weight in kilograms, litres of
	 * gasoline in the tank, and tank capacity in litres. All parameters must be greater than or equal to 0, or else an 
	 * IllegalArgumentException is thrown.
	 */
	public Automobile(int wheels, int value, int weightInKg, double litresOfGas, double tankCapacity) {
		if (wheels >= 0 && value >= 0 && weightInKg >= 0 && litresOfGas >= 0 && tankCapacity >= 0) {
			numOfWheels = wheels;
			cost = value;
			weight = weightInKg;
			currentLitresOfGas = litresOfGas;
			gasTankCapacity = tankCapacity;
		} else {
			throw new IllegalArgumentException("All parameters must be greater than or equal to 0.");
		}
	}
	
	// Notice that there is no return statement, nor does the constructor explicitly state a return type. There is also no
	// "static" keyword.
	
	// The constructor creates an Automobile object and assigns the parameters' values to the object's attributes. The newly-created
	// object now has a state that can be changed.
	
	// Notice that we THROW an IllegalArgumentException. Recall that exceptions indicate that something went wrong. If
	// any of the parameters in the constructor are less than 0, then something is wrong because it would not make sense
	// for an Automobile to have -2 wheels, or weigh -4 kilograms. In those cases, we throw an IllegalArgumentException, which
	// means we tell the program that something went wrong because of an illegal argument (i.e. parameter). Whoever is using
	// the Automobile constructor will then have to debug their code. We also include a message in the IllegalArgumentException 
	// to tell the programmer why it was thrown.
	
	// The parameter names are deliberately different than the names of the attributes. This is because the 
	// statement numOfWheels = numOfWheels makes no sense.
	
	// Refer to the main method in MyClass.java to see how the constructor is used, and how the instance methods are used.
}
