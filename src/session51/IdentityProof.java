/**
 * IdentityProof.java
 * Compiled on 12th Aug 2017
 */
package session51;
/**
 * 
 * This class will illustrate the abstract parent class and its corresponding methods which may or may not be abstract. 
 * An abstract class may have its default or parameterized constructor but it cannot be instantiated.
 * 
 * @author Chhaya yadav
 *
 */

//ABSTRACT Class declaration

public abstract class IdentityProof {
	
//Member variable declaration with access specifier	
	
	private String IdType ;
	
//Parameterized Constructor declaration	of Parent Class
	
	public IdentityProof(String Id){
		
		IdType = Id ;
		
		System.out.println(" Abstract Class Constructor Invoked !!! ");
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
		
	}

//Parent Class Method Declaration	
	public void display(){
		System.out.println(" Method Invocation from Abstract Parent Class !");
		System.out.println(" Type of Identity Proof : " + IdType);
		System.out.println("^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^^");
}
	
//Parent Class Method Declaration	
		public void display2(){
			System.out.println("******************************************************");
			System.out.println(" Method Definition of Abstract Parent Class !");
			System.out.println("******************************************************");
	}
	
//Abstract methods' declaration that will implemented by Child Class with different Access specifiers
	
	public abstract void displayIdNr();
	
	protected abstract void displayIdName();
}
