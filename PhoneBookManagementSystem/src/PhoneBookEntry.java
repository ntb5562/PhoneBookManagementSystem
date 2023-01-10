
public class PhoneBookEntry {
	//member variables
	private int ID = -1;
	private String fname;
	private String lname;
	private String email;
	private String zip;
	private String num;
	
	
	/**
	 * @return the iD
	 */
	public int getID() {
		return ID;
	}

	/**
	 * @param iD the iD to set
	 */
	public void setID(int iD) {
		ID = iD;
	}

	/**
	 * @return the fname
	 */
	public String getFname() {
		return fname;
	}

	/**
	 * @param fname the fname to set
	 */
	public void setFname(String fname) {
		this.fname = fname;
	}

	/**
	 * @return the lname
	 */
	public String getLname() {
		return lname;
	}

	/**
	 * @param lname the lname to set
	 */
	public void setLname(String lname) {
		this.lname = lname;
	}
	
	public String getEmail() {
		return email;
	}
	
	public void setEmail(String e) {
		this.email=e;
	}

	/**
	 * @return the zip
	 */
	public String getZip() {
		return zip;
	}

	/**
	 * @param zip the zip to set
	 */
	public void setZip(String zip) {
		this.zip = zip;
	}

	/**
	 * @return the num
	 */
	public String getNum() {
		return num;
	}

	/**
	 * @param num the num to set
	 */
	public void setNum(String num) {
		this.num = num;
	}

	//constructors
	public PhoneBookEntry() {
		//sound sad
	}
	
	public PhoneBookEntry(int id, String f, String l, String e,String z, String n) {
		this.ID = id;
		this.fname = f;
		this.lname = l;
		this.email =e;
		this.zip = z;
		this.num = n;
		
	}
	
	public PhoneBookEntry(String f, String n) {
		this.fname =f;
		this.num = n;
	}
	
	//method that prints everything 
	public void printBookEntry() {
		System.out.println("First Name:" + this.fname);
		System.out.println("Last name: " + this.lname);
		System.out.println("Email: " + this.email);
		System.out.println("Zip Code: " + this.zip);
		System.out.println("Phone number: " + this.num);
	}
	
	
	
}
