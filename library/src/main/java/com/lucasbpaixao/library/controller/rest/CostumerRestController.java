package com.lucasbpaixao.library.controller.rest;

import com.lucasbpaixao.library.model.Costumer;
import com.lucasbpaixao.library.repository.CostumerRespository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.bind.annotation.*;

import java.time.LocalDateTime;
import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("costumer")
public class CostumerRestController {

    @Autowired
    private CostumerRespository costumerRespository;

    @PostMapping("create-costumer")
    public ResponseEntity<Costumer> createCostumer(@RequestBody final Costumer costumer) {
        costumer.setCreatedAt(LocalDateTime.now());
        costumerRespository.save(costumer);
        return new ResponseEntity<>(costumer, HttpStatus.CREATED);
    }

    @GetMapping("get-costumers")
    public ResponseEntity<List<Costumer>> getCostumers() {
        return new ResponseEntity<>(costumerRespository.findAll(), HttpStatus.OK);
    }

    @GetMapping("get-costumer/{id}")
    public ResponseEntity<Costumer> getCostumer(@PathVariable final Long id) {
        Optional<Costumer> costumerOptional = costumerRespository.findById(id);

        return costumerOptional.map(costumer -> new ResponseEntity<>(costumer, HttpStatus.OK)).orElseGet(() -> new ResponseEntity<>(HttpStatus.NOT_FOUND));
    }

    @DeleteMapping("delete-costumer/{id}")
    public ResponseEntity<Costumer> deleteCostumer(@PathVariable final Long id) {
        Optional<Costumer> costumerOptional = costumerRespository.findById(id);
        if (costumerOptional.isPresent()) {
            costumerRespository.delete(costumerOptional.get());
            return new ResponseEntity<>(costumerOptional.get(), HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

    @PutMapping("update-costumer")
    @Transactional
    public ResponseEntity<Costumer> updateCostumer(@RequestBody final Costumer newCostumer) {
        Optional<Costumer> costumerOptional = costumerRespository.findById(newCostumer.getId());

        if(costumerOptional.isPresent()) {
            Costumer costumer = costumerOptional.get();
            costumer.update(newCostumer);

            costumerRespository.saveAndFlush(costumer);

            return new ResponseEntity<>(costumer, HttpStatus.OK);
        }
        return new ResponseEntity<>(HttpStatus.NOT_FOUND);
    }

}
