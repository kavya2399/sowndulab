package classproject;

public class DifferenceCalculation {
	public int calculateDifference(int n) {
		int sqaure=n*(n+1)*((2*n)+1)/6;
		int naturalNo=n*(n+1)/2;
		int sumOfN=naturalNo*naturalNo;
		int sum=sumOfN-sqaure;
		return sum;
	}
public static void main(String args[]) {
	DifferenceCalculation D=new DifferenceCalculation();
	System.out.println(D.calculateDifference(10));
	
	
}
}
