package calc;

import java.math.BigDecimal;

import calc.Operator;

public class Add implements Operator {

	private final String symbol = "+";
	@Override
	public BigDecimal calc(BigDecimal left, BigDecimal right) {
		// TODO 自動生成されたメソッド・スタブ
		return left.add(right);
	}

	@Override
	public String toString() {
		// TODO 自動生成されたメソッド・スタブ
		return symbol;
	}

}
