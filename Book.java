package com.spring.ciobj.list;

import java.util.Iterator;

public class Book {
	
	int bookId;
	String bookName;
	public Book(int bookId, String bookName) {
		super();
		this.bookId = bookId;
		this.bookName = bookName;
	}
	
	
	@Override
	public String toString() {
		return "Book [bookId=" + bookId + ", bookName=" + bookName + "]";
	}


}
