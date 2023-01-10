
import java.io.*;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PhoneBookApplication {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		PhoneBookAdmin admin = new PhoneBookAdmin();
		NormalUser normal = new NormalUser();
		//we assumed there is two separate files for admin and normal user with their informations and
		//we have to compare the user input with the each of the admin and normal user infos to see what the input matches with
		File Afile = new File("AdminFile.txt"); //file location in my computer
		
		Scanner scan = new Scanner(Afile);
		
	
		String ainfo ="";
		while (scan.hasNextLine()) {
			ainfo += scan.nextLine();
		}
		
		//System.out.println(ainfo);
		String [] AdminArray = ainfo.split(",");
		
		
		//normal user
		File Nfile = new File("NormalUser.txt"); //file location in my computer
		Scanner scan2 = new Scanner(Nfile);
				
	
		String Ninfo ="";
		while (scan2.hasNextLine()) {
			Ninfo += scan2.nextLine();
		}
		String [] NormalArray = Ninfo.split(",");
		
		//we assumed login only requires username and password
		System.out.println("Enter username:");
		String username = input.next();
		
		System.out.println("Enter password:");
		String pass = input.next();
		String user="";
		int i;
		for (i=0; i<AdminArray.length-1 || i<NormalArray.length-1 ;i++) {
			if (i<AdminArray.length-1 && AdminArray[i]!=null && AdminArray[i+1]!= null && username.equals(AdminArray[i])&& pass.equals(AdminArray[i+1])) {
				user = "Admin";
				admin.setUsername(AdminArray[i]);
				admin.setPassword(AdminArray[i+1]);
				if(i<AdminArray.length-2) {
					admin.setEmailAddress(AdminArray[i+2]);
				}
				
			}
			else if (i<NormalArray.length-1 && NormalArray[i]!=null && NormalArray[i+1]!= null && username.equals(NormalArray[i])&& pass.equals(NormalArray[i+1])) {
				user = "Normal";
				normal.setId(Integer.parseInt(NormalArray[i-1]));
				normal.setUsername(NormalArray[i]);
				normal.setPassword(NormalArray[i+1]);
				
			}
		}
		
		if (user.equals("Admin")) {
			System.out.println("Admin");
			while(true) {
				System.out.printf("What would you like to do (int): %n1. Change username %n2. Change password %n"
						+ "3. Add a entry %n4. Edit an entry %n5. Sort %n6.Search using linear search %n7. "
						+ "Search using binary search %n8. Print Admin Info %n9.Done");
				int ans = input.nextInt();
				if (ans==1) {
					System.out.println("Enter new username: ");
					String u = input.next();
					admin.changeUsername(u);
				}
				else if (ans==2) {
					System.out.println("Enter new password: ");
					String p = input.next();
					admin.changePassword(p);
				}
				else if (ans==3) {
					System.out.println("Enter ID, First Name, Last Name, Email Address, Zip Code, and Phone Number: ");
					int id = input.nextInt();
					String f = input.next();
					String l = input.next();
					String e = input.next();
					String z = input.next();
					String n = input.next();
					PhoneBookEntry entry = new PhoneBookEntry(id, f, l, e, z, n);
					admin.addEntry(entry);
				}
				else if (ans==4) {
					System.out.println("Enter first and last name associted to the account: ");
					String f= input.next();
					String l = input.next();
					admin.editEntry(f, l);
				}
				
				else if (ans==5) {
					
					admin.Sort();
				}
				
				else if (ans==6) {
					System.out.println("Enter phone number: ");
					String pn = input.next();
					admin.LinearSearch(pn);
				}
				else if (ans==7) {
					System.out.println("Enter ID number: ");
					int idn = input.nextInt();
					System.out.println(admin.BinarySearch(idn)); //print 1 if exists
				} 
				else if(ans==8) {
					admin.PrintUserInfo();
				}
				else if(ans==9) {
					break;
				}
			}

			
		}else if(user.equals("Normal")) {
			System.out.println("User");
			while(true) {
				System.out.printf("What would you like to do (int): 1. Add a entry %n2.Edit an entry "
						+ "%n3. Sort %n4.Search using linear search %n5.Print user Info %n6.Done");
				int ans = input.nextInt();
				if (ans == 1) {
					System.out.println("Enter id, first name, last name, email, zip, and phone number: ");
					int id = input.nextInt();
					String f = input.next();
					String l = input.next();
					String e = input.next();
					String z = input.next();
					String n = input.next();
					PhoneBookEntry entry = new PhoneBookEntry(id, f, l, e, z, n);
					normal.addEntry(entry);
				}
				else if (ans==2) {
					System.out.println("Enter first and last name associted to the account: ");
					String f= input.next();
					String l = input.next();
					normal.editEntry(f, l);
				}
				else if (ans==3) {
					normal.Sort();
				}
				else if (ans==4) {
					System.out.println("Enter phone number: ");
					String pn = input.next();
					System.out.println(normal.LinearSearch(pn)); //prints 1 if exists
				}
				else if (ans==5) {
					normal.PrintUserInfo();
				}
				else if(ans==6) {
					break;
				}
			}
			
		}
		
		
	}
}
