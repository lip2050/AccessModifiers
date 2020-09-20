package secondModifierPackage;

import privateModifiers.PublicModifiers;

//import privateModifiers.DefaultModifier;

public class MainModifierInDefferentPackage {

	public static void main(String[] args) {
		
		// Private modifier.
		
		/* I was not able to access the private modifier outside the class and in a different package.
		 * 
		 * PrivateModifiers pm = new PrivateModifiers();
		
		System.out.println("This is " + pm.word + pm.num);
		
		pm.Private (); */
		
		
		
		// Default modifier 
		
		/*I was not able to access the default modifier outside the class and in a different package.
		 * 
		DefaultModifier df = new DefaultModifier();
		
		System.out.println(df.name + " wants to pay me $ " + df.bigDecimal + " an hour");
		df.Default();*/

		

		// Public Modifier 
		
		// I was able to access the public modifier outside the class and in a different package.
		
		PublicModifiers pbm = new PublicModifiers();
		
		System.out.println(pbm.small + pbm.letter);
		pbm.Public();
	}

}
