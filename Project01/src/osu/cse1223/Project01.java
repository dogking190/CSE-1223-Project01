/*
 * Project01.java
 * This project takes two numbers and does basic arithmetic with those numbers. 
 * Once completed it will display the solutions along with what operation was done.
 * 
 * @author Paul M Onderisin
 * @version 1.0.0
 */
package osu.cse1223;

import java.util.Scanner;

public class Project01 {

	public static void main(String[] args) {
		
		//Initilizes the scanner var
		Scanner input = new Scanner(System.in);
		
		//Asks the user for the first number and puts it in _firstNum
		System.out.print("Enter the first number: ");
		int _firstNum = input.nextInt();
		
		//Asks the user for the second number and puts it in _secondNum
		System.out.print("Enter the second number: ");
		int _secondNum = input.nextInt();
		
		//Adds the two numbers then displays them
		print(_firstNum + " + " + _secondNum + " = " + (_firstNum + _secondNum));
		
		//Subtracts the two number then display them
		print(_firstNum + " - " + _secondNum + " = " + (_firstNum - _secondNum));
		
		//Times the two numbers then displays them
		print(_firstNum + " * " + _secondNum + " = " + (_firstNum * _secondNum));
		
		//Divides the two numbers them displays them
		print(_firstNum + " / " + _secondNum + " = " + (_firstNum / _secondNum));
		
		//Gets the "Mod" if there is one 
		print(_firstNum + " % " + _secondNum + " = " + (_firstNum % _secondNum));
		
		//Gets the Average number of the two inputs
		print("The average of your two numbers is: " + (_firstNum + _secondNum)/2);
		
		//Closes the scanner
		input.close();

	}
	
	//Call this method to display text, so i dont have to type "System.out.println" every time. Plus Looks Cleaner
	public static void print(String s){
		System.out.println(s);
	}

}
