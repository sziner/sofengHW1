class SortByName implements Comparator<Contact>
{
    // Used for sorting phone book by 
    //  name
    public int compare(Contact a, Contact b)
    {
        return a.getName().compareTo(b.getName());
    }
}