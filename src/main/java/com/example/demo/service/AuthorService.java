package com.example.demo.service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.database.AuthorRepository;
import com.boot.demo.SpringBootCoreJDBCDemo.pojo.Author;

@Service
public class AuthorService {

	@Autowired
	private AuthorRepository authorRepo;

	public boolean insertAuthor(Author author) {
		this.authorRepo.save(author);
		return true;

	}

	public Author getAuthorById(int id) throws Exception {
		return  this.authorRepo.findById(id).orElseThrow(()-> new Exception("Author id doesn't exit"));
	}

	public boolean deleteById(int id) {
		this.authorRepo.deleteById(id);
		System.out.println("Deleted");
		return true;
	}
}


