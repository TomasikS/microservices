/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BookApp.service;

import com.BookApp.model.Book;

/**
 *
 * @author stefan.tomasik
 */
public interface BookService {

    public Book addBook(Book book);

    Book updateBook(Book book);

    Book getBookById(long id);

    void deleteBook(long id);
}
