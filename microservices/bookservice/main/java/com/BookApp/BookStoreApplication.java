package com.BookApp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = {
     "com.BookApp.repository", "com.BookApp.model", "com.BookApp.controller", "com.BookApp.service"})
public class BookStoreApplication {

    public static void main(String[] args) {

        SpringApplication.run(BookStoreApplication.class, args);

    }

}
