import java.util.Comparator;

class SortByNumber implements Comparator<Contact>
{
   // Used for sorting phone book by
   //  number
   public int compare(Contact a, Contact b)
   {
       return b.getPhonenumber() - a.getPhonenumber();
   }
}