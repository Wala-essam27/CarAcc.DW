package promain;

public class Maincar {

	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		Auth a = new Auth();
		while (a.gohome(Auth.email, Auth.password)==0) 
		{a.sign();}

	}

}
