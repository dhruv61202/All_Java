package edurekaAll;

import java.util.Iterator;

public class AddTwo2DArrays {

	public static void main(String[] args) {

		int a[][] = { { 10, 20, 30 }, { 40, 50, 60 }, { 70, 80, 90 } };
		int b[][] = { { 90, 100, 110 }, { 60, 200, 600 }, { 270, 280, 290 } };

		int c[][] = new int[3][3];
		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				c[i][j] = a[i][j] + b[i][j];
			}
		}
		
		System.out.println("After adding the arrays");
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<3;j++)
			{
				System.out.print(c[i][j] + "  ");
			}
			System.out.println();
		}

	}
}
