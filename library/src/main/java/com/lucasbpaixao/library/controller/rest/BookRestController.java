package com.lucasbpaixao.library.controller.rest;

import com.lucasbpaixao.library.model.Book;
import com.lucasbpaixao.library.repository.AuthorRepository;
import com.lucasbpaixao.library.repository.BookRepository;
import com.lucasbpaixao.library.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("book")
public class BookRestController {

    @Autowired
    private BookRepository bookRepository;

    @Autowired
    private AuthorRepository authorRepository;

    @Autowired
    private CategoryRepository categoryRepository;

    @PostMapping("create-book")
    public ResponseEntity<Book> createBook(@RequestBody Book book) {
        book.setAuthor(authorRepository.getOne(book.getAuthor().getId()));
        book.setCategory(categoryRepository.getById(book.getCategory().getId()));
        bookRepository.save(book);
        return ResponseEntity.ok(book);
    }

}
