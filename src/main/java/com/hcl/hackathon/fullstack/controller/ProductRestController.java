package com.hcl.hackathon.fullstack.controller;

import com.hcl.hackathon.fullstack.exceptions.NoResultException;
import com.hcl.hackathon.fullstack.resource.Constants;
import com.hcl.hackathon.fullstack.resource.dto.ProductDTO;
import com.hcl.hackathon.fullstack.service.InMemoryProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping(Constants.PRODUCT_HREF)
@CrossOrigin(origins = "*")
public class ProductRestController {

    @Autowired
    private InMemoryProductService service;

    @GetMapping(value = "", produces = "application/json")
    public List<ProductDTO> all() {
        return service.findAll()
            .stream()
            .map(product -> new ProductDTO(product))
            .collect(Collectors.toList());
    }

    @GetMapping(value = "/{id}", produces = "application/json")
    public ProductDTO findById(@PathVariable String id) {
        return service.findById(id)
            .map((product) -> new ProductDTO(product))
            .orElseThrow(() -> new NoResultException(String.format("No result found with the given id: '%s'", id)));
    }

    @PutMapping(value = "/{id}", produces = "application/json")
    public ProductDTO updateExistingProduct(@RequestBody ProductDTO product, @PathVariable String id) {
        // FIXME: Not yet Implemented !
        return product;
    }

    @PostMapping(value = "", produces = "application/json")
    public ProductDTO createNewProduct(@RequestBody ProductDTO product) {
        throw new IllegalStateException("Create product resource not yet implemented");
    }

    @DeleteMapping(value = "{id}")
    public void deleteExistingProduct(@PathVariable String id) {
        service.delete(id);
    }
}