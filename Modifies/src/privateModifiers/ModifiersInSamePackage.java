package privateModifiers;

public class ModifiersInSamePackage {
	public static void main (String [] args) {
		
		// Private Modifier 
	/* I was not able to access the private Modifier outside the class and in the same package.
	 * 
	 * PrivateModifiers pm = new PrivateModifiers();
	
	System.out.println("This is " + pm.word + pm.num);
	
	pm.Private (); */
		
		// Protected Modifier.
	// I was able to access the protected modifier outside the class, in the same package.
		
	ProtectedModifiers ptm = new ProtectedModifiers();
	
	System.out.println("Give me " + ptm.moneySign + " " + ptm.decimal + " please.");
	ptm.Protected();
	
	
	// Default Modifier 
	// I was able to access the default modifier outside the class, in the same package.
	
	DefaultModifier df = new DefaultModifier();
	
	System.out.println(df.name + " wants to pay me $ " + df.bigDecimal + " an hour");
	df.Default();
	
	
	

	// Public Modifier 
	
	// I was able to access the public modifier outside the class, in the same package.
	
	PublicModifiers pbm = new PublicModifiers();
	
	System.out.println(pbm.small + pbm.letter);
	pbm.Public();
	
	
	}
	

}
