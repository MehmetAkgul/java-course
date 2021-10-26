package day11loops;

public class doWhileLoop03 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
//		For the String “1234_?!abcdef”, type a code to count the number of letters,
//		 the number of digits and the number of others by using do-while loo
		String s = "A?5";
		s = s.toLowerCase();
		int digitCounter = 0;
		int letterCounter = 0;
		int othersCounter = 0;
		int idx = 0;
		do {
			if (s.charAt(idx) >= 'a' && s.charAt(idx) <= 'z') {
 			letterCounter++;

			} else if (s.charAt(idx) >= '0' && s.charAt(idx) <= '9') {
				digitCounter++;
			} else {
				othersCounter++;
			}
			idx++;

		} while (idx < s.length());
		
		System.out.println("Letters : "+ letterCounter);
		System.out.println("Digits : "+ digitCounter);
		System.out.println("Others : "+ othersCounter);
	
	
	
	String  t= "A5b6789cE!";
	String justDigits=t.replaceAll("[^0-9]", "");
	System.out.println("Number of digists: "+ justDigits.length());
	String justLetters=t.replaceAll("[^a-zA-Z]", "");
	System.out.println("Number of letters: "+ justLetters.length());
	String diffFromLettersAndDigits=t.replaceAll("[0-9a-zA-Z]", "");
	System.out.println("Number of letters: "+ diffFromLettersAndDigits.length());
	
	
	
	
	
	
	
	
	
	}
	
	
	
	
	
	
	
	
	

}
