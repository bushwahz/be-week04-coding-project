package week04_Coding_Project;

import java.util.HashMap;
import java.util.Map;

public class week04_Coding_Project {

	public static void main(String[] args) {
/*		
		+-------------------+
		|                   |
		|      STEP  1      |
		|                   |
		+-------------------+
*/		
		
		// create and initialize the array
		int[] ages = {3, 9, 23, 64, 2, 8, 28, 93};
		
		// programmatically subtract the first array element from the last
		int agesArrLength = ages.length;
		int result = ages[ages.length - 1] - ages[0];
		
		// print the result to the console
		System.out.println("Result of subtraction in ages array: " + result);
		
		// create new array with 9 elements
		int[] ages2 = {27, 25, 21, 9, 6, 7, 100, 5, 30};

		// programmatically subtract the first array element from the last
		int ages2ArrLength = ages.length;
		int result2 = ages2[ages2.length - 1] - ages2[0];;
		
		// print the result2 to the console
		System.out.println("Result of subtraction in ages2 array: " + result2);
		
		// iterate through ages2 array
		int ages2Sum = 0;
		for (int i = 0; i < ages2.length; i++) {
			ages2Sum += ages2[i];
		}
		
		// calculate average age and print result to console
		int ages2Average = ages2Sum / ages2.length;
		System.out.println("The average age in ages2 is " + ages2Average );

/*		
		+-------------------+
		|                   |
		|      STEP  2      |
		|                   |
		+-------------------+
*/		
		
		// create an array of String
        String[] names = {"Sam", "Tommy", "Tim", "Sally", "Buck", "Bob"};
        int totalLetters = 0;
        
        // iterate through the String array
        for (String name : names) {
            totalLetters += name.length();
        }
        
		// calculate average number of letters and print result to console
        double average = (double) totalLetters / names.length;
        
        // print to the console
        System.out.println("Average number of letters per name: " + average);
        
        // concatenate all names together with StringBuilder
        StringBuilder concatenatedNames = new StringBuilder();
        
        // iterate through array of String with enhanced loop and append together
        for (String name : names) {
            concatenatedNames.append(name).append(" ");
        }
        
        // print out concatenated names to console
        System.out.println("Concatenated names: " + concatenatedNames.toString().trim());

/*		
		+-------------------+
		|                   |
		|      STEP  3      |
		|                   |
		+-------------------+
*/	
        
        // Accessing the last element of the array
        String lastElement = names[names.length - 1];


/*		
		+-------------------+
		|                   |
		|      STEP  4      |
		|                   |
		+-------------------+
*/		
       
        // Accessing the first element of the array
        String firstElement = names[0];
              
        // create the empty array for name lengths
        int[] nameLengths = new int[names.length];
      

/*		
		+-------------------+
		|                   |
		|      STEP  5      |
		|                   |
		+-------------------+
*/	
       
        // iterate through names array to count name lengths
        for (int i = 0; i < names.length; i++) {
            nameLengths[i] = names[i].length();
        }


        /*		
		+-------------------+
		|                   |
		|      STEP  6      |
		|                   |
		+-------------------+
*/		
       
        // create empty sum variable and iterate through array
        int sum = 0;
        for (int length : nameLengths) {
            sum += length;
        }
       
        // print the sum to the console
        System.out.println("Sum of name lengths: " + sum);


/*		
		+-------------------+
		|                   |
		|      STEP  7      |
		|                   |
		+-------------------+
*/	
       
        // print the concatenate method to the console
        System.out.println(concatenate("Java", 3));
 

/*		
		+-------------------+
		|                   |
		|      STEP  8      |
		|                   |
		+-------------------+
*/		
       
        // print full name to the console
        System.out.println(getFullName("John", "Doe"));

/*		
		+-------------------+
		|                   |
		|      STEP  9      |
		|                   |
		+-------------------+
*/		
       
        // print the boolean result to the console - sum of ages
        System.out.println("Is the sum greater than 100?: " + isSumGreaterThan100(ages));

/*		
		+-------------------+
		|                   |
		|      STEP  10     |
		|                   |
		+-------------------+
*/		
        // create an array of double to test the method
        double[] numbers = {9.95, 1.23, 3.45, 6.78};
        
        // print the average to the console
        double average1 = calculateAverage(numbers);
        System.out.println("The average is: " + average1);
    
	
/*		
		+-------------------+
		|                   |
		|      STEP  11     |
		|                   |
		+-------------------+
*/
	    
         // create the two arrays of double
	     double[] arr1 = {1.0, 2.0, 3.0};
	     double[] arr2 = {4.0, 5.0, 6.0};
	     
	     // print the method to the console
	     System.out.println(isFirstArrayAverageGreater(arr1, arr2));
	
	 

    

/*		
		+-------------------+
		|                   |
		|      STEP  12     |
		|                   |
		+-------------------+
*/
	     // create 2 variables to test method
	     boolean isHot = true;
	        double money = 15.00;

	        // print a result to the console with a conditional
	        if (willBuyDrink(isHot, money)) {
	            System.out.println("You will enjoy a cold beer.");
	        } else {
	            System.out.println("You will not buy a drink.");
	        }



/*		
		+-------------------+
		|                   |
		|      STEP  13     |
		|                   |
		+-------------------+
*/
	        

	     
	    // Create a Map of guitar brands and prices 
		HashMap<String, Double> guitarBrands = new HashMap<>();
		guitarBrands.put("Fender", 1200.00);
		guitarBrands.put("Gibson", 2500.00);
		guitarBrands.put("Ibanez", 800.00);
		guitarBrands.put("Yamaha", 600.00);
		guitarBrands.put("Martin", 3000.00);
		
		// 
		
		// create a string and assign the method
		String cheapestBrand = findCheapestBrand(guitarBrands);
		
		// print the result to the console
		System.out.println("The cheapest guitar brand is: " + cheapestBrand);
		}
		
