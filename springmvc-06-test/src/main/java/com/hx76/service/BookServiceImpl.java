package com.hx76.service;

import com.hx76.mapper.BooksMapper;
import com.hx76.pojo.Books;
import com.hx76.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class BookServiceImpl implements BooksService {
   
    private BooksMapper booksMapper;

    public int add(Books books) {
        return booksMapper.add(books);
    }

    public int deleteByID(Integer bookID) {
        return booksMapper.deleteByID(bookID);
    }

    public int update(Books books) {
        return booksMapper.update(books);
    }

    public Books findByName(String bookName) {
        return booksMapper.findByName(bookName);
    }

    public List<Books> findAllBooks() {
        return booksMapper.findAllBooks();
    }

    public void setBooksMapper(BooksMapper booksMapper) {
    }
}
