package com.example.eureka.service;

import java.util.Collection;
import java.util.Optional;
import com.example.eureka.domain.Book;

public interface BookService {

	Collection<Book> getAllBooks();

	Optional<Book> findBookById(String id);

	void deleteBookById(String id);

	void updateBook(Book book);

	void deleteAllBooks();

	void addBook(Book book);

	
}
