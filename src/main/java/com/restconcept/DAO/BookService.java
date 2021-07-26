package com.restconcept.DAO;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;

import com.restconcept.modal.Books;

@Component
public class BookService {

	private static List<Books> books=new ArrayList<>();

	static {
		books.add(new Books(101, "java code", "abc"));
		books.add(new Books(102, "python code", "xyz"));
		books.add(new Books(103, "rest code", "iii"));
		
		
	}

	public List<Books> getAllBooks() {

		return books;

	}

	

	public Books getBookById(int id)
	{
		
		Books b=books.stream().filter(e->e.getId()==id).findFirst().get(); //forEach(e->{e.getId();});
		
		return b;
	}
	
	

}
