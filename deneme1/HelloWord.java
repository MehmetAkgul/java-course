package deneme1;

public class HelloWord {

	public static void main(String[] args) {

		String pwd = "ABc+5,3";

		int isContainLeastOneDigit = pwd.replaceAll("\\D", "").length();
		int isContainLeastLowerCase = pwd.replaceAll("[^a-z]", "").length();
		int isContainLeastUpperCase = pwd.replaceAll("[^A-Z]", "").length();
		int isContainLeastDif = pwd.replaceAll("[a-zA-Z0-9]", "").length();

		System.out.println(isContainLeastLowerCase);
		
		boolean isFirstCharSpace = pwd.startsWith(" ");
		boolean isEndCharSpace = pwd.startsWith(" ");
		if (isFirstCharSpace) {
			System.out.println("Your password is invalid. Do not use space at the begining");
		}
		if (isEndCharSpace) {
			System.out.println("Your password is invalid. Do not use space at the end.");
		}
		if (isContainLeastOneDigit == 0) {
			System.out.println("Your password is invalid. It must et least 1 digit.");
		}
		if (isContainLeastLowerCase == 0) {
			System.out.println("Your password is invalid. It must et least lower case.");
		}
		if (isContainLeastUpperCase == 0) {
			System.out.println("Your password is invalid. It must et least upper case.");
		}
		if (isContainLeastDif == 0) {
			System.out.println("Your password is invalid. It must et least different .");
		}

	}

}
