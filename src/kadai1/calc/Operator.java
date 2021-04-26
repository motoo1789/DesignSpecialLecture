package kadai1.calc;

import java.math.BigDecimal;

public interface Operator {
	public BigDecimal calc(BigDecimal left, BigDecimal right);
	public String toString();
}
