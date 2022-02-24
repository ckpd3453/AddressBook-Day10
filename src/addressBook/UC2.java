package addressBook;
import java.util.ArrayList;
import java.util.Scanner;

class AddBook
{ 
	void dataAdd()
	{
		 //User Input
		try(Scanner scanner = new Scanner(System.in))
		{
			//Initialize ArrayList to store
			ArrayList<String> contacts = new ArrayList<String>();
			
			System.out.print("Enter First Name: ");
			String fn =scanner.nextLine();
			contacts.add(fn);
			
		
			System.out.print("Enter Last Name: ");
			String ln =scanner.nextLine();
			contacts.add(ln);
			
			
			System.out.print("Enter Address: ");
			String add =scanner.nextLine();
			contacts.add(add);
	
			
			System.out.print("Enter City: ");
			String ct =scanner.nextLine();
			contacts.add(ct);
			
			
			System.out.print("Enter State: ");
			String st =scanner.nextLine();
			contacts.add(st);
			
			
			System.out.print("Enter Zip Code: ");
			String zip = scanner.nextLine();
			contacts.add(zip);
			
			
			System.out.print("Enter Phone No: ");
			String pn =scanner.nextLine();
			contacts.add(pn);
			
			
			System.out.print("Enter Email: ");
			String email =scanner.nextLine();
			contacts.add(email);
			
			//Printing ArrayList
			System.out.println("Contact Added");
			System.out.println(contacts);
		}
	}
}

public class UC2 {

	public static void main(String[] args) 
	{
		System.out.println("PhoneBook");
		//Creating Object
		AddBook person1 = new AddBook();
		//Calling Function
		person1.dataAdd();
	}

}
