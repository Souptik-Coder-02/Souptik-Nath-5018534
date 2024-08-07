package com.library;

import com.library.services.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApp {
    public static void main(String[] args) {

        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");


        BookService bookService = (BookService) context.getBean("bookService");

        bookService.manageBooks();
    }
}
