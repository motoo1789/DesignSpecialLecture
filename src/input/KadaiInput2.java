package input;

import java.util.Scanner;

public class KadaiInput2 implements Iinput {

	public Scanner scanner;

	public KadaiInput2()
	{
		scanner = new Scanner(System.in);
	}

	@Override
	public int input(String variable) {
		// TODO 自動生成されたメソッド・スタブ
		int inputnum = 0;
		System.out.print(variable + " ← ");
		try {
			inputnum = scanner.nextInt();
		}
		catch(Exception e)
		{
			System.out.println("数値に変換できる文字を入力してください");
		}

		return inputnum;
	}

	@Override
	public void exit() {
		scanner.close();
	}
}
