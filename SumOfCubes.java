package classproject;

public class SumOfCubes {
	static int sum;
	public long sum(int n) {
		for(int i=1;i<=n;i++) {
			sum=sum+(i*i*i);
			}
		return sum;
		
	}
	public static void main(String args[]) {
		SumOfCubes s=new SumOfCubes();
		s.sum(5);
		System.out.println(sum);
	}

}
