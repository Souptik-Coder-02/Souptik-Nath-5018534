package org.example.service;


import org.example.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookService {

    private BookRepository bookRepository;

    // Setter method for dependency injection
    @Autowired
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Example method
    public void manageBooks() {
        // Implement the logic to manage books
        System.out.println("Managing books...");
    }
}
