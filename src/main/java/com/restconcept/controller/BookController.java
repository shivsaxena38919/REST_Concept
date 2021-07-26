package com.restconcept.controller;

import java.awt.print.Book;
import java.util.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.restconcept.DAO.BookService;
import com.restconcept.DAO.DAOclass;
import com.restconcept.DAO.MyJPARepo;
import com.restconcept.modal.Books;
import com.restconcept.modal.BooksDb;


@RestController
public class BookController {
	@Autowired
	private BookService bookservice;
	
	@Autowired
	MyJPARepo myjparepo;
	
	@GetMapping("/books")
	public List<Books> getBooks()
	{
//		
//		Books book1=new Books();
//		book1.setId(123);
//		book1.setName("shivam");
//		book1.setAuthor("XYZ");
//		
		List<Books> book=new ArrayList<Books>();
		book=bookservice.getAllBooks();
		return book;
		
	}
	
	@GetMapping("/books/{id}")
	public Books getBooksById(@PathVariable("id")int id)
	{
//		
//		Books book1=new Books();
//		book1.setId(123);
//		book1.setName("shivam");
//		book1.setAuthor("XYZ");
//		
		Books books= bookservice.getBookById(id);
		
		return books;
	}

	
	
	@GetMapping("/booksdb")
	public List<Books> getBooksdb()
	{
//		
//		Books book1=new Books();
//		book1.setId(123);
//		book1.setName("shivam");
//		book1.setAuthor("XYZ");
//		
		List<Books> book=new ArrayList<Books>();
		book=bookservice.getAllBooks();
		return book;
		
	}
	
	@GetMapping("/booksdb/{id}")
	public Books getBooksdbById(@PathVariable("id")int id)
	{
//		
//		Books book1=new Books();
//		book1.setId(123);
//		book1.setName("shivam");
//		book1.setAuthor("XYZ");
//		
		Books books= bookservice.getBookById(id);
		
		return books;
	}
	
	@PostMapping("/save")
	public BooksDb savevalue(@RequestBody BooksDb b) 
	{
	
		BooksDb b1= myjparepo.save(b);
		
		return b1;
	}
	
	@PutMapping("BooksDb/{id}")
	public void updateBooks(@RequestBody BooksDb bookdb, @PathVariable("id") int id)
	{
		
		bookdb.setAuthor(bookdb.getAuthor());
		bookdb.setName(bookdb.getName());
		myjparepo.save(bookdb);
		
		
	}

}
