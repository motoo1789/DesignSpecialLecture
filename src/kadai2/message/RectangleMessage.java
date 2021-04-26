package kadai2.message;

public class RectangleMessage implements IMessage {

	@Override
	public void messageInput() {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("入力：左上のx座標, 左上のy座標, xの幅, yの幅 をそれぞれ入力");
	}


	@Override
	public void messageOutpur(int pos_x, int pos_y, int width_x, int width_y) {
		// TODO 自動生成されたメソッド・スタブ

		int x_width = pos_x + width_x;
		int y_width = pos_y + width_y;

		System.out.println(
				" (" + pos_x + "," + pos_y + ") "
			  + " (" + width_x + "," + pos_y + ")"
			  + " (" + pos_x + "," + width_y + ")"
			  + " (" + width_x + "," + width_y + ")");
	}

}
