package classproject;

public class SumCalculation{
	public int calculateSum(int n) {
		int var1=((n/3)*(2*3+(n/3-1)*3)/2);
		int var2=((n/5)*(2*5+(n/5-1)*5)/2);
		int var3=((n/15)*(2*15+(n/15-1)*15)/2);
		int sum=var1+var2-var3;
		return sum;
		
		
	}
	public static void main(String args[]) {
		SumCalculation s=new SumCalculation();
		System.out.println(s.calculateSum(15));
	}
}
	
	
		
	


