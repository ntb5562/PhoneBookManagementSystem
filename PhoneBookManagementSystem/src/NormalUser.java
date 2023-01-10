
public class NormalUser extends User implements NormalInterface {
	//member variables
	private int id;
	/**
	 * @return the id
	 */
	public int getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(int id) {
		this.id = id;
	}

	//override printinfo();
	public void PrintUserInfo() {
		System.out.println("ID: " + this.id);
		System.out.println("Username: " + this.username);
		System.out.println("Password: " + this.password);
		
			
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
}
