package week4Project;

import java.util.Arrays;

public class weeklyProject {

	public static void main(String[] args) {
		// Subtracting first element from last element
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		int result = ages[ages.length - 1] - ages[0];
		System.out.println(result);
		
		// Subtracting first element from last element
		int[] ages2 = {1, 6, 9, 4, 5, 3, 7, 8, 2};
		int result2 = ages2[ages2.length - 1] - ages2[0];
		System.out.println(result2);
		
		// Finding average of ages2
		int sum = 0;
		for(int i = 0; i < ages2.length; i++) {
			sum += ages2[i];
		}
		double average = sum / ages2.length;
		System.out.println(average);
		
		// Iterating string array and calculating average
		String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
		int characters = 0;
		double result3 = 0;
		for(String name : names) {
			characters += name.length();
		}
		result3 = characters / names.length;
		System.out.println(result3);
		
		// Concatenate with spaces
		for(int s = 0; s <= (names.length - 1); s++) {
			System.out.print(names[s] + " ");
		}
		
		// Array nameLengths --------
		int[] nameLengths = new int [names.length];
		int counter = 0;
		for(String n : names) {
			nameLengths[counter] = n.length();
			counter++;
			System.out.println("\r\n" + n.length());
			}
		System.out.println(Arrays.toString(nameLengths));
		
		// Sum of nameLengths
		int sum3 = 0;
		for(int u = 0; u < nameLengths.length; u++) {
			sum3 += nameLengths[u];
		}		
		System.out.println(sum3);
		
		// Concatenate string n times from method
		concatenatedString("Hello", 3);
		
		// Return fullName from method
		fullName("Alex", "Davis");
		
		int[] testArray = {1, 2, 3, 1, 5, 7, 9, 7};
		freqOfVariables(testArray);
		
		
	}
	
	public static void concatenatedString(String word, int n) {
		String stringResult = "";
		for(int f = 0; f < n; f++) {
			stringResult += word;
		}
		System.out.println(stringResult);
	}
	
	public static void fullName(String firstName, String lastName) {
		System.out.println(firstName + " " + lastName);
	}
	
	// Method for sum array
	public static boolean sumArray(Integer[] intArray) {
		int sum = 0;
		boolean h;
		for(int num : intArray) {
			sum += num;
		}
		h = (sum > 100);
		return h;
	}
	
	// Method returns double array average
	public static double averageArray(double[] dArray) {
		int sum1 = 0;
		for(int i = 0; i < dArray.length; i++) {
			sum1 += dArray[i];
		}
		double average1 = sum1 / dArray.length;
		System.out.println(average1);
		return average1;
	}
	
	// boolean average true if element in first array are greater
	public static boolean averageTwoArrays(double[] oneArray, double[] twoArray) {
		int sum3 = 0;
		for(int j = 0; j < oneArray.length; j++) {
			sum3 += oneArray[j];
		}
		double average2 = sum3 / oneArray.length;
		
		int sum4 = 0;
		for(int k = 0; k < twoArray.length; k++) {
			sum4 += twoArray[k];
		}
		double average3 = sum4 / twoArray.length;
		boolean avgResult = false;
		
		if(average2 > average3) {
			avgResult = true;
		}
		return avgResult;
	}
	
	// Buy a drink if it is hot outside
	public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
		boolean drinkResult = false;
		if(isHotOutside == true || moneyInPocket > 10.50) {
			drinkResult = true;
		}
		return drinkResult;
	}
	
	// Create my own method
	/*
	 * The following method takes the frequency of integers in an array
	 * Prints how many sets of duplicates appear in the array
	 * I created the method due to potentially large integer arrays and to see how many duplicate value sets may appear
	 * Returning the duplicates
	 */
	public static void freqOfVariables(int[] testArray) {
		int freq = 0;
		Arrays.sort(testArray);
		for(int i = 0; i < testArray.length - 1; i++) {
			if(testArray[i] == testArray[i + 1]) {
				freq++;
			}
		}
		System.out.println("Number of duplicate sets: " + freq);
		System.out.println("Here are the duplicate sets: ");
		
		for(int k = 0; k < testArray.length; k++) {
			for(int f = k + 1; f < testArray.length; f++) {
				if(testArray[k] == testArray[f])
					System.out.println(testArray[f]);
			}
		}
		
	}
	
	
	
}
