import java.util.Scanner;

/**
*	Класс для запуска калькулятора в интерактивном режиме
*/
public class InteractRunner {

	public static void main (String[] arg) {
		Scanner reader = new Scanner(System.in);
		try {
			Calculator calc = new Calculator();
			String exit = "n";
			while (!exit.equals("y")) {
				/**
				*	Запросить тип операции
				*/
				String mode = setMode();
				/**
				*	Запросить первый аргумент
				*/
				Integer firstArg = setArg("first");
				/**
				*	Запросить второй аргумент				
				*/
				Integer secondArg = setArg("second");
				/**
				*	Произвести расчет				
				*/
				String result = getSolve(mode, firstArg, secondArg).toString();

				System.out.println("Result : " + result);
				System.out.print("Clear result value? (y/n) : ");
				String clearResult = reader.next();
				if (clearResult.equals("y"))
					calc.cleanResult();
				System.out.print("Exit? (y/n) : ");
				exit = reader.next();
			}
		}
		finally {
			reader.close();
		}
	}

	/**
	*	запросить тип операции
	* 	@return значение типа операции
	*/
	private static String setMode () {
		Scanner reader = new Scanner(System.in);
		System.out.print("Select function (+,-,*,/) : ");
		return reader.next();
	}

	/**
	*	запросить аргумент
	* 	@param order порядок аргумента
	* 	@return значение аргумента
	*/
	private static Integer setArg (String order) {
		Scanner reader = new Scanner(System.in);
		System.out.print("Enter "+order+" arg : ");
		return Integer.valueOf(reader.next());
	}

	/**
	*	запросить тип операции
	* 	@param mode, fArg, sArg тип операции, первый и второй аргументы
	* 	@return результат вычисления
	*/
	private static Integer getSolve (String mode, Integer fArg, Integer sArg) {
 		Calculator calc = new Calculator();
		switch (mode) {
			case "+" : 
				calc.add(fArg, sArg); break;
			case "-" :
				calc.ded(fArg, sArg); break;
			case "*" :
				calc.mult(fArg, sArg); break;
			case "/" :
				calc.div(fArg, sArg); break;
			default :
				System.out.println("...wrong function...");
		}
		return calc.getResult();
	}

}
