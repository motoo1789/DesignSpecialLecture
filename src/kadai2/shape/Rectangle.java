package kadai2.shape;

public class Rectangle extends AShape implements IMessage{

	int pos_x 	= 0; 		// 左上x
	int pos_y 	= 0; 		// 左上y
	int width_x = 0; 	// x幅
	int width_y = 0; 	// y幅

	public Rectangle()
	{
		super();
		System.out.println("長方形エディタ");
	}

	@Override
	public void input()
	{
		// TODO 自動生成されたメソッド・スタブ
		messageInput();
		pos_x 	= super.inputKadai2.input("左上x");
		pos_y 	= super.inputKadai2.input("左上y");
		width_x = super.inputKadai2.input("x幅");
		width_y = super.inputKadai2.input("y幅");
	}

	@Override
	public void output() {
		// TODO 自動生成されたメソッド・スタブ
		messageOutpur(pos_x, pos_y, pos_x + width_x, pos_y + width_y);
	}

	@Override
	public void messageInput()
	{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("入力：左上のx座標, 左上のy座標, xの幅, yの幅 をそれぞれ入力");

	}

	@Override
	public void messageOutpur(int pos_x, int pos_y, int width_x, int width_y)
	{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(
				"左上(" + pos_x + "," + pos_y + ")"
			 + " 左下(" + width_x + "," + pos_y + ")"
			 + " 右上(" + pos_x + "," + width_y + ")"
			 + " 右下(" + width_x + "," + width_y + ")");
	}
}
