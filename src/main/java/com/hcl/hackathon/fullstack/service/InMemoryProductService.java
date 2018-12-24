package com.hcl.hackathon.fullstack.service;

import com.hcl.hackathon.fullstack.resource.Constants;
import com.hcl.hackathon.fullstack.resource.entities.ProductEntity;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.io.Serializable;
import java.util.*;
import java.util.stream.Collectors;

@Service
public class InMemoryProductService implements NoRepositoryService<ProductEntity> {
    private static final Logger LOGGER = LoggerFactory.getLogger(InMemoryProductService.class);
    private static final Map<Serializable, ProductEntity> INMEMORY_PRODUCTS;

    // class fake static data initialization
    static {
        INMEMORY_PRODUCTS = new HashMap<>();
        LOGGER.debug("Generating ({}) Inmemory product data entry", Constants.DEFAULT_SIZE);

        for (int i = 0; i < Constants.DEFAULT_SIZE; i++) {
            String oid = UUID.randomUUID().toString();
            ProductEntity product = new ProductEntity();

            product.setId(oid);
            product.setName(String.format("Generic name-%s", i));
            product.setActive(true);
            product.setDescription(String.format("Generic product description -- %s", i));
            product.setSku(String.format("sku-%s-%s", i, System.currentTimeMillis()));
            product.setType("Phone");
            product.setStock(10);

            LOGGER.debug("Mapping product with id: {}", oid);
            INMEMORY_PRODUCTS.put(oid, product);
        }
        LOGGER.debug("Done!");
    }

    /**
     * {@inheritDoc}
     * @return
     */
    @Override
    public List<ProductEntity> findAll() {
        return INMEMORY_PRODUCTS.values().stream()
            .filter((product) -> product.isActive())
            .collect(Collectors.toList());
    }

    /**
     * {@inheritDoc}
     * @param id the given existing resource identifier
     * @return
     */
    @Override
    public Optional<ProductEntity> findById(Serializable id) {
        return Optional.of(INMEMORY_PRODUCTS.get(id));
    }

    @Override
    public void delete(Serializable id) {
        INMEMORY_PRODUCTS.remove(id);
    }

    @Override
    public Optional<ProductEntity> update(Serializable id, ProductEntity entity) {
        INMEMORY_PRODUCTS.put(id, entity);
        return this.findById(id);
    }
}