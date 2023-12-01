package Pro.main;

import java.util.Scanner;

public class Auth {
	public Admin ad;
	public Customer cust;
	
	public static  String email;
	public static String password;
	static String[] emails=new String[] {"admin@gmail.com", "customer@gmail.com","installer@gmail.com", "pass"};
	
	public static boolean valid() {
		
if ((email.equals(emails[0])||email.equals(emails[1])||email.equals(emails[2]))&& password.equals(emails[3])) {
	return true;
}	
	else return false;
	}
	
	@SuppressWarnings("resource")
	public static boolean sign( ) {
		
		Scanner s = new Scanner(System.in);

		    System.out.print("email: ");
		      email = s.next();

		    System.out.print("password: ");
		     password = s.next();
			return true;		      
	}

	public static int gohome(String email,String password) {
		if (email.equals(emails[0])) {
		System.out.println("Welcome Our ADMIN!"); 
		//list();
		}
		else if (email.equals(emails[1])) {
			System.out.println("Welcome Our CUSTOMER!"); 
			//cust.list();
			}
		else if (email.equals(emails[2])) {
			System.out.println("Welcome Our INSTALLER!"); 
			//cust.list();
			}
		return 1;
	}
}


