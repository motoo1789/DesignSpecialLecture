package input;

import java.util.Scanner;

import kadai2.shape.AShape;
import kadai2.shape.Rectangle;

public class Kadai3Input implements Iinput{

	public Scanner scanner;

	public Kadai3Input()
	{
		scanner = new Scanner(System.in);
	}

	@Override
	public int inputInteger(String variable) {
		// TODO 自動生成されたメソッド・スタブ
		int inputnum = 0;
		System.out.print(variable + " ← ");
		try {
			inputnum = scanner.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("数値を入力してください");
			return inputnum;
		}

		return inputnum;
	}

	@Override
	public String inputString(String variable) {
		// TODO 自動生成されたメソッド・スタブ
		String input = "";
		System.out.print(variable + " ← ");
		try {
			input = scanner.next();
		}
		catch(Exception e)
		{
			// System.out.println("数値を入力してください");
		}
		return input;
	}


	@Override
	public void exit() {
		// TODO 自動生成されたメソッド・スタブ
		scanner.close();
	}


}
