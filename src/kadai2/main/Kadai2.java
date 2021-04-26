package kadai2.main;

import input.Iinput;
import input.KadaiInput2;
import kadai2.message.IMessage;
import kadai2.message.RectangleMessage;

public class Kadai2 {

	public void exe()
	{
		Iinput inputKadai2 = new KadaiInput2();
		IMessage message = new RectangleMessage();

		int pos_x = 0;
		int pos_y = 0;
		int width_x = 0;
		int width_y = 0;

		message.messageInput();
		pos_x = inputKadai2.inpout();
		pos_y = inputKadai2.inpout();
		width_x = inputKadai2.inpout();
		width_y = inputKadai2.inpout();

		message.messageOutpur(pos_x, pos_y, pos_x + width_x, pos_y + width_y);
	}
}
