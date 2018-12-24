package com.hcl.hackathon.fullstack.service;

import com.hcl.hackathon.fullstack.resource.entities.EntityResource;

import java.io.Serializable;
import java.util.List;
import java.util.Optional;

/**
 * Default Non propository service provisioning
 * @param <T> Generic data source type
 */
public interface NoRepositoryService<T extends EntityResource> {

    /**
     * Gets all available resource
     * @return Might return a valid list of available resource or <code>null</code> or <code>empty</code> otherwise.
     */
    List<T> findAll();

    /**
     * Find the any existing {@link EntityResource} that match with the given resource id
     * @param id the given existing resource identifier
     * @return Might return {@link EntityResource}'s instance or throw ResourceNotFoundException
     */
    Optional<T> findById(Serializable id);

    /**
     * Delete the given resource entity
     * @param id the given resource id
     */
    void delete(Serializable id);

    /**
     * Update the given resource entity
     * @param id the given resource id
     * @param entity the given resource to update
     * @return Might return a valid instance of updated resource
     */
    Optional<T> update(Serializable id, T entity);
}