/**
 * MainClass.java
 * Compiled on 12th Aug 2017
 */
package session51;
/**
 * 
 * This class will illustrate the MainClass class with main method for Instantiation of child class
 * 
 * @author Chhaya yadav
 *
 */
public class MainClass {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//Child Class Instantiation	
		
		Passport p1 = new Passport("INTERNATIONAL", "PASSPORT" , "J5733141");
		
		p1.display();                    //Child Class Method invocation with child class object implementing method overriding
		
		p1.displayIdNr();                //Parent Class Abstract Method invocation with child class object
		
		p1.displayIdName();              //Parent Class Abstract Method Invocation with Child class object
		
		p1.display2();                   // Parent Class Method Invocation with child class object
		


	}

}
