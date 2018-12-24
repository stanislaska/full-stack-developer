package com.hcl.hackathon.fullstack.resource;

import java.io.Serializable;
import java.util.Objects;

/**
 * Abstract {@link Resource}'s top level implementation
 * @param <T> component resource identifier generic type
 */
public abstract class AbstractResource<T extends Serializable> implements Resource<T> {
    private T oid; // the given resource unique identifier
    private Version version;

    /**
     * Qualified default class constructor
     */
    public AbstractResource() {
        this(Version.V1);
    }

    /**
     * Full qualified resource constructor.
     * @param  version the given resource version
     */
    public AbstractResource(Version version) {
        this(null, version);
    }

    /**
     * Full qualified resource constructor.
     * @param oid the given resource unique identifier
     * @param  version the given resource version
     */
    public AbstractResource(T oid, Version version) {
        this.oid = oid;
        this.version = version;
    }

    /**
     * Full qualified resource constructor.
     * @param oid the given resource unique identifier
     */
    public AbstractResource(T oid) {
        this(oid, Version.V1); // default version v1
    }

    /**
     * {@inheritDoc}
     * @return
     */
    @Override
    public T getId() {
        return oid;
    }

    /**
     * {@inheritDoc}
     * @param id the current given resource identifier
     */
    @Override
    public void setId(T id) {
        this.oid = id;
    }

    @Override
    public Version getVersion() {
        return version;
    }

    @Override
    public void setVersion(Version version) {
        this.version = version;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        AbstractResource<?> that = (AbstractResource<?>) o;
        return Objects.equals(oid, that.oid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(oid);
    }
}