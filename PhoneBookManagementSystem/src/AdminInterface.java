
public interface AdminInterface {
	public void addEntry(PhoneBookEntry entry);
	public void editEntry(String f, String l);
	public void Sort();
	public int LinearSearch(String num);
	public PhoneBookEntry BinarySearch(int id);
	public void changeUsername(String u);
	public void changePassword(String p);
}
