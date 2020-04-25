package com.BookApp.service;

import com.BookApp.model.Book;
import com.BookApp.repository.BookRepository;
import java.util.Optional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author stefan.tomasik
 */
@Service
public class BookServiceImpl implements BookService {

    @Autowired
    private BookRepository Repository;

    @Override
    public Book addBook(Book book) {
        return Repository.save(book);
    }

    @Override
    public Book updateBook(Book book) {
        Optional<Book> updatedBook = Repository.findById(book.getId());
        return updatedBook.get();
    }

    @Override
    public Book getBookById(long id) {
        Optional<Book> book = Repository.findById(id);
        return book.get();

    }

    @Override
    public void deleteBook(long id) {
        Optional<Book> book = Repository.findById(id);
        Repository.delete(book.get());
    }

}
