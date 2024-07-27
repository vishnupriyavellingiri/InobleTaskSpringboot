package com.example.springbootcrudoperation.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.springbootcrudoperation.model.Books;
import com.example.springbootcrudoperation.service.BookService;
@RestController
public class BooksController {
@Autowired
	BookService bookservice;

@PostMapping("/add")
private Books  getbookbyid(@RequestBody Books book){
	bookservice.add(book);
	return book;
}

@DeleteMapping("/delete/{id}")
private String delete(@PathVariable("id") int id) {
	return bookservice.delete(id);
}

@PutMapping("/update")
private Books update(@RequestBody Books book) {
	return bookservice.update(book);
}

@GetMapping("/get/{id}")
private Books getbookbyid(@PathVariable("id") int id) {
	return bookservice.getbookbyid(id);
}

@GetMapping("/getall")
private List<Books> getall(){
	return bookservice.getall();
}

}
