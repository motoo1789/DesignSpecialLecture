package kadai1.main;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.ServiceLoader;

import kadai1.calc.Operator;
import kadai1.userinterface.Input;
import kadai1.userinterface.Message;

public class Kadai1 {

	public void exe()
	{
		Input input = new Input();
		Message message = new Message();
		BigDecimal result = null;

		// 演算子の生成
		List<Operator> ops = new ArrayList<>();
		for(Operator op : ServiceLoader.load(Operator.class))
		{
			ops.add(op);
		}

		message.operandMessege();
		BigDecimal operand1 = input.getOperand();
		BigDecimal operand2 = input.getOperand();


		message.operatorMessage(ops);
		String operator = input.getOperator();

		for(Operator op : ops)
		{
			if(op.toString().equals(operator))
			{
				result = op.calc(operand1, operand2);
				break;
			}
		}

		if(result == null)
			message.calcerror();
		else
			message.calcresult(result.toString());

		input.exit();
	}

}
