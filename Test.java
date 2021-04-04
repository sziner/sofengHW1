import java.util.*;

public class Test {
    public static void main(String[] args)
    {
        PhoneBook pb=new PhoneBook();
		Scanner s =new Scanner(System.in);
		int op;
		while(true)
		{
			System.out.println("\nPlease select an operation:\n"
					+ "1.  Add contact\n"
					+ "2.  Remove contact (by name)\n"
					+ "3.  Print phonebook\n"
					+ "4.  Find contact (by name)\n"
					+ "5.  Sort phonebook by names\n"
					+ "6.  Sort phonebook by phone numbers\n"
					+ "7.  Remove duplicates\n"
					+ "8.  Reverse phonebook's order\n"
					+ "9.  Save phonebook to text file\n"
					+ "10. Load contacts from text file\n"
					+ "11. Exit\n");
			op=s.nextInt();
			s.nextLine();
			if(op==1)
			{
				System.out.println("enter a name:");
				String name;
				name = s.next();
				System.out.println("enter a phone number:");
				int phonenumber;
	 			phonenumber=s.nextInt();
				pb.add(name, phonenumber);
				continue;
			}
			if(op==2)
			{
				System.out.println("enter contact name to delete");
				String name;
				name = s.next();
				pb.delete(name);
				continue;
			}
			if(op==3)
			{
				pb.printPhoneBook();
				continue;
			}
			if(op==4)
			{
				System.out.println("enter contact name to find");
				String name;
				name = s.next();
				pb.search(name);
				continue;
			}
			if(op==5)
			{
				continue;
			}
			if(op==6)
			{
				continue;
			}
			if(op==7)
			{

				continue;
			}
			if(op==8)
			{

				continue;
			}
			if(op==9)
			{
				continue;
			}
			if(op==10)
			{
				continue;
			}
			if(op==11)
			{
				break;
			}
			System.out.println("Invalid input\n");
		}
		s.close();
		return;
    }
}
