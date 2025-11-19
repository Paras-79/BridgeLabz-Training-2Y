package Map_Interface;
import java.util.*;

public class Invert_a_Map {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> list = new HashMap<>();
		HashMap<Integer, ArrayList<String>> convertedlist = new HashMap<>();
		System.out.print("Enter the number of key-value pairs you want to enter: ");
		int n = input.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("Enter the key: ");
			String s = input.next();
			System.out.print("Enter the value: ");
			int num = input.nextInt();
			list.put(s, num);
			convertedlist.putIfAbsent(num, new ArrayList<>());
			convertedlist.get(num).add(s);
		}
		System.out.println(list.entrySet());
		System.out.println(convertedlist.entrySet());
	}
}
