package userinterface;

import java.util.List;
import java.util.stream.Collectors;

import calc.Operator;

public class Message {

	public void operandMessege()
	{
		System.out.println("2つの数字を入力してください");
	}

	public void operatorMessage(List<Operator> ops)
	{
		//↓理解できない
		System.out.println("計算の種類を入力 → " + ops.stream().map(Operator::toString).collect(Collectors.joining(" ")));
	}

	public void calcerror()
	{
		System.out.println("計算できませんでした。");
	}

	public void calcresult(String result)
	{
		System.out.println("計算結果は" + result + "です。");
	}
}
