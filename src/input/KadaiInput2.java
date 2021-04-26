package input;

import java.math.BigDecimal;
import java.util.Scanner;

public class KadaiInput2 implements Iinput {

	public Scanner scanner;


	public KadaiInput2()
	{
		scanner = new Scanner(System.in);
	}

	@Override
	public BigDecimal inpout() {
		// TODO 自動生成されたメソッド・スタブ
		return scanner.nextBigDecimal();
	}

	@Override
	public void exit() {
		scanner.close();
	}
}
