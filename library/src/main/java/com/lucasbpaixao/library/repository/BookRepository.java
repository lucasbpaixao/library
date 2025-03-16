package com.lucasbpaixao.library.repository;

import com.lucasbpaixao.library.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
