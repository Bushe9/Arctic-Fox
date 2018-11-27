import java.util.Scanner;

public class FracCalcPartner {

	public static void main(String[] args) {
		// TODO: Read the input from the user and call produceAnswer with an equation
		produceAnswer("1/2 + 1/2");
		//System.out.print("Please enter an expression: ");
		//Scanner console = new Scanner(System.in);
		//while (console.hasNextLine()) {
			
			//String input = console.nextLine();
			//if (input.equals("quit")) {
			//	break;
			}
		//}
		//console.close();
	//}

	// ** IMPORTANT ** DO NOT DELETE THIS FUNCTION.  This function will be used to test your code
	// This function takes a String 'input' and produces the result
	//
	// input is a fraction string that needs to be evaluated.  For your program, this will be the user input.
	//      e.g. input ==> "1/2 + 3/4"
	//        
	// The function should return the result of the fraction after it has been calculated
	//      e.g. return ==> "1_1/4"
	public static String produceAnswer(String input) { 
		// TODO: Implement this function to produce the solution to the input
		Scanner passer = new Scanner(input);
		String frac1 = passer.next();
		String symbol = passer.next();
		String frac2 = passer.next();
		int whole1 = wholeNum1(frac1);
		int whole2 = wholeNum2(frac2);
		int numerator1 = numerNum(frac1);
		int numerator2 = numerNum(frac2);
		int denominator1 = denomNum(frac1);
		int denominator2 = denomNum(frac2);
		if (symbol.contains("+")) {
			int wholeAns = whole1 + whole2;
			if (denominator1 == denominator2) {
				int numeratorAns = numerator1 + numerator2;
			} else {
				numerator2 *= denominator1;
				numerator1 *= denominator2;
				denominator1 *= denominator2;
				denominator2 = denominator1;

			}
		}
		/*if(input.contains("+")) {
			if(input.contains("_")) {
				System.out.print(input.substring(0, input.indexOf('_')));
				int whole1 = Integer.parseInt(input.substring(0, input.indexOf('_')));
				System.out.print("_");
				System.out.print(input.substring(input.indexOf('_') + 1, input.indexOf('/')));
				int numerator1 = Integer.parseInt(input.substring(input.indexOf('_') + 1, input.indexOf('/')));
				System.out.print("/");
				System.out.println(input.substring(input.indexOf('/') + 1, input.length()));
				int denominator1 = Integer.parseInt(input.substring(input.indexOf('/') + 1, input.length()));
				int whole2 = Integer.parseInt(input.substring(input.indexOf('+') + 1, input.lastIndexOf('_')));
				int numerator2 = Integer.parseInt(input.substring(input.lastIndexOf('_') + 1, input.lastIndexOf('/'))); 
				int denominator2 = 
				System.out.print("");

	} else if(input.contains("/")){
		System.out.print(input.substring(0,input.indexOf('/')));
		int numerator = Integer.parseInt(input.substring(0,input.indexOf('/')));
		System.out.print("/");
		System.out.println(input.substring(input.indexOf('/') + 1, input.length()));
		int denominator = Integer.parseInt(input.substring(input.indexOf('/') + 1, input.length()));
	} else {
		System.out.println(input.substring(0,input.length()));
		int whole = Integer.parseInt(input.substring(0, input.indexOf('_')));
	}*/
		//passer.close();
		return null;
	}

	public static int wholeNum1(String frac) {
		if (frac.contains("_")) {
			return Integer.parseInt(frac.substring(0, frac.indexOf("_")));
		} else if (!frac.contains("/")) {
			if (frac.contains("+")) {
				return Integer.parseInt(frac.substring(0, frac.indexOf("+")));
			} else {
				return 0;

			}

		}
		return 0;
	}

	public static int wholeNum2(String frac) {
		if (frac.contains("_")) {
			return Integer.parseInt(frac.substring(0, frac.indexOf("_")));
		} else if (!frac.contains("/")) {
			return Integer.parseInt(frac.substring(0, frac.indexOf("+")));
		} else {
			return 0;
		}
	}

	public static int numerNum(String frac) {
		if (frac.contains("/")) {
			return Integer.parseInt(frac.substring(frac.indexOf('_') + 1, frac.indexOf('/')));
		} else {
			return 0;
		}
	}

	public static int denomNum(String frac) {
		if (frac.contains("/")) {
			return Integer.parseInt(frac.substring(frac.indexOf('/') + 1, frac.length())); 
		} else {
			return 1;
		}
	}
}


