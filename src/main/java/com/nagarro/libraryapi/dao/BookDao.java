package com.nagarro.libraryapi.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.nagarro.libraryapi.domain.Books;



public interface BookDao extends JpaRepository<Books, Integer> {

}
