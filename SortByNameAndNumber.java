class SortByNameAndNumber implements Comparator<Contact>
{
    // Used for sorting phone book by 
    //  name and number
    public int compare(Contact a, Contact b)
    {
        int comp = a.getName().compareTo(b.getName());
		if(comp == 0)
		{
			return b.getPhonenumber - a.getPhonenumber
		}
		else
		{
			return comp;
		}
    }
}