package com.hx76.service;

import com.hx76.pojo.Books;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface BooksService {
    public int add(Books books);
    public int deleteByID(@Param("bookID") Integer bookID);
    public int update(Books books);
    public Books findByName(@Param("bookName") String bookName);
    public List<Books> findAllBooks();
}
