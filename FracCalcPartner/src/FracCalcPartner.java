import java.util.Scanner;

public class FracCalcPartner {

	public static void main(String[] args) {
		// TODO: Read the input from the user and call produceAnswer with an equation
		Scanner console = new Scanner(System.in);
		System.out.print("Please enter an expression: ");
		while (console.hasNextLine()) {

			String input = console.nextLine();
			if (input.equals("quit")) {
				break;
			} else {
				System.out.println(produceAnswer(input));
			}

		}
	}

	public static String produceAnswer(String input) { 
		Scanner passer = new Scanner(input);
		String frac1 = passer.next();
		String symbol = passer.next();
		String frac2 = passer.next();
		int whole1 = wholeNum(frac1);
		int whole2 = wholeNum(frac2);
		int numerator1 = numerNum(frac1);
		int numerator2 = numerNum(frac2);
		int denominator1 = denomNum(frac1);
		int denominator2 = denomNum(frac2);
		if (symbol.contains("+") || symbol.contains("-")) {
			int wholeAns = wholeAnsAdd(whole1, symbol, whole2);
			int numerAns = numerAnsAdd(numerator1, denominator1, symbol, numerator2, denominator2);
			int denomAns = denomAnsAdd(denominator1, symbol, denominator2);
			if (numerAns == 0) {
				return wholeAns + "";
			}
			if (numerAns >= denomAns) {
				wholeAns += (numerAns / denomAns);
				numerAns = numerAns % denomAns;
				if (numerAns == 0) {
					return wholeAns + "";
				}
			}
			if (wholeAns != 0) {
				return wholeAns + "_" + numerAns + "/" + denomAns; 
			} else { 
				return numerAns + "/" + denomAns;
			}

		} else if (symbol.contains("*") || symbol.contains("/")) {
			int wholeAns;
			int numerAns = numerAnsMult(whole1, numerator1, denominator1, symbol, whole2, numerator2, denominator2);
			int denomAns = denomAnsMult(denominator1, symbol, whole2, numerator2, denominator2);
			if (numerAns >= denomAns) {
				wholeAns = (numerAns / denomAns);
				numerAns = numerAns % denomAns;
				if (numerAns == 0) {
					return wholeAns + "";
				} else {
					return wholeAns + "_" + numerAns + "/" + denomAns;
				}
			} else {
				return numerAns + "/" + denomAns;
			}
		}

		return null;

	}

	public static int wholeNum(String frac) {
		if (frac.contains("_")) {
			return Integer.parseInt(frac.substring(0, frac.indexOf("_")));
		} else if (!frac.contains("/")) {
			return Integer.parseInt(frac.substring(0, frac.length()));
		}
		return 0;
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

	public static int wholeAnsAdd(int whole1, String symbol, int whole2) {
		if (symbol.contains("+")) {
			return whole1 + whole2;
		} else if (symbol.contains("-")) {
			if (whole2 < 0) {
				whole2 = Math.abs(whole2);
				return whole1 + whole2;
			} else {
				return whole1 - whole2;
			} 
		}
		return 0;
	}
	public static int numerAnsAdd(int numer1, int denom1, String symbol, int numer2, int denom2) {
		if (denom1 == denom2) {
			if (symbol.contains("+")) {
				return numer1 + numer2;
			} else if (symbol.contains("-")) {
				return numer1 - numer2;
			} 
		} else {
			numer2 *= denom1;
			numer1 *= denom2;
			if (symbol.contains("+")) {
				return numer1 + numer2;
			} else if (symbol.contains("-")) {
				return numer1 - numer2;
			}
		}
		return 0;
	}

	public static int denomAnsAdd(int denom1, String symbol, int denom2) {
		if (denom1 == denom2) {
			return denom1;
		} else {
			return denom1 * denom2;
		}
	}

	public static int numerAnsMult(int whole1, int numer1, int denom1, String symbol, int whole2, int numer2, int denom2) {
		numer1 = (denom1 * whole1) + numer1;
		numer2 = (denom2 * whole2) + numer2;
		if (symbol.contains("*")) {
			return numer1 * numer2;
		} else { 
			return numer1 * denom2;
		}
	}

	public static int denomAnsMult(int denom1, String symbol, int whole2, int numer2, int denom2) {
		if (symbol.contains("*") ) {
			return denom1 * denom2;
		} else {
			numer2 = (denom2 * whole2) + numer2;
			return denom1 * numer2;
		}
	}
}
