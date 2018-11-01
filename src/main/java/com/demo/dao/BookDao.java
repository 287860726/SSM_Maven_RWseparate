package com.demo.dao;

import java.util.List;

import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.demo.dao.mybatis.IBookMapper;
import com.demo.entity.Book;

@Repository("/bookdao")
public class BookDao {
	
	@Autowired
	private IBookMapper bookMapper;
	
	public List<Book> getAllBook() throws Exception{
		List<Book> books = null;
		books = bookMapper.getAllBook();
		return books;
	}
	
	public boolean addBook(Book book) throws Exception{
		try {
			bookMapper.addBook(book);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	public boolean deleteOneBook(Book book) throws Exception{
		try {
			bookMapper.deleteOneBook(book);
//			throw new Exception("删除数据出错！！！");
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			throw e;
//			return false;
		}
	}
	
	public boolean addMoreBook(@Param("books")List<Book> books) throws Exception{
		try {
			bookMapper.addMoreBook(books);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			return false;
		}
	}
	
	public Book getBook(Book book) throws Exception{
		Book book1 = new Book();
		book1 = bookMapper.getBook(book);
		return book1;
	}
}
