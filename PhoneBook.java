import java.util.*;

public class PhoneBook {
 
 private LinkedList<Contact> list = new LinkedList<Contact>();
 
 public void add(String name, int phonenumber) 
 {
	 Contact c = new Contact(name, phonenumber);
	 list.add(c);
 }
 public void delete(String name)
 {
	 for(int i=0;i<list.size();i++) {
		 if(list.get(i).getName()==name) {
		 list.remove(i);
		 break;
		 }
	}
		 
 }
 public void search(String name) {
	 for(int i=0;i<list.size();i++) {
		 if(list.get(i).getName().toString()==name) {
			 list.get(i).print(); 
		 }
	 }
 }
 public void printPhoneBook() {
	 for(int i=0;i<list.size();i++) {
	 list.get(i).print();
	}
 }
}
