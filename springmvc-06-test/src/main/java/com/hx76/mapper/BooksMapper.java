package com.hx76.mapper;

import com.hx76.pojo.Books;

import java.util.List;

public interface BooksMapper {
    public int add(Books books);
    public int deleteByID(Integer bookID);
    public int update(Books books);
    public Books findByName(String bookName);
    public List<Books> findAllBooks();
}
