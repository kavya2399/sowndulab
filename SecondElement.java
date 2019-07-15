package classproject;

public class SecondElement{
	public static int getSecondSmallest(int[] a,int size) {
		int temp;
		for(int i=0;i<size;i++) {
			for(int j=0+i;j<size;j++) {
				if(a[i]>a[j])
				{
					temp=a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		return a[1];
	}
	
public static void main(String args[]) {
	int[] a= {2,9,8,6};
	System.out.println(getSecondSmallest(a,4));
	
	
}
}
