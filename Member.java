/*
Program name:  SDEV 200 - M07 Semester Project Classes
Author:  Karagory, Kevin G. 
Date:  05/10/2022
*/

/*
Module 07 Semester Project: JavaFX
*/

	
// Class: Member
//  Library Members
public class Member {
	
	public int member_ID = 0; // Constant book_ID
	public String name_first = "default_first_name"; // Constant First Name
	public String name_last = "default_last_name"; // Constant Last Name
	
	// Construct a default Member 
	Member(){
		member_ID = 0; 
		name_first = "default_first_name";
		name_last = "default_last_name";
	}	
	
	// Construct a Member 
	Member(int nextMember_ID, String nextName_first, 
			String nextName_last ){ 
		member_ID = nextMember_ID; // construct next book ID
		name_first = nextName_first;
		name_last = nextName_last;
	}	
	
	//Set the Member ID
	void member_ID(int newMember_ID) {
		member_ID = newMember_ID;
	}
	
	// Set the Name First
	void set_first_name(int newMember_ID, String newName_first) {
		name_first = newName_first;
	}
	
	// Set the Name Last
	void set_last_name(int newMember_ID, String newName_last) {
		name_last = newName_last;
	}
	
	// Get the Member ID
	int get_member_id() {
	return member_ID;
	}
	
	// Get the Name First
	String get_name_first() {
	return name_first;
	}
	
	// Get the Name Last
	String get_name_last() {
	return name_last;
	}
	
	// Method: toString(member_ID) - Output to user Member ID information
	public String toString() {
		System.out.printf("%d, %s, %s \n",
				member_ID, name_first, name_last);
		return null;
	}
		
}


