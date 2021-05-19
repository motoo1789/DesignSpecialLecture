package kadai2.calc;

import java.awt.Point;
import java.util.List;
import java.util.Map;

import kadai2.message.IMessage;
import kadai2.shape.AShape;
import kadai2.shape.RectangleKadai3;

public class LapCalc implements ICalc,IMessage{

	private List<AShape> shapeList;

	public LapCalc(List<AShape> list)
	{
		shapeList = list;
	}

	public void calc()
	{
		shapeList = sort(shapeList);
		LapCalc(shapeList);
	}

	private void LapCalc(List<AShape> calcShapeList)
	{
		//最初に左上のxの座標を調べて小さい順にListをソート
		calcShapeList = sort(calcShapeList);

		if(calcShapeList.size() > 1)
		{
			System.out.println(calcShapeList);
			Map<String,Point> rectangle1 = calcShapeList.get(0).getPosMap();
			Map<String,Point> rectangle2 = calcShapeList.get(1).getPosMap();

			if(rectangle1.get("右下").getY() >= rectangle2.get("左上").getY() && rectangle1.get("左上").getY() <= rectangle2.get("右下").getY() // y
				&& rectangle1.get("右下").getX() >= rectangle2.get("左上").getX() && rectangle1.get("左上").getX() <= rectangle2.get("右下").getX()) // x
			{
				int addRectanglePosX = (int)Math.max(rectangle1.get("左上").getX(),rectangle2.get("左上").getX());
				int addRectanglePosY = (int)Math.max(rectangle1.get("左上").getY(),rectangle2.get("左上").getY());
				int addRectangleWidth = (int)Math.min(rectangle1.get("右上").getX(),rectangle2.get("右上").getX()) - addRectanglePosX;
				int addRectangleHeight = (int)Math.min(rectangle1.get("左下").getY(),rectangle2.get("左下").getY()) - addRectanglePosY;

				AShape addRectangle = new RectangleKadai3(addRectanglePosX,addRectanglePosY,addRectangleWidth,addRectangleHeight);

				if(calcShapeList.size() > 1)
				{
					calcShapeList.remove(0);
					calcShapeList.remove(0);
					calcShapeList.add(addRectangle);
					LapCalc(calcShapeList);
				}
				else if(calcShapeList.size() > 0)
				{
					calcShapeList.add(addRectangle);
					LapCalc(calcShapeList);
				}
				else
				{
					System.out.println("ここに来たらおかしい");
				}
			}
			else {
				System.out.println("重なってないです");
			}
		}
		else
		{
			Map<String,Point> rectangle1 = calcShapeList.get(0).getPosMap();

			messageOutput("左上",(int)rectangle1.get("左上").getX(),(int)rectangle1.get("左上").getY());
			messageOutput("左下",(int)rectangle1.get("左下").getX(),(int)rectangle1.get("左下").getY());
			messageOutput("右上",(int)rectangle1.get("右上").getX(),(int)rectangle1.get("右上").getY());
			messageOutput("右下",(int)rectangle1.get("右下").getX(),(int)rectangle1.get("右下").getY());
		}
	}

	private List<AShape> sort(List<AShape> sortList)
	{
		//最初に左上のxの座標を調べて小さい順にListをソート
		sortList.sort((a,b) -> a.getPosX() - b.getPosX());
		return sortList;
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