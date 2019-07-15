package classproject;

public class IncreaseNumber {
	public boolean flag=false;
	
	public boolean checkNumber(int number) {
		int current=number%10;
		number=number/10;
		while(number>0) {
			if(current<number) {
				flag=true;
				break;
			}
			current=number%10;
			number=number/10;
		}
		if(flag) {
			System.out.println("not in increasing");
		}else {
			System.out.println("increasinhg");
				
		}
		return flag;
	}
	
}
