package Register;

import java.util.Scanner;

public class Register {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Name");
		String name = sc.next();

		System.out.println("Enter Mobile no");
		String no = sc.next();
		
		if (no.length() == 10)
		{
			System.out.println("Enter Email Id");
			String email = sc.next();
			
			if (email.contains("@gmail.com")) 
			{
				System.out.println("Enter Your City ");
				String city = sc.next();
				
				System.out.println("-----------------------------------------------------");

				System.out.println("Your Entered Details");
				System.out.println("Name : " + name);
				System.out.println("Mobile No : " + no);
				System.out.println("Email  : " + email);
				System.out.println("City :" + city);

			} else {
				System.out.println("Please Enter Valid Email");
				System.exit(0);
			}

		}

		else {
			System.out.println("Please Enter No of 10 digits");
			
		}

	}

}
