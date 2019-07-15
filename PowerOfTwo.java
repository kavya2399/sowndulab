

package classproject;

public class PowerOfTwo {
	public boolean checkNumber(int n) {
		if(n%2!=0) {
			return false;
		}
		else {
			for(int i=0;i<=n;i++) {
				if(Math.pow(2,i)==n) {
					return true;
				}
			}
			return false;
		}
		
	}
public static void main(String args[]) {
	PowerOfTwo p=new PowerOfTwo();
	System.out.println(p.checkNumber(16));
}
}
