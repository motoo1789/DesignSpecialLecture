package kadai2.main;

import input.Iinput;
import input.KadaiInput2;
import kadai2.shape.AShape;
import kadai2.shape.IMessage;
import kadai2.shape.Rectangle;

public class Kadai2 {

	public void exe()
	{
		AShape rectangle = new Rectangle();
		rectangle.input();
		rectangle.output();
	}
}
