package com;

public class Addition {
	public int addTwoNumbers(int number1, int number2) throws IncorrectDataException {
		int result = 0;
		if(number1 < 0 || number2 < 0) {
			throw new IncorrectDataException("Input has to be positive number");
		}
		return result;
	}

}
