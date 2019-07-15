package classproject;

public class Fibonaci {
public static void main(String args[]){
	int n=9,a=0,b=1;
	for(int i=1;i<=n;i++){
		int sum=a+b;
        a=b;
		b=sum;
		System.out.println(b);
		
	}
	/*String s[]={"keerthi","arun"};
	for(String str:s)
	{
		System.out.println(str);
	}
	*/
	/*for(int i=1;i<=4;i++)
	{
		for(int j=1;j<=5;j++){
			int mul=i*j;
			System.out.println(i+"*"+j+"="+mul);
		}*/
	}
	
}

