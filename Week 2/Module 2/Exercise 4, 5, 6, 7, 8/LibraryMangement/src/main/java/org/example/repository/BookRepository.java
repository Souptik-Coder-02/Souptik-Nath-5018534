package org.example.repository;

import org.springframework.stereotype.Repository;

import java.util.Arrays;
import java.util.List;

@Repository
public class BookRepository {

    // This method simulates fetching a list of books from a data source
    public List<String> getBooks() {
        // Dummy data for demonstration purposes
        return Arrays.asList("Book 1", "Book 2", "Book 3");
    }
}

