import java.util.Scanner;

public class FracCalcPartner {

	public static void main(String[] args) {

		{
			// TODO: Read the input from the user and call produceAnswer with an equation
			System.out.println("Enter the next equation");
			Scanner console = new Scanner(System.in);
			//wholeNum();
			//numerNum();
			//produceAnswer();
			produceAnswer(console.nextLine());
			System.out.println(produceAnswer(console.nextLine()));
			console.close(); }
		}

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
			//System.out.print(input);
			String frac1 = passer.next();
			String symbol = passer.next();
			String frac2 = passer.next();
			System.out.println(frac2);
			int whole1 = wholeNum(frac1);
			int whole2 = wholeNum(frac2);
			int numerator1 = numerNum(frac1);
			int numerator2 = numerNum(frac2);

			String denominator1 = denomNum(frac1);
			String denominator2 = denomNum(frac2);
			System.out.println(frac2);

			passer.close();
			return frac2;
		}
		public static String denomNum(String frac1) {

			return null;
		}

		public static int wholeNum(String frac) {
			if (frac.contains("_")) {
				return Integer.parseInt(frac.substring(0, frac.indexOf("_")));
			} else {
				return 0;
			}
		}
		public static int numerNum(String frac) {
			return Integer.parseInt(frac.substring(frac.indexOf('_') + 1, frac.indexOf('/')));
		}

	
	// TODO: Fill in the space below with any helper methods that you think you will need
	//import java.util.Scanner;




	/*public static void main(String[] args) {
				fraction("1_4/5");
				//fraction("27_2/3");
				//fraction("2/3");
				//fraction("1");
				//equation("1_5/6 + 3_1/3");
			}

			public static String fraction(String x) {

				if(x.contains("_")) {
					System.out.print(x.substring(0, x.indexOf('_')));
					Integer.parseInt(x.substring(0, x.indexOf('_')));
					System.out.print("_");
					System.out.print(x.substring(x.indexOf('_') + 1, x.indexOf('/')));
					Integer.parseInt(x.substring(x.indexOf('_') + 1, x.indexOf('/')));
					System.out.print("/");
					System.out.println(x.substring(x.indexOf('/') + 1, x.length()));
					Integer.parseInt(x.substring(x.indexOf('/') + 1, x.length()));

					System.out.print("");

				} else if(x.contains("/")){
					System.out.print(x.substring(0,x.indexOf('/')));
					Integer.parseInt(x.substring(0,x.indexOf('/')));
					System.out.print("/");
					System.out.println(x.substring(x.indexOf('/') + 1, x.length()));
					Integer.parseInt(x.substring(x.indexOf('/') + 1, x.length()));
				} else {
					System.out.println(x.substring(0,x.length()));
				}
				return x;
			}
		}  
			//int num = Integer.parseInt(x);*/





}


