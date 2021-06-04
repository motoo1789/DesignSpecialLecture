package jsp;

public class JSP {

	final int XLEN = 100;
	final int YLEN = 100;

	int BUNSHI[][] = new int[YLEN][XLEN];
	int BUNBO[][] = new int[YLEN][XLEN];


	public JSP()
	{
		for(int y = 0; y < YLEN; y++)
		{
			for(int x = 0;x < XLEN; x++)
			{
				BUNSHI[y][x] = y + 1;
				BUNBO[y][x] = x + 1;
				System.out.print(BUNSHI[y][x] + "/" + BUNBO[y][x] + " ");
			}
			System.out.println();
		}

	}

	public void exe()
	{
		int count = 0;

		int y,x;
		y = x = 0;


		while(x < XLEN && y < YLEN)
		{
			// System.out.println("copunt " + count);
			if(BUNSHI[y][x] < BUNBO[y][x])
			{
				for(int i = 0; i < count; i++)
				{
					outputBUNSHI(x,y);
					outputBUNBO(x,y);
					y++;
					x--;
				}
				outputBUNSHI(x,y);
				outputBUNBO(x,y);
				y++;
			}
			else
			{
				for(int i = 0; i < count; i++)
				{
					outputBUNSHI(x,y);
					outputBUNBO(x,y);
					y--;
					x++;
				}
				outputBUNSHI(x,y);
				outputBUNBO(x,y);
				x++;
			}
			count++;
		}
	}




	public void outputBUNSHI(int x, int y)
	{
		System.out.print(BUNSHI[y][x] + "/");
	}

	public void outputBUNBO(int x, int y)
	{
		System.out.print(BUNBO[y][x] + " ");
	}
}
