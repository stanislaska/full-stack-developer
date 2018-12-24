package com.hcl.hackathon.fullstack.resource.dto;

import com.fasterxml.jackson.annotation.JsonAutoDetect;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.hcl.hackathon.fullstack.resource.AbstractResource;
import com.hcl.hackathon.fullstack.resource.Resource;
import com.hcl.hackathon.fullstack.resource.Version;
import com.hcl.hackathon.fullstack.resource.entities.EntityResource;
import com.hcl.hackathon.fullstack.resource.polyglot.EntityPolyglot;

import java.io.Serializable;

/**
 * Abstract Base DTO concept abstraction level.
 * @param <T> DTO generic identifier type
 */
@JsonAutoDetect
@JsonIgnoreProperties
public abstract class BaseDTO<T extends Serializable> extends AbstractResource<T> implements Resource<T>, EntityPolyglot {
    private static final long serialVersionUID = 1L;

    private String href;

    /**
     * Qualified default class constructor
     */
    public BaseDTO() {
        // - Nop
    }

    /**
     * Qualified entity based class constructor.
     * @param other the given entity resource
     */
    public BaseDTO(EntityResource<T> other) {
        this.setHref(other.getHref());
        this.setId(other.getId());
        this.setVersion(other.getVersion());
    }

    @Override
    @JsonProperty("href")
    public String getHref() {
        return href;
    }

    @Override
    public void setHref(String href) {
        this.href = href;
    }

    @Override
    @JsonIgnore
    public Version getVersion() {
        return super.getVersion();
    }
}