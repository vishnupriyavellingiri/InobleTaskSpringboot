package com.example.springbootcrudoperation.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.springbootcrudoperation.model.Books;
import com.example.springbootcrudoperation.repository.BookRepository;
@Service
public class BookService {
@Autowired
	private BookRepository bookrepository;

public Books  add(Books book) {
	bookrepository.save(book);
	return   book;
}

public String delete(int id) {
	bookrepository.deleteById(id);
	return id+" deleted sucessfully";
}

public Books update(Books book) {
	Books bookdetail = bookrepository.findById(book.getBookid()).get();
	bookdetail.setAuthor(book.getAuthor());
	bookdetail.setBookname(book.getBookname());
	bookdetail.setPrice(book.getPrice());
	bookdetail.setBookid(book.getBookid());
	return bookrepository.save(bookdetail);
}

public Books getbookbyid(int id) {
	Books bookdetail = bookrepository.findById(id).get();
	return bookdetail;
}

public List<Books> getall(){
	List<Books> book = new ArrayList<Books>();
	bookrepository.findAll().forEach(books->book.add(books));
	return book;
}

}
