package com.demo.biz;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.demo.dao.AuthorDao;
import com.demo.dao.BookDao;
import com.demo.entity.Author;
import com.demo.entity.Book;

@Service("/bookbiz")
@Transactional
public class BookBiz {

	@Autowired
	private BookDao bookdao;
	
	@Autowired
	private AuthorDao authordao;

	public List<Book> getAllBook() throws Exception {
		List<Book> books = null;
		books = bookdao.getAllBook();
		return books;
	}
	
	public boolean addBook(Book book) throws Exception {
		try {
			bookdao.addBook(book);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean deleteOneBook(Book book) throws Exception {
		try {
			bookdao.deleteOneBook(book);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public boolean addMoreBook(List<Book> books) throws Exception {
		try {
			bookdao.addMoreBook(books);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			return false;
		}
	}
	
	public Book getBook(Book book) throws Exception {
		return bookdao.getBook(book);
	}
	
	/**
	 * 模仿事物
	 * 删除书籍同时删除作者，如果成功删除书籍的同时删除书籍作者，其中任何过程失败，执行回滚。
	 */
	@Transactional(rollbackFor = Throwable.class)
	public boolean deleteBookAndAuthor(Book book) throws Exception {
		Book book1 = new Book();
		book1 = bookdao.getBook(book);
		Author author = new Author();
		author.setId(book1.getAuthorid());
		try {
			authordao.deleteAuthor(author);
			bookdao.deleteOneBook(book);
			return true;
		} catch (Exception e) {
			// TODO: handle exception
			throw e;
		}
	}
}
