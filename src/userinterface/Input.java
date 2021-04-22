package userinterface;

import java.math.BigDecimal;
import java.util.Scanner;

public class Input {

	public Scanner scanner;

	public Input()
	{
		scanner = new Scanner(System.in);
	}

	public BigDecimal getOperand()
	{
		return scanner.nextBigDecimal();
	}

	public String getOperator()
	{
		return scanner.next();
	}

	public void exit() {
		scanner.close();
	}
}
