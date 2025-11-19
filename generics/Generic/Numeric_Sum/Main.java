package Generic.Numeric_Sum;

import java.util.*;

public class Main {
	public static <T> void sumNumbers(List<? extends Number> list) {
		int sum=0;
		for(Number num : list) {
			sum+=num.intValue();
		}
		System.out.print(sum);
	}
	public static void main(String[] args) {
		sumNumbers()
	}
}
