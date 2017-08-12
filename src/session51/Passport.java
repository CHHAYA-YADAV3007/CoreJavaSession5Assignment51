/**
 * Passport.java
 * Compiled on 12th Aug 2017
 */
package session51;
/**
 * 
 * This class will illustrate the child class which  inherits the abstract parent class and its corresponding abstract parent methods. 
 * A child will provide Implementation for all the abstract methods of parent class and can access the parent methods as well.
 * 
 * @author Chhaya yadav
 *
 */

//Child Class declaration inheriting Abstract Class

public class Passport extends IdentityProof{
	
//Member Variable Declaration
	
	private String IdProof ;
	
	private String PNumber;
	
//Parameterized Child Class Constructor Declaration	
	
	public Passport( String Idtype , String IdProof , String PNumber ){
		
//Calling the Parent Class Parameterized Constructor via Super Keyword		
		
	    	super(Idtype);
		
		    this.IdProof  = IdProof ;
		
		    this.PNumber  = PNumber ;
 	}
	
//Abstract method1 Definition 
	
	public void displayIdNr(){
	       System.out.println(" Abstract Method1 Implemented within Child Class ! " ) ;
	       System.out.println(" Identity Proof Number : "+ IdProof);
		   System.out.println("_______________________________________________________");
	}
	
//Abstract method2 Definition
	
	public void displayIdName(){
           System.out.println(" Abstract Method2 Implemented within Child Class !" );
           System.out.println(" Identity Proof Name : "+ PNumber);
	       System.out.println("_______________________________________________________");

	}
	
// Method Overriding for the Parent Class from Child Class
	public void display(){
		   super.display();	                                                          // Invocation of the display method definition of parent class via super keyword
		   System.out.println("Child Method has Overridden the Parent Class !");
		   System.out.println("_______________________________________________________");
	}
}
