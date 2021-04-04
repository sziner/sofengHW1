import java.util.*;

public class PhoneBook {
 
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
		System.out.print(1+": ");
	 	list.get(i).print();
	}
 }
 public void reverse()
 {
	ListIterator<Contact> head = list.listIterator(0);
	
	reverseUtil(head, null);
 }
 void reverseUtil(ListIterator<Contact> curr, ListIterator<Contact> prev) { 
		  
	/* If last node mark it head*/
	if (curr.nextIndex() == list.size()) { 
		head = curr; 

		/* Update next to prev node */
		curr.next = prev; 
		return; 
	} 

	/* Save curr->next node for recursive call */
	Node next1 = curr.next; 

	/* and update next ..*/
	curr.next = prev; 

	reverseUtil(next1, curr); 
	return; 
}
}
