import java.util.*;
import java.io.FileWriter;   // Import the FileWriter class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.File;  // Import the File class
import java.io.FileNotFoundException;  // Import this class to handle errors

public class PhoneBook
{
	private LinkedList<Contact> list = new LinkedList<Contact>();
	
	private int find_index(String name)
	{
		for(int i=0;i<list.size();i++)
		{
			if(list.get(i).getName().equals(name))
			{
				return i;
			}
		}
		return -1;
	}
	public void add(String name, int phonenumber) 
 	{
		Contact c = new Contact(name, phonenumber);
	 	list.add(c);
 	}
	public void delete(String name)
	{
		int i = find_index(name);
		if(i>-1)
		{
			list.remove(i);
		}
	}
	public void printPhoneBook()
	{
		if(list.isEmpty())
		{
			System.out.println("Phonebook is empty");
		}
		for(int i=0;i<list.size();i++)
		{
			System.out.println(list.get(i));
		}
	}
	public void search(String name)
   {
	   int i = find_index(name);
	   if(i>-1)
	   {
		   System.out.println("Contact found: " + list.get(i));
	   }
	   else
	   {
		   System.out.println("Contact not found\n");
	   }
   }
	public void sortByName()
	{
		list.sort(new SortByName());
	}
	public void sortByNumber()
	{
		list.sort(new SortByNumber());
	}
	public void removeDuplicates()
	{
		if(list.size()<2)
		{
			return;
		}
		list.sort(new SortByNameAndNumber());
		ListIterator<Contact> it = list.listIterator(0);
		Contact first = it.next();
		while (it.hasNext())
		{
			Contact cur = it.next();
			if(first.equals(cur))
			{
				it.remove();
			}
			else
			{
				first = cur;
			}
		}
	}
 	public void reverse()
 	{
		LinkedList<Contact> revLinkedList = new LinkedList<Contact>();
        for (int i = list.size() - 1; i >= 0; i--)
		{
            revLinkedList.add(list.get(i));
        }
		list.clear();
		list = revLinkedList;
 	}
 	public void exportToFile(String filename)
 	{	
		try
		{
			FileWriter file = new FileWriter(filename);
			for(int i=0;i<list.size();i++)
			{
				file.write(list.get(i).toString()+"\n");
			}
			file.close();		
		}
		catch (IOException e) 
		{
			e.printStackTrace();
		}
	}
 	public void readFromFile(String path)
 	{
		try
	 	{
			File file = new File(path);
			Scanner fileScan = new Scanner(file);
			while (fileScan.hasNext())
			{
				String name = fileScan.next();
				int phonenumber = fileScan.nextInt();
				this.add(name, phonenumber);
			}
			fileScan.close();
		}
		catch (FileNotFoundException e)
		{
			System.out.println("An error occurred.");
			e.printStackTrace();
	  	}
	}
}//end Phonebook
