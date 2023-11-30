package Pro.main;

import java.util.Scanner;

public class Auth {
	public Admin ad;
	public Customer cust;
	
	public static  String email;
	public static String password;
	String[] emails=new String[] {"admin@gmail.com", "customer@gmail.com"};
	
	public static boolean valid(String email, String password) {
if ((email.equals("admin@gmail.com")|| email.equals("customer@gmail.com")
		||email.equals("installer@gmail.com"))&& password.equals("pass"))
	return true;
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

	public static void signout() {
		System. exit(0);	
	}

	public static int gohome(String email,String password) {
		if (email.equals("admin@gmail.com")) {
		System.out.println("Welcome Our ADMIN!"); 
		//ad.list();
		}
		if (email.equals("customer@gmail.com")) {
			System.out.println("Welcome Our CUSTOMER!"); 
			//cust.list();
			}
		return 1;
	
		
	}

}


