package com.nagarro.libraryapi.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nagarro.libraryapi.dao.BookDao;
import com.nagarro.libraryapi.domain.Books;



@Service
public class BookService {

	@Autowired
	private BookDao bookDao;


	public List<Books> getAllBooks() {
		return bookDao.findAll();

	}

	public Optional<Books> getBooks(int id) {
		return bookDao.findById(id);
	}

	public void addBooks(Books books) {
		bookDao.saveAndFlush(books);
	}

	public void updateBooks(int id, Books books) {
		bookDao.saveAndFlush(books);
	}

	public void deleteBooks(int id) {
		bookDao.deleteById(id);

	}

}
