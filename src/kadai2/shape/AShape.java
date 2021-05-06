package kadai2.shape;

import java.util.Map;

import input.Iinput;
import input.KadaiInput2;
import java.awt.Point;

public abstract class AShape {

	Iinput inputKadai2;

	protected  AShape()
	{
		inputKadai2 = new KadaiInput2();
	}

	abstract public void input();
	abstract public void output();
	abstract public int getPosX();
	abstract public int getPosY();
	abstract public Map<String,Point> getPoint();

}
