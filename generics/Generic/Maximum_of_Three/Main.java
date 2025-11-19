package Generic.Maximum_of_Three;

public class Main {
	public static <T extends Number & Comparable<T>> void maximum(T x, T y, T z) {
		T max=x;
		
		if(y.compareTo(max)>0) {
			max=y;
		}
		if(z.compareTo(max)>0) {
			max=z;
		}
		System.out.println("Largest number is: "+max);
	}
	public static void main(String[] args) {
		maximum(1,2,3);
		maximum(3,4,2);
		maximum(4,2,3);
	}
}
