package com.example.library.util;

import org.springframework.stereotype.Component;

import com.example.library.model.Book;
import com.example.library.service.BookService;

import jakarta.annotation.PostConstruct;

@Component 
public class BookFiller {
    public BookFiller(BookService bookService) {
        this.bookService = bookService;
    }
    private final BookService bookService;     
    @PostConstruct
    public void init(){
        Book book1= new Book("Las ventajas de ser invisible", "Libro acerca de un chico timido", "Steven");
        bookService.addBook(book1);
        try {Thread.sleep(1000);} catch (InterruptedException e) {}
        Book book2= new Book("Eleanor y park", "Literatura juvenil", "Rainbow Rowel");
        bookService.addBook(book2);
        try {Thread.sleep(1000);} catch (InterruptedException e) {}
        Book book3= new Book("Hush Hush", "Novelo de misterio", "Becca Fitzpatrick");
        bookService.addBook(book3);
    }
}