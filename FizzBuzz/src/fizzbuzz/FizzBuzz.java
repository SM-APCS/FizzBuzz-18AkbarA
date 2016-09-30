/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fizzbuzz;

/**
 *
 * @author MC AbsDubs - CHANGE TO YOUR NAME
 * @class AP CSA
 * 
 * 
 * Dab on it
 * 
 */
public class FizzBuzz {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    	
    	for (int i = 1; i < 101; i++){
    		//Check if i is a factor of both 3 and 5
    		if (i % 3 == 0 && i % 5 == 0){
    			System.out.println("FizzBuzz");
    		}
    		//Else check if i is a factor of only 3
    		else if (i % 3 == 0){
    			System.out.println("Fizz");
    		}
    		//Else check if i is a factor of only 5
    		else if (i % 5 == 0){
    			System.out.println("Buzz");
    		}
    		//Else check i is neither a factor 3 nor 5
    		else{
    			System.out.println(i);
    		}
    	}
    }
    //Give Emmett an F!
    
    //ANOTHER EPIC PROGRAM BY ME. YAY!
}
