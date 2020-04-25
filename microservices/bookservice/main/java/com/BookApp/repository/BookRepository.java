/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.BookApp.repository;

import com.BookApp.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author stefan.tomasik
 */
@Repository
public interface BookRepository extends JpaRepository<Book, Long> {

}
