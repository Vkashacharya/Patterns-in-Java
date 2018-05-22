
public class CountRepitiveStringsSerially{

	public static void main(String[] args) {
/*Problem Week 4 */
		String s ="aaaaaaeefffasa";
		int i = 0, count = 1, j = 0;
		char[] array = new char[s.length() + 1];

		for (i = 0; i < s.length(); i++) {
			array[i] = s.charAt(i);
			for (j = i + 1; j < s.length(); j++) {
			if (array[i] == s.charAt(j))count++;
			else break;
			}
			System.out.print(count +""+ array[i]+" ");
			count = 1;
			i = j - 1;
		}

	}
}
