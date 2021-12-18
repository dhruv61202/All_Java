package edurekaAll;

public class SelectionSort {
	
	public void Sort(int a[])
	{
		int i,j,indexOfMin,temp;
		for(i=0;i<a.length;i++)
		{
			System.out.print(a[i] + "\t");
			System.out.println();
			
			for(i=0;i<a.length-1;i++)
			{
				indexOfMin=i;
				
				for(j=i+1;j<a.length;j++)
				{
					if (a[j]<a[indexOfMin])
						indexOfMin=j;
				}
				
				temp=a[i];
				a[i]=a[indexOfMin];
				a[indexOfMin]=temp;
				
				for(int t=0;t<a.length;t++)
					System.out.print(a[t]+ "\t" );
				System.out.println();
			}
		}
	}

}
