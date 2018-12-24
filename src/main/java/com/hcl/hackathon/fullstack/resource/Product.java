package com.hcl.hackathon.fullstack.resource;

import java.io.Serializable;

/**
 * Business given product model definition
 * @param <T> the given product unique identifier generic type
 */
public interface Product<T extends Serializable> extends Resource<T> {

    /**
     * Get the product given name
     * @return a valid product given name
     */
    String getName();

    /**
     * Set the current product name.
     * @param name the current product expecting name
     */
    void setName(String name);

    /**
     * Gets the product current stock limit
     * @return a stock valid limit or <code>0</code> otherwise
     */
    int getStock();

    /**
     * Set the product current stock limit
     * @param stock the product current stock limit.
     */
    void setStock(int stock);

    /**
     * Get the product given description
     * @return a valid product given description
     */
    String getDescription();

    /**
     * Set the current product description.
     * @param description the current product expecting description
     */
    void setDescription(String description);

    /**
     * Get the product given sku
     * @return a valid product given sku
     */
    String getSku();

    /**
     * Set the current product sku.
     * @param sku the current product expecting sku
     */
    void setSku(String sku);

    /**
     * Get the product given type
     * @return a valid product given type
     */
    String getType();

    /**
     * Set the current product type.
     * @param type the current product expecting type
     */
    void setType(String type);
}