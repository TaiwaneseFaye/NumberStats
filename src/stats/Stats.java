//Stats Assignment
//Chris Sun
//Finds the min, max, average, and range of three numbers

package stats;
import java.util.Scanner;
public class Stats {
	
	public int numOne=0;
	public int numTwo=0;
	public int numThree=0;
	public int average=0;
	public int range=0;
	public int smallest=0;
	public int largest=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		new Stats();//starts the constructor to begin
	}	
	
	
	public Stats() {//constructor to call all the methods
		numberOne();
		numberTwo();
		numberThree();
		minimum();
		maximum();
		rangeOfThree();
		averageOfThree();
		displayResults();
	}
	
	private int numberOne() {//method to get first number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your first random number: ");
		numOne = input.nextInt();//asks for the first random number
		return numOne;
	}	
	
	private int numberTwo() {//method to get second number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your second random number: ");
		numTwo = input.nextInt();//asks for the second random number
		return numTwo;
	}

	private int numberThree() {//method to get third number
		Scanner input = new Scanner(System.in);
		System.out.println("Enter your third random number: ");
		numThree = input.nextInt();//asks for the third random number
		return numThree;		
	}	

	
	
	private void minimum() {//minimum method
		//if loop to figure out the minimum of three numbers
		if (numOne <= numTwo && numOne <= numThree) {
		    smallest = numOne;//checks if numOne is smallest
		} else if (numTwo <= numThree && numTwo <= numOne) {
		    smallest = numTwo;//checks if numTwo is smallest
		} else {
		    smallest = numThree;//if other two aren't smaller then numThree is smallest
		}
	}
	
	private void maximum() { //maximum method
		//if loop to figure out the maximum of the three numbers
		if (numOne >= numTwo && numOne <= numThree) {
			largest = numOne;//checks if numOne is the largest
		}else if (numTwo >= numThree && numTwo >= numOne) {
		    largest = numTwo;//checks if numTwo is the largest
		} else {
		    largest = numThree;//if other two aren't larger then numThree is largest
		}
	}
	
	private void rangeOfThree() { //range method
		range = largest - smallest;//finds the range of the three numbers
	}
	
	private void averageOfThree() { //average method
		average = (numOne + numTwo + numThree)/3;//finds the average of the three numbers
		}
	
	private void displayResults() { //method to display results to user
		System.out.println("The minimum of your three numbers is: " + smallest);
		System.out.println("The maximum of your three numbers is: " + largest);
		System.out.println("The average of your three numbers is: " + average);
		System.out.println("The range of your three numbers is :  " + range);
	}
	
}
