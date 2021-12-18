package edurekaAll;

public class ElementInArrayDeletion {
	public static void main(String[] args) {

		char[] source = { 'H', 'A', 'P', 'P', 'L', 'A', 'W' };
		char[] destination = new char[7];

//		Copying elements from one array to another
		System.arraycopy(source, 0, destination, 1, 5);
		System.out.println(new String(destination));

//		Deleting element from array
		int flag = 3;
		for (int i = 0; i < source.length; i++) {
			if (flag == i) {
				for (int j = i + 1; i < source.length - 1; j++) {
					source[i] = source[j];
					i++;
				}
				System.out.println(source);

			}

		}
	}

}
