package com.nagarro.libraryapi.dao;

import org.springframework.data.repository.CrudRepository;

import com.nagarro.libraryapi.domain.Authors;



public interface AuthorsDao extends CrudRepository<Authors, Integer> {

}

