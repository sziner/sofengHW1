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
			if(!s.hasNextInt())
			{
				System.out.println("Invalid input\n");
				continue;
			}
			op=s.nextInt();
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
				System.out.println("Phonebook contents:");
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
				pb.sortByName();
				System.out.println("Phonebook sorted by name");
				continue;
			}
			if(op==6)
			{
				pb.sortByNumber();
				System.out.println("Phonebook sorted by numbers");
				continue;
			}
			if(op==7)
			{
				pb.removeDuplicates();
				System.out.println("Duplicates removed");
				continue;
			}
			if(op==8)
			{
				pb.reverse();
				System.out.println("Phonebook reversed");
				continue;
			}
			if(op==9)
			{
				System.out.println("Enter a name for the text file:");
	 			String filename;
	 			filename = s.next();
				pb.exportToFile(filename);
				System.out.println("Phonebook saved succesfully");
				continue;
			}
			if(op==10)
			{
				System.out.println("Enter a Text file path:");
				String path;
				path = s.next();
				pb.readFromFile(path);
				System.out.println("Entries loaded succesfully");
				continue;
			}
			if(op==11)
			{
				System.out.println("Exiting...");
				break;
			}
			System.out.println("Invalid input\n");
		}//while
		s.close();
		return;
    }//main
}//Test