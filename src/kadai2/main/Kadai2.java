package kadai2.main;

import java.util.ArrayList;
import java.util.List;

import kadai2.shape.AShape;
import kadai2.shape.Rectangle;

public class Kadai2 {

	private int shapeNum = 2;
	private List<AShape> shapeList = new ArrayList();

	public void exe()
	{
		System.out.println("長方形を2つ入力してください");

		for(int shapeIndex = 0; shapeIndex < shapeNum; shapeIndex++)
		{
			AShape rectangle = new Rectangle();
			rectangle.input();
			shapeList.add(rectangle);
			System.out.println("");	 //	改行
		}

		AShape rectangle = new Rectangle();
		rectangle.input();
		rectangle.output();
	}
}
