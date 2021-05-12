package kadai2.main;

import java.util.ArrayList;
import java.util.List;

import kadai2.calc.LapCalc;
import kadai2.shape.AShape;
import kadai2.shape.Rectangle;
import kadai2.shape.RectangleKadai3;

public class Kadai2 {

	// private int shapeNum = 2;
	private List<AShape> shapeList = new ArrayList();

	public void exe()
	{
		System.out.println("長方形を入力してください");

		while(true)
		{
			AShape rectangle = new RectangleKadai3();

			if(rectangle.input())
			{
				shapeList.add(rectangle);
				System.out.println("");	 //	改行
			}
			else
			{
				break;
			}
		}

		for(AShape shape : shapeList)
		{
			shape.output();
		}

//		LapCalc lapcalc = new LapCalc();
//		lapcalc.calc(shapeList);

//		AShape rectangle = new Rectangle();
//		rectangle.input();
//		rectangle.output();

	}
}
