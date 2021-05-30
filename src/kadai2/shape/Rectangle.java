package kadai2.shape;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

import input.KadaiInput2;

public class Rectangle extends AShape implements IMessage{

	private int pos_x 	= 0; 		// 左上x
	private int pos_y 	= 0; 		// 左上y
	private int width_x = 0; 		// x幅
	private int height_y = 0; 		// y幅
	private int widthpos_x = 0;
	private int heightpos_y = 0;

	Map<String,Point> rectanglePoint = new HashMap<String,Point>();
	String[] rectangleKey = {"左上","右上","左下","右下"};

	public Rectangle()
	{
		super(new KadaiInput2());
		System.out.println("長方形エディタ");
	}


	@Override
	public boolean input()
	{
		// TODO 自動生成されたメソッド・スタブ
		messageInput();
		pos_x 	= super.inputKadai.inputInteger("左上x");
		pos_y 	= super.inputKadai.inputInteger("左上y");
		width_x = super.inputKadai.inputInteger("x幅");
		height_y = super.inputKadai.inputInteger("y幅");

		// 幅を考慮した座標
		widthpos_x = pos_x + width_x;
		heightpos_y = pos_y + height_y;

		// 座標
		rectanglePoint.put("左上", new Point(pos_x,pos_y));
		rectanglePoint.put("左下", new Point(pos_x,heightpos_y));
		rectanglePoint.put("右上", new Point(widthpos_x,pos_y));
		rectanglePoint.put("右下", new Point(widthpos_x,heightpos_y));

		return true;
	}

	@Override
	public void output() {
		// TODO 自動生成されたメソッド・スタブ
		messageOutput(pos_x, pos_y, pos_x + width_x, pos_y + height_y);
	}

	@Override
	public void messageInput()
	{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("入力：左上のx座標, 左上のy座標, xの幅, yの幅 をそれぞれ入力");

	}

	@Override
	public void messageOutput(int pos_x, int pos_y, int width_x, int width_y)
	{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(
				"左上(" + pos_x + "," + pos_y + ")"
			 + " 左下(" + width_x + "," + pos_y + ")"
			 + " 右上(" + pos_x + "," + width_y + ")"
			 + " 右下(" + width_x + "," + width_y + ")");
	}

	@Override
	public int getPosX() {
		// TODO 自動生成されたメソッド・スタブ
		return pos_x;
	}

	@Override
	public int getPosY() {
		// TODO 自動生成されたメソッド・スタブ
		return pos_y;
	}

	@Override
	public Map<String, Point> getPosMap() {
		// TODO 自動生成されたメソッド・スタブ
		return rectanglePoint;
	}
}
