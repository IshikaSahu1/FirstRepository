package Exercise;

public class Factorial2 {
	public static void main(String[] args) {
		int i = 5;
		int a = i;
		for (int p = 1; p < i; p++) {
			a = a * p;
		}
		System.out.println(a);
	}
}
