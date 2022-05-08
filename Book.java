/*
Program name:  SDEV 200 - M07 Semester Project Classes
Author:  Karagory, Kevin G. 
Date:  05/10/2022
*/

/*
Module 07 Semester Project: JavaFX
*/

	
// Class: Book
//  Library Books
public class Book {
	
	public int book_ID = 0; // Constant book_ID
	public String title = "default_title"; // Constant title
	public int pub_year = 1900; // Constant publication_year
	public String location = "default_location"; // Default location
	
	// Construct a default Book 
	Book(){
		book_ID = 0; 
		title = "default_title";
		pub_year = 1900;
		location = "default_location";
	}	
	
	// Construct a Book 
	Book(int nextBook_ID, String title1, 
			int year1, String location1 ){ 
		book_ID = nextBook_ID; // construct next book ID
		title = title1;
		pub_year = year1;
		location = location1;
	}	
	
	//Set the Book ID
	void set_book_ID(int newBookID) {
		book_ID = newBookID;
	}
	
	// Set the Title
	void set_title(int book_ID, String newTitle) {
		title = newTitle;
	}
	
	// Set the Publication Year
	void set_pub_year(int book_ID, int newPubYear) {
		pub_year = newPubYear;
	}
	
	// Set the Location
	void set_location(int book_ID, String newLocation) {
		location = newLocation;
	}
	
	// Get the Book ID
	int get_book_id() {
	return book_ID;
	}
	
	// Get the Title
	String get_title() {
	return title;
	}
	
	// Get the Publication Year
	int get_pub_year() {
	return pub_year;
	}

	// Get the Location
	String get_location() {
	return location;
	}
	
	// Method: toString(book_ID) - Output to user Book ID information
	public String toString() {
		System.out.printf("%d, %s, %d, %s \n",
				book_ID, title, pub_year, location);
		return null;
	} 
}




/*
Listing 9.1 TestCircle.java
1  public class TestCircle {
2    // Main method 
3    public static void main(String[] args) {
4      // Create a circle with radius 1 
5      Circle circle1 = new Circle();
6      System.out.println("The area of the circle of radius " 
7        + circle1.radius + " is " + circle1.getArea());
8
9      // Create a circle with radius 25 
10      Circle circle2 = new Circle(25);
11      System.out.println("The area of the circle of radius " 
12        + circle2.radius + " is " + circle2.getArea());
13
14      // Create a circle with radius 125 
15      Circle circle3 = new Circle(125);
16      System.out.println("The area of the circle of radius " 
17        + circle3.radius + " is " + circle3.getArea());
18
19      // Modify circle radius 
20      circle2.radius = 100; // or circle2.setRadius(100)
21      System.out.println("The area of the circle of radius " 
22        + circle2.radius + " is " + circle2.getArea());
23    }
24  }
25
26  // Define the circle class with two constructors 
27  class Circle {
28    double radius;
29
30    // Construct a circle with radius 1 
31    Circle() {
32      radius = 1;
33    }
34
35    // Construct a circle with a specified radius 
36    Circle(double newRadius) {
37      radius = newRadius;
38    }
39
40    // Return the area of this circle 
41    double getArea() {
42      return radius * radius * Math.PI;
43    }
44
45    // Return the perimeter of this circle 
46    double getPerimeter() {
47      return 2 * radius * Math.PI;
48    }
49
50    // Set a new radius for this circle 
51    void setRadius(double newRadius) {
52      radius = newRadius;
53    }
54  }
*/


