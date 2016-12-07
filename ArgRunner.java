import java.util.Scanner;

/**
*	Класс для запуска калькулятора с аргументами в параметрах запуска
*/
public class ArgRunner {

	public static void main (String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			/**
			*	Операция
			*/
			String mode = arg[1];
			/**
			*	Первый аргумент
			*/
			String first = arg[0];
			/**
			*	Второй аргумент
			*/
			String second = arg[2];

			switch (mode) {
				case "+" : calc.add(Integer.valueOf(first), Integer.valueOf(second)); break;
				case "-" : calc.ded(Integer.valueOf(first), Integer.valueOf(second)); break;
				case "*" : calc.mult(Integer.valueOf(first), Integer.valueOf(second)); break;
				case "/" : calc.div(Integer.valueOf(first), Integer.valueOf(second)); break;
				default : System.out.println("...wrong function...");
			}
			System.out.println("Result : " + calc.getResult());
		}
		finally {
			reader.close();
		}
	}
}
