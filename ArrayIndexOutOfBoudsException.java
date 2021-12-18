package edurekaAll;

public class ArrayIndexOutOfBoudsException {
	public static void main(String[] args) {
		int a[];
		a = new int[10];
		for(int i=0;i<10;i++)
		{
			a[i] = i;
			
		}
		int el = a[10];
		System.out.println(el);
		
	}
}
