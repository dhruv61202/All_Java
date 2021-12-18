package edurekaAll;

public class VariableNoOfColumns {
	public static void main(String[] args) {
		double varlength[][] = new double[4][];
		varlength[0] = new double[4];
		varlength[1] = new double[3];
		varlength[2] = new double[2];
		varlength[3] = new double[1];
		
		int temp1=4;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<temp1;j++)
			{
				varlength[i][j] = (j+1)*10;
				
			}
			temp1--;
		}
		
		System.out.println("The Contents!!");
		int temp2=4;
		for(int i=0;i<4;i++)
		{
			for(int j=0;j<temp2;j++)
				System.out.print(varlength[i][j] + " ");
			System.out.println();
			temp2--;
		}
	}

}
