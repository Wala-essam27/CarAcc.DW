package promain;

import java.util.Scanner;
import java.util.logging.Logger;

public class Auth {
	public Admin ad;	
	public static  String email;
	public static String password;
	public static String[] emails=new String[] {"admin@gmail.com", "customer1@gmail.com","customer2@gmail.com","installer@gmail.com","pass","pass","pass","pass"};
	public static int flag=0;
	private static final Logger LOGGER = Logger.getLogger(Auth.class.getName());
	Auth() {
	    throw new IllegalStateException("Utility class");
	  }
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

		   LOGGER.info("email: ");
		      email = s.next();

		      LOGGER.info("password: ");
		     password = s.next();
			return true;		      
	}

	public static int gohome(String email,String ps) {
		if (email.equals(emails[0])) {
			LOGGER.info("\nWelcome Our ADMIN!"); 
	     flag =1;
		
		return flag;
		}
		else if (email.equals(emails[1])||email.equals(emails[2])) {
			LOGGER.info("\nWelcome Our CUSTOMER!");
			flag =2;
			
			return flag;
			}
		
		else if (email.equals(emails[3])&&ps.equals("pass")) {
			LOGGER.info("\nWelcome Our INSTALLER!"); 
			flag =3;
			
			return flag;
			}
		return 0;
	}
}


