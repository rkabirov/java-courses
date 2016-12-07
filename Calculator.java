/** 
*	Класс реализует калькулятор
*/
public class Calculator {
	/**
	*	Результат вычисления
	*/
	private int result;

	/**
	*	суммируем аргументы
	*	@param params Аргументы суммирования
	*/
	public void add (int ... params) {
		for (Integer param : params) {
			this.result += param;
		}
	}

	/**
	*	вычитаем аргументы
	*	@param params Аргументы вычитания
	*/
	public void ded (int ... params) {
		for (Integer param : params) {
			this.result -= param;
		}
	}

	/**
	*	умножаем аргументы
	*	@param params Аргументы умножения
	*/
	public void mult (int ... params) {
		for (Integer param : params) {
			this.result *= param;
		}
	}

	/**
	*	делим аргументы
	*	@param params Аргументы деления
	*/
	public void div (int ... params) {
		for (Integer param : params) {
			this.result /= param;
		}
	}

	/**
	*	получить результат
	*	@result Результат вычисления
	*/
	public int getResult () {
		return this.result;
	}

	/**
	*	очистить результат вычисления
	*/
	public void cleanResult () {
		this.result = 0;
	}

}
