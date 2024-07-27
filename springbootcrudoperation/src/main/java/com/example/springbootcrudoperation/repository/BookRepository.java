package com.example.springbootcrudoperation.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.springbootcrudoperation.model.Books;

public interface BookRepository extends JpaRepository<Books,Integer> {

}
