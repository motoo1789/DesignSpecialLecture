package kadai2.calc;

import java.awt.Point;
import java.util.List;
import java.util.Map;

import kadai2.shape.AShape;

public class LapCalc implements ICalc{


	public void calc(List<AShape> shapeList)
	{

		//最初に左上のxの座標を調べて小さい順にListをソート
		shapeList.sort((a,b) -> a.getPosX() - b.getPosX());

		int count = 0;
		for(AShape shape : shapeList)
		{
			System.out.println(count + "個目 左上X座標：" + shape.getPosX());
			System.out.println(count + "個目 左上Y座標：" + shape.getPosY());
		}

		System.out.println("ブレーク");

		//□１右下x ＞ x □2左上
		Map<String,Point> rec1 = shapeList.get(0).getPosMap();
		Map<String,Point> rec2 = shapeList.get(1).getPosMap();

		if(rec1.get("右下").getX() > rec2.get("左上").getX())
			System.out.println(
					"左上(" + rec2.get("左上").getX() + "," + rec2.get("左上").getY() + ")"
				 + " 左下(" + rec2.get("左下").getX() + "," + rec1.get("左下").getY() + ")"
				 + " 右上(" + rec1.get("右上").getX() + "," + rec2.get("右上").getY() + ")"
				 + " 右下(" + rec1.get("右下").getX() + "," + rec1.get("右下").getY() + ")"
			);

		// else if
		// □1右上 > □2左下)
	}
}