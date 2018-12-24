package com.hcl.hackathon.fullstack.resource.entities;

import com.hcl.hackathon.fullstack.resource.Constants;
import com.hcl.hackathon.fullstack.resource.Product;
import com.hcl.hackathon.fullstack.resource.dto.BaseDTO;
import com.hcl.hackathon.fullstack.resource.dto.ProductDTO;

import javax.validation.constraints.NotEmpty;

/**
 * Full qualified product persistable implementation
 */
public class ProductEntity extends EntityResource<String> implements Product<String> {
    @NotEmpty
    private String name;
    private int stock;
    private String description;
    private String sku;
    private String type;

    public ProductEntity() {
        super(Constants.API_BASE);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public final String getObjectType() {
        return Constants.PRODUCT_OBJECT_NS_ID;
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
    public <T extends BaseDTO> T toDto() {
        return (T) new ProductDTO(this);
    }

    @Override
    public String toString() {
        return "ProductEntity{" +
                "name='" + name + '\'' +
                ", stock=" + stock +
                ", description='" + description + '\'' +
                ", sku='" + sku + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}