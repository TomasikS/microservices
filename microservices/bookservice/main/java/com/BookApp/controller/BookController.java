/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BookApp.controller;

import com.BookApp.model.Book;
import com.BookApp.service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author stefan.tomasik
 */
@RestController
public class BookController {

    @Autowired
    BookService service;

    @PostMapping("/books")
    public ResponseEntity< Book> createBook(@RequestBody Book book) {
        return ResponseEntity.ok().body(service.addBook(book));
    }

    @PutMapping("/books/{id}")
    public ResponseEntity< Book> updateBook(@PathVariable long id, @RequestBody Book book) {
        book.setId(id);
        return ResponseEntity.ok().body(service.updateBook(book));
    }

    @DeleteMapping("/books/{id}")
    public HttpStatus deleteBook(@PathVariable long id) {
        this.service.deleteBook(id);
        return HttpStatus.OK;
    }

}
