package com.cg.project.beans;

public class UserBean {
	private String firstName,lastName,fruitName, movieName,bookName;

	public UserBean(String firstName, String lastName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public UserBean(String firstName, String lastName, String fruitName, String movieName, String bookName) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.fruitName = fruitName;
		this.movieName = movieName;
		this.bookName = bookName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getFruitName() {
		return fruitName;
	}

	public void setFruitName(String fruitName) {
		this.fruitName = fruitName;
	}

	public String getMovieName() {
		return movieName;
	}

	public void setMovieName(String movieName) {
		this.movieName = movieName;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}
	
	
}
