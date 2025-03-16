package com.lucasbpaixao.library.repository;

import com.lucasbpaixao.library.model.Costumer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CostumerRespository extends JpaRepository<Costumer, Long> {
}
