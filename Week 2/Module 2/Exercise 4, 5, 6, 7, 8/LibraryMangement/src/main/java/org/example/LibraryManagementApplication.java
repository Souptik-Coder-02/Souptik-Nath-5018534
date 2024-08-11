package org.example;

import org.example.service.BookService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class LibraryManagementApplication {

    public static void main(String[] args) {
        // Load the Spring context from the XML configuration file
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean from the Spring context
        BookService bookService = (BookService) context.getBean(BookService.class);

        // Test the BookService functionality
        bookService.manageBooks();
    }
}
