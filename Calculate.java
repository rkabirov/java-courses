public class Calculate {
	public static void main(String[] arg) {
		System.out.println("Calculate...");
		System.out.print(arg[0]+" "+arg[1]+" "+arg[2] + " = ");
		String sResult = "";
		switch (arg[1]) {
			case "+" : sResult = sumI(arg[0], arg[2]).toString(); break;
			case "-" : sResult = dedI(arg[0], arg[2]).toString(); break;
			case "*" : sResult = multI(arg[0], arg[2]).toString(); break;
			case "/" : sResult = divI(arg[0], arg[2]).toString(); break;
			case "^" : sResult = expI(arg[0], arg[2]).toString(); break;
			default : sResult = "...wrong second parameter...";
		}
		System.out.println( sResult );
	}

	private static Integer sumI(String arg1, String arg2) {
		Integer result = Integer.valueOf(arg1) + Integer.valueOf(arg2);
		return( result );
	}

	private static Integer dedI(String arg1, String arg2) {
		Integer result = Integer.valueOf(arg1) - Integer.valueOf(arg2);
		return( result );
	}

	private static Integer multI(String arg1, String arg2) {
		Integer result = Integer.valueOf(arg1) * Integer.valueOf(arg2);
		return( result );
	}

	private static Float divI(String arg1, String arg2) {
		Float result = Float.valueOf(arg1) / Float.valueOf(arg2);
		return( result );
	}

	private static Double expI(String base, String power) {
		Double result = Math.pow(Double.valueOf(base), Double.valueOf(power));
		return( result );
	}

}
