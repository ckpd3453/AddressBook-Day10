package addressBook;
import java.util.ArrayList;
import java.util.Scanner;

class Add2Book
{ 
	public String fn,ln,add,ct,st,zip,pn,email;
	
	ArrayList<Add2Book> contacts = new ArrayList<Add2Book>();
	
	public Add2Book(String fn,String ln,String add,String ct,String st,String zip,String pn,String email)
	{
		super();
		this.fn=fn;
		this.ln=ln;
		this.add=add;
		this.ct=ct;
		this.st=st;
		this.zip=zip;
		this.pn=pn;
		this.email=email;
	}
	@Override
	public String toString() {
		return"\nAdd2Book[fn="+fn+",ln="+ln+",add="+add+",ct="+ct+",st="+st+",email="+email+",zip="+zip+",pn="+pn+"]";
	}
	
	void dataAdd()
	{
	
		String yes = "yes";
		 //User Input
		Scanner scanner = new Scanner(System.in);
		while(true) {
				//Initialize ArrayList to store
				
			
				System.out.print("Enter First Name: ");
				String fn =scanner.nextLine();
				
			
		
				System.out.print("Enter Last Name: ");
				String ln =scanner.nextLine();
				
			
			
				System.out.print("Enter Address: ");
				String add =scanner.nextLine();
				
	
			
				System.out.print("Enter City: ");
				String ct =scanner.nextLine();
				
			
				
				System.out.print("Enter State: ");
				String st =scanner.nextLine();
				
			
			
				System.out.print("Enter Zip Code: ");
				String zip = scanner.nextLine();
				
			
			
				System.out.print("Enter Phone No: ");
				String pn =scanner.nextLine();
				
			
			
				System.out.print("Enter Email: ");
				String email =scanner.nextLine();
				
				Add2Book newcontact = new Add2Book(fn,ln,add,ct,st,zip,pn,email);
				contacts.add(newcontact);
				System.out.println(contacts);
				break;
		}
	}
}	

public class UC5 {

	public static void main(String[] args) 
	{
		System.out.println("-----PhoneBook------");
		System.out.println("How many contacts you want to add: ");
		
		Add2Book person1 = new Add2Book(null, null, null, null, null, null, null, null);
		
		Scanner num = new Scanner(System.in);
		int howmany = num.nextInt();
		
		for(int i=1;i<=howmany;i++) {
		person1.dataAdd();
		}
	}
}
