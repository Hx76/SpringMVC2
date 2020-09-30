package com.hx76.controller;

import com.hx76.pojo.Books;
import com.hx76.service.BooksService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Controller
@RequestMapping("/book")
public class ControllerTest {
    @Autowired
    @Qualifier("BookServiceImpl")
    private BooksService booksService;

    @RequestMapping("/allBook")
    public String list(Model model){
        List<Books> allBooks = booksService.findAllBooks();
        model.addAttribute("list",allBooks);
        return "allBook";
    }

}