		// create a method to determine which brand is the cheapest
		public static String findCheapestBrand(HashMap<String, Double> brands) {
		
		// create an empty variable container
		String cheapestBrand = null;
		
		// create an empty variable for the price
		double lowestPrice = Double.MAX_VALUE;
		
		// iterate through the map
		for (Map.Entry<String, Double> entry : brands.entrySet()) {
			
			// conditional to compare prices
			if (entry.getValue() < lowestPrice) {
				
				lowestPrice = entry.getValue();
				
				cheapestBrand = entry.getKey();
			}
		}
		
		// return the brand that is cheapest
		return cheapestBrand;
	            
	        

	}
		
/*
 ------------------------------------------------------------------------
*/
	
/*		
		+-------------------+
		|                   |
		|      METHODS      |
		|                   |
		+-------------------+
*/	
		// STEP 7 - method to concatenate word to itself using StringBuilder to modify string
    	public static String concatenate(String word, int n) {
        StringBuilder result = new StringBuilder();
        
        // iterate through the result and repeat the numbers taken in
        for (int i = 0; i < n; i++) {
            result.append(word);
        }
        
        // return the result
        return result.toString();
        
        }
    	
    	
    	// STEP 8 - method to get full name
    	public static String getFullName(String firstName, String lastName) {
            
    		// return and concatenate full name
    		return firstName + " " + lastName;
        }
    	
    	// STEP 9 - method to check if sum if greater than 100
    	public static boolean isSumGreaterThan100(int[] numbers) {
            
    		// create container variable
    		int sum = 0;
            // iterate through array and assign sum of ages[] to an array
    		for (int number : numbers) {
                sum += number;
            }
            
            // return the sum and check if greater than 100
            return sum > 100;
        }
    	
    	// STEP 10 - method to return average of array of double
    	public static double calculateAverage(double[] array) {
            
    		// create sum container
    		double sum = 0;
    		
    		// iterate through the array
            for (double num : array) {
                sum += num;
            }
            
            // return the average
            return sum / array.length;
        }
    	
    	// STEP 11 - method to return average of 2 different arrays and compare them
        public static boolean isFirstArrayAverageGreater(double[] arr1, double[] arr2) {
        	
        	// create container for 1st sum
            double sum1 = 0;
            
            // iterate through 1st array and assign sum to 1st variable
            for (double num : arr1) {
                sum1 += num;
            }
            
            // calculate the average of 1st array
            double avg1 = sum1 / arr1.length;
            
            // create container for 2nd sum
            double sum2 = 0;
            
            // iterate through 2nd array and assign 2nd sum to 2nd variable
            for (double num : arr2) {
                sum2 += num;
            }
            
            // create container for 2nd sum
            double avg2 = sum2 / arr2.length;
            
            // return the averages
            return avg1 > avg2;
        }
        
        // STEP 12 - method to check if it's hot outside and money in pocket
        public static boolean willBuyDrink(boolean isHotOutside, double moneyInPocket) {
            
        	// return both variables and check if greater
        	return isHotOutside && moneyInPocket > 10.50;
        }

        // STEP 13 - method to determine which popular brand of guitar is the cheapest
        
}

