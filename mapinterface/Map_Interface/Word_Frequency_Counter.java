package Map_Interface;
import java.util.*;

public class Word_Frequency_Counter {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		HashMap<String, Integer> list = new HashMap<>();
		System.out.println("Enter the string:");
		String n = input.nextLine();
		String[] li = n.split("[,\\s!]");
		for(int i=0;i<li.length;i++) {
			li[i]=li[i].toLowerCase();
		}
		for(int i=0;i<li.length;i++) {
			int count=0;
			for(int j=0;j<li.length;j++) {
				if(li[i].equals(li[j])) {
					count++;
				}
			}
			list.put(li[i],count);
		}
		if(list.containsKey("")) {
			list.remove("");
		}
		System.out.print(list.entrySet());
	}
}
