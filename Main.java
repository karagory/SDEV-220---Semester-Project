/*
Program name:  SDEV 200 - M07 Semester Project Classes
Author:  Karagory, Kevin G. 
Date:  05/10/2022
*/

/*
Module 07 Semester Project: JavaFX

The previous assignment for the semester project required
 that you submit a document that included class diagram
 document that used UML notation. By now (if not sooner),
 you should have a good idea of what classes you will
 need to include in your Java Application. You may,
 in fact, had identified additional classes you need
 to implement. For this assignment, you are to write
 your classes that are required for your Java
 application (minimum of three).

Additionally, you will need to write test classes in order
 to test out the classes that can be used to test the
 functionality of your classes. These test classes should
 be maintained. For example, if you add a new method to
 one of your classes in a later part of the development
 of this Java application, you should account for this in your
 test classes. This will help verify that your classes
 still work!
*/


import java.io.File;
import java.util.Scanner;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.geometry.HPos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.stage.Stage;

public class Main extends Application {
	
	//Test Fields
	private TextField tfBook_ID = new TextField();
	private TextField tfBook_title = new TextField();
	private TextField tfBook_pub_year = new TextField();
	private TextField tfBook_location = new TextField();
	private TextField tfMember_ID = new TextField();
	private TextField tfName_first = new TextField();
	private TextField tfName_last = new TextField();
	//private TextField tfTransaction_ID = new TextField();
	private TextField tfDate_check_out = new TextField();
	private TextField tfDate_due = new TextField();
	private TextField tfOutput = new TextField();
	
