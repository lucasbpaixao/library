package com.lucasbpaixao.library.controller.rest;

import com.lucasbpaixao.library.model.Author;
import com.lucasbpaixao.library.repository.AuthorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("author")
public class AuthorRestController {
    @Autowired
    private AuthorRepository authorRepository;

    @PostMapping("create-author")
    public ResponseEntity<Author> createAuthor(@RequestBody final Author author) {
        authorRepository.saveAndFlush(author);
        return new ResponseEntity<>(author, HttpStatus.CREATED);
    }

    @GetMapping("get-authors")
    public ResponseEntity<List<Author>> getAuthors() {
        return new ResponseEntity<>(authorRepository.findAll(), HttpStatus.OK);
    }

    @PutMapping("update-author")
    @Transactional
    public ResponseEntity<Author> updateAuthor(@RequestBody Author authorForm) {
        Optional<Author> authorOptional = authorRepository.findById(authorForm.getId());

        if(authorOptional.isPresent()) {
            Author author = authorOptional.get();
            author.update(authorForm);
            authorRepository.saveAndFlush(author);
            return new ResponseEntity<>(author, HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @GetMapping("get-author/{id}")
    public ResponseEntity<Author> getAuthorById(@PathVariable final Long id) {
        Optional<Author> authorOptional = authorRepository.findById(id);
        return authorOptional.map(author -> new ResponseEntity<>(author, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("delete-author/{id}")
    public ResponseEntity<Author> deleteAuthor(@PathVariable("id") final Long id) {
        Optional<Author> authorOptional = authorRepository.findById(id);

        if(authorOptional.isPresent()) {
            authorRepository.deleteById(id);
            return new ResponseEntity<>(authorOptional.get(), HttpStatus.OK);
        }

        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }
}