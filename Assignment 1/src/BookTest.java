//18. Create a class called Book to represent a book. A Book should include four pieces of information
//as instance variables‐a book name, an ISBN number, an author name and a publisher. Your class
//should have a constructor that initializes the four instance variables. Provide a mutator method
//and accessor method (query method) for each instance variable. Inaddition, provide a method
//named getBookInfo that returns the description of the book as a String (the description should
//include all the information about the book). You should use this keyword in member methods
//and constructor. Write a test application named BookTest to create an array of object for 30
//elements for class Book to demonstrate the class Book's capabilities

import java.util.*;
class Book 
{
	 private String Name;
	 private String ISBN;
	 private String Author;
	 private String Publisher;
	 public Book() 
	 {
		 Name = "NULL";
		 ISBN = "NULL";
		 Author = "NULL";
		 Publisher = "NULL";
	 }
	 public Book(String name, String isbn, String author, String publisher) 
	 {
		 Name = name;
		 ISBN = isbn;
		 Author = author;
		 Publisher = publisher;
	 }
	 public void setName(String Name) 
	 {
		 this.Name = Name;
	 }
	 public String getName() 
	 {
		 return Name;
	 }
	 public void setISBN(String ISBN) 
	 {
		 this.ISBN = ISBN;
	 }
	 public String getISBN() 
	 {
		 return ISBN;
	 }
	 public void setAuthor(String Author) 
	 {
		 this.Author = Author;
	 }
	 public String getAuthor() 
	 {
		 return Author;
	 }
	 public void setPublisher(String Publisher) 
	 {
		 this.Publisher = Publisher;
	 }
	 public String getPublisher() 
	 {
		 return Publisher;
	 }
	 public void getBookInfo() 
	 {
		 System.out.printf("%s %s %s %s", Name,ISBN,Author,Publisher);
	 }

}
public class BookTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Book test[] = new Book[13];
		test[1] = new Book("Palak Mishra", "ISBN0001", "Chetan Bhagat", "Pearson");
		test[1].getBookInfo();
	}

}
