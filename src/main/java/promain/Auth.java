package promain;

import java.util.Scanner;

public class Auth {
	public Admin ad;	
	public static  String email;
	public static String password;
	public static String[] emails=new String[] {"admin@gmail.com", "customer1@gmail.com","customer2@gmail.com","installer@gmail.com","pass","pass","pass","pass"};
	public static int flag=0;
	public static boolean valid() {
		
if ((email.equals(emails[0])&&password.equals(emails[4]))||
	(email.equals(emails[1])&&password.equals(emails[5]))||
	(email.equals(emails[2])&&password.equals(emails[6]))||
	(email.equals(emails[3])&&password.equals(emails[7]))) {
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
		System.out.println("\nWelcome Our ADMIN!"); 
	     flag =1;
		
		return flag;
		}
		else if (email.equals(emails[1])||email.equals(emails[2])) {
			System.out.println("\nWelcome Our CUSTOMER!");
			flag =2;
			
			return flag;
			}
		else if (email.equals(emails[3])) {
			System.out.println("\nWelcome Our INSTALLER!"); 
			flag =3;
			
			return flag;
			}
		return flag;
	}
}


