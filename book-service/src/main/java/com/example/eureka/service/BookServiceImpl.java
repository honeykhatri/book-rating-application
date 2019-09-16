package com.example.eureka.service;

import java.util.Collection;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.eureka.domain.Book;
import com.example.eureka.repository.BookRepository;

@Service
public class BookServiceImpl implements BookService {
	
	@Autowired
	BookRepository bookRepository;
	
	public void addBook(Book book) {
		bookRepository.save(book);
	}
	
	@Override
	public Collection<Book> getAllBooks() {
		// TODO Auto-generated method stub
		return bookRepository.findAll();
	}

	@Override
	public Optional<Book> findBookById(String id) {
		return bookRepository.findById(id);
		
		// TODO Auto-generated method stub
	}
	

	@Override
	public void deleteBookById(String id) {
		// TODO Auto-generated method stub
		bookRepository.deleteById(id);

	}

	@Override
	public void updateBook(Book book) {
		// TODO Auto-generated method stub
	     bookRepository.save(book);
	}
	
	@Override
	public void deleteAllBooks() {
		bookRepository.deleteAll();
	}


}