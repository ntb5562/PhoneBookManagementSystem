
public class User {
	//member variables common
	protected String username;
	protected String password;
	protected PhoneBookDirectory entry = new PhoneBookDirectory();
	/**
	 * @return the username
	 */
	public String getUsername() {
		return username;
	}
	/**
	 * @param username the username to set
	 */
	public void setUsername(String username) {
		this.username = username;
	}
	/**
	 * @return the password
	 */
	public String getPassword() {
		return password;
	}
	/**
	 * @param password the password to set
	 */
	public void setPassword(String password) {
		this.password = password;
	}
	/**
	 * @return the entry
	 */
	public PhoneBookDirectory getEntry() {
		return entry;
	}
	/**
	 * @param entry the entry to set
	 */
	public void setEntry(PhoneBookDirectory entry) {
		this.entry = entry;
	}
	//add entry
	
	//print
	public void PrintUserInfo() {
		System.out.println("Username: " + this.username);
		System.out.println("Password: " + this.password);
	}
	
	
	
	
}
