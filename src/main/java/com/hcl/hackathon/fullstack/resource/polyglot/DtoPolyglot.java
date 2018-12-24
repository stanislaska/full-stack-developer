package com.hcl.hackathon.fullstack.resource.polyglot;

import com.hcl.hackathon.fullstack.resource.Polyglot;
import com.hcl.hackathon.fullstack.resource.dto.BaseDTO;

/**
 * Dto Poluglot converter interface
 */
public interface DtoPolyglot extends Polyglot {
    /**
     * Convert the current polyglot object into Dto based type
     * @param <T> the final expected {@link BaseDTO} type instance
     * @return a valid converted {@link BaseDTO} instance type or <code>null</code> otherwise.
     */
    <T extends BaseDTO> T toDto();
}