package com.hcl.hackathon.fullstack.resource.polyglot;

import com.hcl.hackathon.fullstack.resource.Polyglot;
import com.hcl.hackathon.fullstack.resource.dto.BaseDTO;
import com.hcl.hackathon.fullstack.resource.entities.EntityResource;

/**
 * Entity Poluglot converter interface
 */
public interface EntityPolyglot extends Polyglot {
    /**
     * Convert the current polyglot object into entity based type
     * @param <T> the final expected {@link EntityResource} type instance
     * @return a valid converted {@link EntityResource} instance type or <code>null</code> otherwise.
     */
    <T extends EntityResource> T toEntity();
}