package recursion;

public class A {
	private int[] mas;
	
	public A(int n) {
		mas = new int[n];
		for (int i = 0; i < mas.length; i++) {
			mas[i] =  (int) Math.round(Math.random()*100);
		}
	}
	
	private void print(int n) {
		if (n==0) {
			return;
		}
		System.out.println(mas[n-1] + " ");
		print(n-1);
	}
}
