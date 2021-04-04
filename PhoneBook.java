import java.util.*;

public class PhoneBook
{
 
 private LinkedList<Contact> list = new LinkedList<Contact>();
 
 public void add(String name, int phonenumber) 
 {
	 Contact c = new Contact(name, phonenumber);
	 list.add(c);
 }
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
 public void delete(String name)
 {
	 int i = find_index(name);
	 if(i>-1)
	 {
		list.remove(i);
	 }
 }
 public void search(String name) {
	int i = find_index(name);
	if(i>-1)
	 {
		list.get(i).print();
	 }
	 else
	 {
		System.out.print("Contact not found\n");
	 }
 }
 public void printPhoneBook() {
	 for(int i=0;i<list.size();i++) {
	 	list.get(i).print();
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
}
