package com.wolken.wolkenapp.DTO;

public class BooksDTO {
	private String type;
	private String edition ;
	private int bookId;
	private  String author ;
	private int price;
	private String bookName;
	private String publisher;
	
	public BooksDTO(String bookName,String author ,int price ,int bookId) {
		System.out.println(this.getClass().getSimpleName()+"object is created ");					
		this.bookName=bookName;
		this.author=author;
		this.price=price;
		this.bookId=bookId;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	public String getEdition() {
		return edition;
	}

	public void setEdition(String edition) {
		this.edition = edition;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getPublisher() {
		return publisher;
	}

	public void setPublisher(String publisher) {
		this.publisher = publisher;
	}
	@Override 
	public String toString() {
		return "BookDTO -BookName:"+bookName+" Author: "+author+" Price:"+price+
				" BookId "+bookId;

		
	}

}
