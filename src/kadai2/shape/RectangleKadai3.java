package kadai2.shape;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

import input.Kadai3Input;
import input.KadaiInput2;

public class RectangleKadai3 extends AShape implements IMessage{

	int pos_x 	= 0; 		// 左上x
	int pos_y 	= 0; 		// 左上y
	int width_x = 0; 		// x幅
	int height_y = 0; 		// y幅
	int widthpos_x = 0;
	int heightpos_y = 0;

	Map<String,Point> rectanglePoint = new HashMap<String,Point>();
	String[] rectangleKey = {"左上","右上","左下","右下"};

	public RectangleKadai3()
	{
		super(new Kadai3Input());
		System.out.println("長方形エディタ課題３");
	}

	public RectangleKadai3(int pos_x, int pox_y,int width_x, int height_y)
	{
		super(new KadaiInput2());
		this.pos_x = pos_x;
		this.pos_y = pos_y;
		this.width_x = width_x;
		this.height_y = height_y;

		// 座標のセット
		inputPoints();
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
	public boolean input() {
		// TODO 自動生成されたメソッド・スタブ
		messageInput();

		boolean canInput = true;

		try
		{
			pos_x 		= Integer.parseInt(super.inputKadai.inputString("左上x"));
			pos_y 		= Integer.parseInt(super.inputKadai.inputString("左上y"));
			width_x 	= Integer.parseInt(super.inputKadai.inputString("x幅"));
			height_y 	= Integer.parseInt(super.inputKadai.inputString("y幅"));
		}
		catch (NumberFormatException e)
		{
			System.out.println("終わり");
			canInput = false;
			return canInput;
		}

		// 座標のセット
		inputPoints();

		return canInput;
	}

	@Override
	public void output() {
		// TODO 自動生成されたメソッド・スタブ
		messageOutput(pos_x, pos_y, pos_x + width_x, pos_y + height_y);
	}

	public void inputPoints()
	{
		// 幅を考慮した座標
		widthpos_x = pos_x + width_x;
		heightpos_y = pos_y + height_y;

		// 座標
		rectanglePoint.put("左上", new Point(pos_x,pos_y));
		rectanglePoint.put("左下", new Point(pos_x,heightpos_y));
		rectanglePoint.put("右上", new Point(widthpos_x,pos_y));
		rectanglePoint.put("右下", new Point(widthpos_x,heightpos_y));
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