	// Buttons
	private Button btClear = new Button("CLEAR ALL TEXT FIELDS");
	private Button btNew_book = new Button ("New Book");
	private Button btSet_book_title = new Button ("Set Book Title");
	private Button btSet_book_pub_year = new Button ("Set Book Pub Year");
	private Button btSet_book_location = new Button ("Set Book Locaton");
	private Button btGet_book_title = new Button ("Get Book Title");
	private Button btGet_book_pub_year = new Button ("Get Book Pub Year");
	private Button btGet_book_location = new Button ("Get Book Locaton");
	private Button btNew_member = new Button ("New Member");
	private Button btSet_name_first = new Button ("Set Name First");
	private Button btSet_name_last = new Button ("Set Name Last");
	private Button btGet_name_first = new Button ("Get Name First");
	private Button btGet_name_last = new Button ("Get Name Last");
	private Button btNew_transaction = new Button ("New Transaction");
	private Button btSet_date_check_out = new Button ("Set Date Check Out");
	private Button btSet_date_due = new Button ("Set Date Due");
	private Button btGet_date_check_out = new Button ("Get Date Check Out");
	private Button btGet_date_due = new Button ("Get Date Due");
	

@Override // Override the start method in the Application class
public void start(Stage primaryStage) {
	
	// Create UI
	GridPane gridPane = new GridPane();
	gridPane.setHgap(5);
	gridPane.setVgap(5);
	gridPane.add(new Label("Book ID:"), 0, 0);
	gridPane.add(tfBook_ID, 1, 0);
	gridPane.add(new Label("Title:"), 0, 1);
	gridPane.add(tfBook_title, 1, 1);
	gridPane.add(new Label("Publication Year:"), 0, 2);
	gridPane.add(tfBook_pub_year, 1, 2);
	gridPane.add(new Label("Location:"), 0, 3);
	gridPane.add(tfBook_location, 1, 3);
	gridPane.add(new Label("Member ID:"), 2, 0);
	gridPane.add(tfMember_ID, 3, 0);
	gridPane.add(new Label("First Name:"), 2, 1);
	gridPane.add(tfName_first, 3, 1);
	gridPane.add(new Label("Last Name:"), 2, 2);
	gridPane.add(tfName_last, 3, 2);
	//gridPane.add(new Label("Transaction ID:"), 4, 0);
	//gridPane.add(tfTransaction_ID, 5, 0);
	gridPane.add(new Label("Check Out Date:"), 4, 1);
	gridPane.add(tfDate_check_out, 5, 1);
	gridPane.add(new Label("Date Due:"), 4, 2);
	gridPane.add(tfDate_due, 5, 2);
	gridPane.add(btClear, 0, 4);
	gridPane.add(tfOutput, 3, 12);
	gridPane.add(btNew_book, 0, 5);
	//gridPane.add(btSet_book_title, 0, 6);
	//gridPane.add(btSet_book_pub_year, 0, 7);
	//gridPane.add(btSet_book_location, 0, 8);
	//gridPane.add(btGet_book_title, 0, 9);
	//gridPane.add(btGet_book_pub_year, 0, 10);
	//gridPane.add(btGet_book_location, 0, 11);
	gridPane.add(btNew_member, 2, 5);
	//gridPane.add(btSet_name_first, 2, 6);
	//gridPane.add(btSet_name_last, 2, 7);
	//gridPane.add(btGet_name_first, 2, 8);
	//gridPane.add(btGet_name_last, 2, 9);
	gridPane.add(btNew_transaction, 4, 5);
	//gridPane.add(btSet_date_check_out, 4, 6);
	gridPane.add(btSet_date_due, 4, 7);
	//gridPane.add(btGet_date_check_out, 4, 8);
	//gridPane.add(btGet_date_due, 4, 9);
	
	// Set properties for UI
	gridPane.setAlignment(Pos.CENTER);
	tfBook_ID.setAlignment(Pos.BOTTOM_RIGHT);
	tfBook_title.setAlignment(Pos.BOTTOM_RIGHT);
	tfBook_pub_year.setAlignment(Pos.BOTTOM_RIGHT);
	tfBook_location.setAlignment(Pos.BOTTOM_RIGHT);
	tfMember_ID.setAlignment(Pos.BOTTOM_RIGHT);
	tfName_first.setAlignment(Pos.BOTTOM_RIGHT);
	tfName_last.setAlignment(Pos.BOTTOM_RIGHT);
	//tfTransaction_ID.setAlignment(Pos.BOTTOM_RIGHT);
	tfDate_check_out.setAlignment(Pos.BOTTOM_RIGHT);
	tfDate_due.setAlignment(Pos.BOTTOM_RIGHT);
	tfOutput.setAlignment(Pos.BOTTOM_LEFT);
	GridPane.setHalignment(btClear, HPos.RIGHT);
	
	// Set some initial values for ease in testing
	tfBook_ID.setText(null);
	tfBook_title.setText("TestTitle");
	tfBook_pub_year.setText("2022");
	tfBook_location.setText("TestLocation");
	tfMember_ID.setText(null);
	tfName_first.setText("TestNameFirst");
	tfName_last.setText("TestNameLast");
	//tfTransaction_ID.setText(null);
	tfDate_check_out.setText("05/10/2022");
	tfDate_due.setText(null);
	tfOutput.setText(null);

	// Process clear all text fields
	btClear.setOnAction(e -> {
		try {
			tfBook_ID.setText(null);
			tfBook_title.setText(null);
			tfBook_pub_year.setText(null);
			tfBook_location.setText(null);
			tfMember_ID.setText(null);
			tfName_first.setText(null);
			tfName_last.setText(null);
			//tfTransaction_ID.setText(null);
			tfDate_check_out.setText(null);
			tfDate_due.setText(null);
			tfOutput.setText(null);
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});

	// Process new Book
	btNew_book.setOnAction(e -> {
		try {
			new_book();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});
	
	// Process new Member
	btNew_member.setOnAction(e -> {
		try {
			new_member();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});
	
	// Process new Transaction
	btNew_transaction.setOnAction(e -> {
		try {
			new_transaction();
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
	});

	
	// Create a scene and place it in the stage
	Scene scene = new Scene(gridPane, 850, 500);
	primaryStage.setTitle("M07 Semester Project - JavaFX"); // Set title
	primaryStage.setScene(scene); // Place the scene in the stage
	primaryStage.show(); // Display the stage
}


// Construct new Book
private void new_book() throws Exception {
	
	int book_pub_year = 1900; // Initialize
	// Get values from text fields
	String book_title = tfBook_title.getText();
	if (tfBook_pub_year.getText() == null){
		book_pub_year = 1900; // If no entry  make year 1900
	}
	else {
		// If not null, read year
		book_pub_year = Integer.parseInt(tfBook_pub_year.getText());
	}
	String book_location = tfBook_location.getText();
	
	// Create new book and place in database
	int book_ID = new_book_db(book_title, book_pub_year, book_location);
	Book book1 = new Book(book_ID, 
			book_title, book_pub_year, book_location);
	
	// Output results to console
	System.out.println("New Book Addition to Database:");
	book1.toString();
	System.out.println();
	
	// New Book ID output to user
	tfBook_ID.setText(String.format("%s", book_ID));
	tfOutput.setText(String.format("Book %s Constructed", book_ID));
	}


//Construct new Member
private void new_member() throws Exception {
	
	// Get values from text fields
	String name_first = tfName_first.getText();
	String name_last = tfName_last.getText();
	
	// Create new book and place in database
	int member_ID = new_member_db(name_first, name_last);
	Member member1 = new Member(member_ID, 
			name_first, name_last);
	
	// Output results to console
	System.out.println("New Member Addition to Database:");
	member1.toString();
	System.out.println();
	
	// New Book ID output to user
	tfMember_ID.setText(String.format("%s", member_ID));
	tfOutput.setText(String.format("Member %s Constructed", member_ID));
	}


//Construct new Transaction
private void new_transaction() throws Exception {
	
	// Get values from text fields
	int book_id = Integer.parseInt(tfBook_ID.getText());
	int member_id = Integer.parseInt(tfMember_ID.getText());
	String date_check_out = tfDate_check_out.getText();

	// Create new book and place in database
	String date_due = new_transaction_db(book_id, member_id, date_check_out);
	Transaction transaction1 = new Transaction(book_id, 
			member_id, date_check_out, date_due);
	
	// Output results to console
	System.out.println("New Transaction Addition to Database:");
	transaction1.toString();
	System.out.println();
	
	// New Transaction output to user
	tfDate_due.setText(String.format("%s", date_due));
	tfOutput.setText(String.format("Due Date %s", date_due));
	}


	// Method used to get unique Book ID numbers
	// Get last Book ID number and increment Book ID number by 1
	public static int Next_book_id() throws Exception {
	
		// Get last Book ID
		File file = new File("book_ID.txt");
		Scanner input = new Scanner(file);
		Integer last_book_ID = Integer.valueOf(input.nextLine());
		last_book_ID += 1;
		input.close();
		//Increment last Book ID number by 1
		java.io.PrintWriter output = new java.io.PrintWriter("book_ID.txt");
		output.print(last_book_ID);
		output.close();
		
		//System.out.println(last_book_ID);
		return last_book_ID;		
	}
	
	
	// Method used to get unique Member ID numbers
	// Get last Member ID number and increment Member ID number by 1
	public static int Next_member_id() throws Exception {
	
		// Get last Member ID
		File file = new File("member_ID.txt");
		Scanner input = new Scanner(file);
		Integer last_member_ID = Integer.valueOf(input.nextLine());
		last_member_ID += 1;
		input.close();
		// Increment last Member ID number by 1
		java.io.PrintWriter output = new java.io.PrintWriter("member_ID.txt");
		output.print(last_member_ID);
		output.close();
		
		//System.out.println(last_member_ID);
		return last_member_ID;
	}
	
	// Method to create new book in database with new ID
	public static int new_book_db(String title, int pub_year, String location) 
			throws Exception {
		
		// Get last Book ID
		File file = new File("book_ID.txt");
		Scanner input = new Scanner(file);
		Integer last_book_ID = Integer.valueOf(input.nextLine());
		last_book_ID += 1;
		input.close();
		//Increment last Book ID number by 1
		java.io.PrintWriter output = new java.io.PrintWriter("book_ID.txt");
		output.print(last_book_ID);
		output.close();
		
		//Store new book in database
		java.io.FileWriter output2 = new java.io.FileWriter("book_DB.txt", true);
				java.io.PrintWriter printWriter = new java.io.PrintWriter(output2); {
				  printWriter.printf("%d, %s, %d, %s \n", 
						  last_book_ID, title, pub_year, location);
				}
		output2.close();
		
		return last_book_ID;		
	}
	
	// Method to create new member in database with new ID
	public static int new_member_db(String name_first, String name_last) 
			throws Exception {
		
		// Get last Member ID
		File file = new File("member_ID.txt");
		Scanner input = new Scanner(file);
		Integer last_member_ID = Integer.valueOf(input.nextLine());
		last_member_ID += 1;
		input.close();
		//Increment last Member ID number by 1
		java.io.PrintWriter output = new java.io.PrintWriter("member_ID.txt");
		output.print(last_member_ID);
		output.close();
		
		//Store new book in database
		java.io.FileWriter output2 = new java.io.FileWriter("member_DB.txt", true);
				java.io.PrintWriter printWriter = new java.io.PrintWriter(output2); {
				  printWriter.printf("%d, %s, %s \n", 
						  last_member_ID, name_first, name_last);
				}
		output2.close();
		
		return last_member_ID;		
	}
	
	// Method to create transaction in database
	public static String new_transaction_db(int book_ID, int member_ID,
			String date_check_out) 
			throws Exception {
		
		//Determine date due
		
		String date_due = "2 weeks ";
		
		//Store new book in database
		java.io.FileWriter output = new java.io.FileWriter("transaction_DB.txt", true);
				java.io.PrintWriter printWriter = new java.io.PrintWriter(output); {
				  printWriter.printf("%d, %d, %s, %s\n", 
						  book_ID, member_ID, date_check_out, date_due);
				}
		output.close();
		
		return date_due;		
	}

}
