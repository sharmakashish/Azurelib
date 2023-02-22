package com.nagarro.libraryapi.domain;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

@Entity
public class Books {

	@Id
	private int id;
	private String bookName;

	@ManyToOne
	private Authors authors;

	private String date;

	public Books() {
		super();
	}

	public Books(int id, String bookName, Authors authors, String date) {
		this.id = id;
		this.bookName = bookName;
		this.authors = authors;
		this.date = date;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Authors getAuthors() {
		return authors;
	}

	public void setAuthors(Authors authors) {
		this.authors = authors;
	}

	public String getBookName() {
		return bookName;
	}

	public void setBookName(String bookName) {
		this.bookName = bookName;
	}

	public String getDate() {
		return date;
	}

	public void setDate(String date) {
		this.date = date;
	}

}
