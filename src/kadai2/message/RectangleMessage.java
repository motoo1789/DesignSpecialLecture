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
		System.out.println("(" + pos_x + "," + pos_y + ") (" + (pos_x + width_x) + "," + pos_y + ") (" + pos_x + "," + (pos_y + width_y) + ") (" + (pos_x + width_x) + "," + (pos_y + width_y) + ")");
	}

}
