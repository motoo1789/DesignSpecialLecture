package kadai2.shape;

import input.Iinput;
import input.KadaiInput2;
import java.awt.Point;
import java.util.Map;

public abstract class AShape {

	Iinput inputKadai;

	protected  AShape(Iinput input)
	{
		inputKadai = input;
	}

	abstract public boolean input();
	abstract public void output();
	abstract public int getPosX();
	abstract public int getPosY();
	abstract public Map<String,Point> getPosMap();
}
