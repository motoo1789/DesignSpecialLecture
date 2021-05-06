package kadai2.calc;

import java.awt.Point;
import java.util.List;
import java.util.Map;

import kadai2.shape.AShape;
import kadai2.shape.IMessage;

public class LapCalc implements ICalc,IMessage{


	public void calc(List<AShape> shapeList)
	{

		//最初に左上のxの座標を調べて小さい順にListをソート
		shapeList.sort((a,b) -> a.getPosX() - b.getPosX());

		Map<String,Point> rectangle1 = shapeList.get(0).getPoint();
		Map<String,Point> rectangle2 = shapeList.get(1).getPoint();

		if(rectangle1.get("右下").getY() >= rectangle2.get("左上").getY() && rectangle1.get("左上").getY() <= rectangle2.get("右下").getY() // y
			&& rectangle1.get("右下").getX() >= rectangle2.get("左上").getX() && rectangle1.get("左上").getX() <= rectangle2.get("右下").getX()) // x
			{
				messageOutput("左上",(int)Math.max(rectangle1.get("左上").getX(),rectangle2.get("左上").getX()),(int)Math.max(rectangle1.get("左上").getY(),rectangle2.get("左上").getY()));
				messageOutput("左下",(int)Math.max(rectangle1.get("左下").getX(),rectangle2.get("左下").getX()),(int)Math.min(rectangle1.get("左下").getY(),rectangle2.get("左下").getY()));
				messageOutput("右上",(int)Math.min(rectangle1.get("右上").getX(),rectangle2.get("右上").getX()),(int)Math.max(rectangle1.get("右上").getY(),rectangle2.get("右上").getY()));
				messageOutput("右下",(int)Math.min(rectangle1.get("右下").getX(),rectangle2.get("右下").getX()),(int)Math.min(rectangle1.get("右下").getY(),rectangle2.get("右下").getY()));

//				System.out.println(
//					"左上(" + Math.max(rectangle1.get("左上").getX(),rectangle2.get("左上").getX()) + "," + Math.max(rectangle1.get("左上").getY(),rectangle2.get("左上").getY()) + ")"
//				 + " 左下(" + Math.max(rectangle1.get("左下").getX(),rectangle2.get("左下").getX()) + "," + Math.min(rectangle1.get("左下").getY(),rectangle2.get("左下").getY()) + ")"
//				 + " 右上(" + Math.min(rectangle1.get("右上").getX(),rectangle2.get("右上").getX()) + "," + Math.max(rectangle1.get("右上").getY(),rectangle2.get("右上").getY()) + ")"
//				 + " 右下(" + Math.min(rectangle1.get("右下").getX(),rectangle2.get("右下").getX()) + "," + Math.min(rectangle1.get("右下").getY(),rectangle2.get("右下").getY()) + ")");

		}
		else {
			System.out.println("重なってないです");
		}
	}

	@Override
	public void messageInput() {
		// TODO 自動生成されたメソッド・スタブ

	}

	@Override
	public void messageOutput(String posName, int pos_x, int pos_y) {
		// TODO 自動生成されたメソッド・スタブ
		System.out.println(posName + "(" + pos_x + "," + pos_y + ")");
	}
}


