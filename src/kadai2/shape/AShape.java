package kadai2.shape;

import input.Iinput;
import input.KadaiInput2;

public abstract class AShape {

	Iinput inputKadai2;

	protected  AShape()
	{
		inputKadai2 = new KadaiInput2();
	}

	abstract public void input();
	abstract public void output();
}
