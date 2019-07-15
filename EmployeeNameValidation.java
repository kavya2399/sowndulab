package classproject;

public class EmployeeNameValidation extends Exception {
	String fName;
	String lName;
	int id;
//	public EmployeeNameValidation(String a) {
//		String s1=a;
//	}
	public void EmployeeNameValidation(String fName,String lName,int id) {
		this.fName=fName;
		this.lName=lName;
		this.id=id;
		try {
			if(fName==null && lName==null) {
				throw new EmployeeNameValidation("invalid name");
				
			}
			else {
				System.out.println("firstName:"+fName+""+"LastName:"+lName+""+"Id"+id);
			}
		}finally {
			System.out.println("Final");
			}
	}
		
		public static void main(String args[]) {
			
		EmployeeNameValidation e1=new EmployeeNameValidation();
		e1.EmployeeNameValidation("Sowndarya","J",1001);
		EmployeeNameValidation e2=new EmployeeNameValidation();
		e2.EmployeeNameValidation("","",1001);
		
		
			
		}
	}


