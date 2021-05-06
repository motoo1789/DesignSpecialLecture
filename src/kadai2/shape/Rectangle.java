package kadai2.shape;

import java.awt.Point;
import java.util.HashMap;
import java.util.Map;

import kadai2.message.IMessage;

public class Rectangle extends AShape implements IMessage{

	int pos_x 	= 0; 		// 左上x
	int pos_y 	= 0; 		// 左上y
	int width_x = 0; 		// x幅
	int height_y = 0; 		// y幅
	int widthpos_x = 0;
	int heightpos_y = 0;

	Map<String,Point> rectanglePoint = new HashMap<String,Point>();
	String[] rectangleKey = {"左上","右上","左下","右下"};

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
		height_y = super.inputKadai2.input("y幅");

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
	public void output() {
		// TODO 自動生成されたメソッド・スタブ
		messageOutput("左上",pos_x, pos_y);
		messageOutput("左下",pos_x, height_y);
		messageOutput("右上",widthpos_x, pos_y);
		messageOutput("左下",widthpos_x, height_y);
	}

	@Override
	public void messageInput()
	{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println("入力：左上のx座標, 左上のy座標, xの幅, yの幅 をそれぞれ入力");

	}

	@Override
	public void messageOutput(String posName,  int pos_x, int pos_y)
	{
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(posName + "(" + pos_x + "," + pos_y + ")");
	}

	public int getPosX()
	{
		return pos_x;
	}

	@Override
	public int getPosY() {
		// TODO 自動生成されたメソッド・スタブ
		return pos_x;
	}

	@Override
	public Map<String, Point> getPoint() {
		// TODO 自動生成されたメソッド・スタブ
		return rectanglePoint;
	}
}
