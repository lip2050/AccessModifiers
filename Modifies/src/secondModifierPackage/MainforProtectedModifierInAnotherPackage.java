package secondModifierPackage;

import privateModifiers.ProtectedModifiers;

public class MainforProtectedModifierInAnotherPackage extends ProtectedModifiers{
	
	public static void main (String []args) {
		
		// Protected modifier.
		
		// I was able to access the Protected modifier outside the class and in a different package through child class. 
	
	MainforProtectedModifierInAnotherPackage tooLong = new MainforProtectedModifierInAnotherPackage();
	
	System.out.println("Give me " + tooLong.moneySign + " " + tooLong.decimal+ " please.");
	tooLong.Protected();
	
	}

}
