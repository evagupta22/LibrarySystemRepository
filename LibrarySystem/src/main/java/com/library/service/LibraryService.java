package com.library.service;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.library.dao.LibraryRepository;
import com.library.modelpkg.Book;

@Service
public class LibraryService {
	@Autowired
	private LibraryRepository libRepository;
	
	public Collection<Book> findAllBooks(){
		List<Book> books= new ArrayList<Book>();
		for(Book book:libRepository.findAll()) {
			books.add(book);
		}
		return books;
	}
	public void delete(long id) {
		libRepository.deleteById(id);
	}
	public Optional<Book> getBook(long id) {
		return libRepository.findById(id);
	}
	public void addBook(Book book) {
		libRepository.save(book);
	}
	public void updateBook(Book book) {
		libRepository.save(book);
	}
}
