
public class PhoneBookAdmin extends User implements AdminInterface{
	//member variable
	private String emailAddress;

	/**
	 * @return the emailAddress
	 */
	public String getEmailAddress() {
		return emailAddress;
	}

	/**
	 * @param emailAddress the emailAddress to set
	 */
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	
	//change password
	public void changePassword(String p) {
		this.password=p;
	}
	//change username
	public void changeUsername(String u) {
		this.username =u;
	}
	//override printinfo();
	
	public void PrintUserInfo() {
		System.out.println("Username: " + this.username);
		System.out.println("Password: " + this.password);
		System.out.println("Email: " + this.emailAddress);
		
		
	}

	@Override
	public void addEntry(PhoneBookEntry e) {
		entry.addEntry(e);
		
	}

	@Override
	public void editEntry(String f, String l) {
		entry.Edit(f, l);
		
	}

	@Override
	public void Sort() {
		entry.SortbyID();
		
	}

	@Override
	public int LinearSearch(String num) {
		return entry.LinearSearchByPhoneNumber(num);
		
	}

	@Override
	public PhoneBookEntry BinarySearch(int id) {
		return entry.SearchbyIdBinarySearch(id);
	}
	
	
	
	
	
	
	
	

	
}
