/*
Program name:  SDEV 200 - M07 Semester Project Classes
Author:  Karagory, Kevin G. 
Date:  05/10/2022
*/

/*
Module 07 Semester Project: JavaFX
*/

// Class: Transaction
//  Library Transactions
public class Transaction {

	public int book_ID = 0; // Constant book_ID
	public int member_ID = 0; // Constant member_ID
	public String date_check_out = "default_date_check_out"; // Constant Checkout Date
	public String date_due = "default_date_due"; // Constant Due Date
	
	// Construct a default Transaction 
	Transaction(){
		book_ID = 0;
		member_ID = 0; 
		date_check_out = "default_date_check_out";
		date_due = "default_date_due";
	}	
	
	// Construct a Transaction 
	Transaction(int nextBook_ID, int nextMember_ID,
			String nextDate_check_out, String nextDate_due ){ 
		book_ID = nextBook_ID; // construct next book ID
		member_ID = nextMember_ID; // construct next member ID
		date_check_out = nextDate_check_out;
		date_due = nextDate_due;
	}	
	
	//Set the Checkout Date
	void date_check_out(int newBook_ID, int newMember_ID,
			String newDate_check_out) {
		date_check_out = newDate_check_out;
	}

	//Set the Due Date
	void date_due(int newBook_ID, int newMember_ID,
			String newDate_due) {
		date_due = newDate_due;
	}

	// Get the Checkout Date
	String get_date_check_out() {
	return date_check_out;
	}
	
	// Get the Due Date
	String get_date_due() {
	return date_due;
	}
	
	// Method: toString(member_ID) - Output to user Transaction information
	public String toString() {
		System.out.println(book_ID);
		System.out.printf("%d, %d, %s, %s \n",
				book_ID, member_ID, date_check_out, date_due);
		return null;
	}
		
}


