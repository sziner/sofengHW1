
public class Contact {	
 private String name;
 private int phonenumber;
 
 public Contact(String name1, int phonenumber1) {
	 name= name1;
	 phonenumber = phonenumber1;
 }
 public String getName() {
	 return this.name;
 }
 public int getPhonenumber() {
	 return this.phonenumber;
 }
 public String toString() {
	String str = this.name + " " + this.phonenumber;
	return str;
}
 public void print() {
	 System.out.println(this.toString());
 }
 public boolean equals(Contact other) {
	 return this.name.equals(other.name) && this.phonenumber==other.phonenumber;
 }
}
