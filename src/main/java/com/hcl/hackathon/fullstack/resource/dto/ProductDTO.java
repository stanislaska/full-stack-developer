package com.hcl.hackathon.fullstack.resource.dto;

import com.fasterxml.jackson.annotation.JsonProperty;
import com.hcl.hackathon.fullstack.resource.Product;
import com.hcl.hackathon.fullstack.resource.entities.EntityResource;
import com.hcl.hackathon.fullstack.resource.entities.ProductEntity;

import javax.validation.constraints.NotEmpty;

/**
 * Qualified product DTO instance
 */
public class ProductDTO extends BaseDTO<String> implements Product<String> {
    private String name;
    private int stock;
    private String description;
    private String sku;
    private String type;

    /**
     * Qualified default product constructor
     */
    public ProductDTO() {
        // - Nop
    }

    /**
     * Full product entity based constructor
     * @param other the given product entity
     */
    public ProductDTO(@NotEmpty ProductEntity other) {
        super(other);
        this.setName(other.getName());
        this.setDescription(other.getDescription());
        this.setSku(other.getSku());
        this.setStock(other.getStock());
        this.setType(other.getType());
    }

    /**
     * Gets the given product name
     * @return a valid given product name or <code>null</code> otherwise
     */
    @JsonProperty("name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public int getStock() {
        return stock;
    }

    @Override
    public void setStock(int stock) {
        this.stock = stock;
    }

    @Override
    public String getDescription() {
        return description;
    }

    @Override
    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String getSku() {
        return sku;
    }

    @Override
    public void setSku(String sku) {
        this.sku = sku;
    }

    @Override
    public String getType() {
        return type;
    }

    @Override
    public void setType(String type) {
        this.type = type;
    }

    @Override
    public <T extends EntityResource> T toEntity() {
        ProductEntity entity = new ProductEntity();
        return (T) entity;
    }

    @Override
    public String toString() {
        return "ProductDTO{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                ", description='" + description + '\'' +
                ", sku='" + sku + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}