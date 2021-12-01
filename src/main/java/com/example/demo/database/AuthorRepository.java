package com.example.demo.database;
import org.springframework.data.repository.CrudRepository;

import com.boot.demo.SpringBootCoreJDBCDemo.pojo.Author;




public interface AuthorRepository extends CrudRepository<Author, Integer> {



}


