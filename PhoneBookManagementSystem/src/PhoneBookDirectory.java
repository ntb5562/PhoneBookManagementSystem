
import java.util.Scanner;
public class PhoneBookDirectory {

	PhoneBookEntry [] array = new PhoneBookEntry[6];
	
	public int addEntry(PhoneBookEntry entry) {
		int result = 0;
		for (int i = 0; i<array.length; i++) {
			if (array[i]==null) {
				array[i]=entry;
				result =1;
				break;
			}
		}
		for (int i = 0; i<array.length; i++) {
			if(array[i]!=null) {
				int entrynum = i+1;
				System.out.println("Entry #" + entrynum);
				array[i].printBookEntry();
				System.out.println();
			}
			
				
		}
		
		return result;
	}
	
	
	//search for entry by phone number
	public int LinearSearchByPhoneNumber(String PhoneNumber) {
		int result = 0;
		for (int i= 0; i<array.length; i++) {
			if (array[i]!=null && array[i].getNum().equals(PhoneNumber)) {
				result = 1;
				
			}
			
		}
		return result;
		
	}
	//search entry by ID
	public PhoneBookEntry SearchbyIdBinarySearch(int id) {
		PhoneBookEntry entry = new PhoneBookEntry();
		for (int i=0; i<array.length;i++) {
			if(array[i]!=null && array[i].getID()==id) {
				entry = array[i];
				return entry;
			}
		}
		return entry;
		
	}
	
	//sorting phonebook entries by id 
	
	public void SortbyID() {
		for (int i = 0; i<array.length; i++) {
			
			for (int j =i+1; j<array.length; j++) {
				if (array[i] != null && array[j] !=null &&array[i].getID()>array[j].getID() ) {
				PhoneBookEntry greater = array[i];
				array[i]=array[j];
				array[j]=greater;
				}
				
			}
		}
		for (int i = 0; array[i]!= null && i<array.length; i++) {
			System.out.println(array[i].getID());
			array[i].printBookEntry();
			System.out.println();
		}
	}
	
	//edit an entry
	public int Edit(String firstName, String lastName) {
		Scanner input= new Scanner(System.in);
		int result =0;
		
		for (int i =0; i<array.length; i++) {
			
			if(array[i]!=null && array[i].getFname().equals(firstName) && array[i].getLname().equals(lastName)) {
				//assumed I have to ask what attribute user wants to edit and change the attritube based on their input
				//assumed I have to keep asking until the user doesnt want to change anything
				result =1;
				while(true) {
					System.out.printf("Enter which attritube you want to change (int): %n1.ID %n2.First Name %n3. Last name %n4.Email %n5.Zip code %n6.Phone number %n7. Nothing");
					int user = input.nextInt();
					
					if(user==2) {
						System.out.println("Enter the new first name: ");
						String fname = input.next();
						array[i].setFname(fname);
					}else if (user==3) {
						System.out.println("Enter the new last name: ");
						String lname = input.next();
						array[i].setLname(lname);
					}else if(user ==1) {
						System.out.println("Enter new ID number: ");
						int id = input.nextInt();
						array[i].setID(id);
					}else if(user ==4) {
						System.out.println("Enter new email: ");
						String e = input.next();
						array[i].setEmail(e);
					}else if(user==5) {
						System.out.println("Enter new zip code: ");
						String z = input.next();
						array[i].setZip(z);
					}else if(user == 6) {
						System.out.println("Enter new phone number: ");
						String n = input.next();
						array[i].setNum(n);
					}else if(user==7) {
						break;
					}
				}
				
			}
			
			
		}
		
		
		return result;
	}
	
	public int DeleteEntry(int id) {
		int result = 1;
		for (int i=0; i<array.length;i++) {
			if (array[i]!=null && array[i].getID()==(id)) {
				//id exists 
				result = 0;
				//setting it to default constructor
				array[i]=new PhoneBookEntry();
			}
			
		}
		return result;
	}
}
