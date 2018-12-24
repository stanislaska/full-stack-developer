package com.hcl.hackathon.fullstack.resource;

import java.io.Serializable;

/**
 * Resource top level definittion
 */
public interface Resource<T extends Serializable> extends Serializable {

    /**
     * Gets the given resource versionnable href
     * @return a valid resource versionable href
     */
    String getHref();

    /**
     * Gets the current resource versionnable href
     * @param href the current resource href
     */
    void setHref(String href);

    /**
     * Gets the current resource unique identifier
     * @return Might return a valid current resource identifier
     */
    T getId();

    /**
     * Set the current resource unique identifier
     * @param id the current given resource identifier
     */
    void setId(T id);

    /**
     * Gets the current resource version instance
     * @return a valid resource version  or <code>null</code> otherwise
     */
    Version getVersion();

    /**
     * Set the current resource version instance
     * @param version the given version instance.
     */
    void setVersion(Version version);
}