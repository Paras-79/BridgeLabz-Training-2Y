package Map_Interface;
import java.util.*;

public class Find_the_Key_with_the_Highest_Value {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> list = new HashMap<>();
		System.out.print("Enter the number of key-value pairs you want to enter: ");
		int n = input.nextInt();
		for(int i=0;i<n;i++) {
			System.out.print("Enter the key: ");
			String s = input.next();
			System.out.print("Enter the value: ");
			int num = input.nextInt();
			list.put(s, num);
		}
		int max = Integer.MIN_VALUE;
		for(int value : list.values()) {
			if(value>max) {
				max=value;
			}
		}
//		String t;
		for(String key : list.keySet()) {
			if(list.get(key)==max){
				String t=key;
				System.out.println(t);
			}
		}
	}
}
