package com.spring.ciobj.list;

import java.util.Iterator;
import java.util.List;

public class Library {

	int libId;
	String libName;
	List<Book> book;
	public Library(int libId, String libName, List<Book> book) {
		super();
		this.libId = libId;
		this.libName = libName;
		this.book = book;
	}
	
	@Override
	public String toString() {
		return "Library [libId=" + libId + ", libName=" + libName  + "]";
	}
	
	public void displayBook()
	{
		Iterator it=book.iterator();
		while(it.hasNext())
		{
			System.out.println(it.next());
		}
			
	}
}
