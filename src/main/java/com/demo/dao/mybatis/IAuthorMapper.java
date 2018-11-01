package com.demo.dao.mybatis;

import java.util.List;

import com.demo.entity.Author;

public interface IAuthorMapper {

	public List<Author> getAllUser() throws Exception;
	
	public Author getAuthorById(Integer authorid) throws Exception;
	
	public boolean deleteAuthor(Author author) throws Exception;
}
