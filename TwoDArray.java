package edurekaAll;

public class TwoDArray {
	public static void main(String[] args) {
		double studmarks[][] = {
				{1,80,99,55},
				{2,75,85,95},
				{3,90,95,95}
		};
		
		
		for(int i=0;i<3;i++)
		{
			for(int j=0;j<studmarks[0].length;j++)
			{
				System.out.print(studmarks[i][j] + " ");
			}
			System.out.println();
		}
		
	}

}
