package com.lucasbpaixao.library.repository;

import com.lucasbpaixao.library.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;

public interface AuthorRepository extends JpaRepository<Author, Long> {
}
