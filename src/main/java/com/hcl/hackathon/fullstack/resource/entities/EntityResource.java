package com.hcl.hackathon.fullstack.resource.entities;

import com.hcl.hackathon.fullstack.Helper;
import com.hcl.hackathon.fullstack.resource.AbstractResource;
import com.hcl.hackathon.fullstack.resource.Resource;
import com.hcl.hackathon.fullstack.resource.Version;
import com.hcl.hackathon.fullstack.resource.polyglot.DtoPolyglot;

import javax.validation.constraints.NotEmpty;
import java.io.Serializable;
import java.util.Date;

public abstract class EntityResource<T extends Serializable> extends AbstractResource<T>
        implements Resource<T>, DtoPolyglot {

    private String href;
    private Date dateModification;
    private boolean active;

    @NotEmpty
    private transient final String baseUrl;

    public EntityResource(@NotEmpty String baseUrl) {
        this(baseUrl, Version.V1);
    }

    public EntityResource(@NotEmpty String baseUrl, T oid, Version version) {
        super(oid, version);
        this.baseUrl = baseUrl;
        this.setDateModification(new Date());
    }

    public EntityResource(@NotEmpty String baseUrl, T oid) {
        this(baseUrl, oid, Version.V1);
    }

    public EntityResource(@NotEmpty String baseUrl, Version version) {
        this(baseUrl, null, version);
    }

    public Date getDateModification() {
        return dateModification;
    }

    public void setDateModification(Date dateModification) {
        this.dateModification = dateModification;
    }

    public boolean isActive() {
        return active;
    }

    public boolean getActive() {
        return active;
    }

    public void setActive(boolean active) {
        this.active = active;
    }

    public String getHref() {
        if (null == href || 0 == href.trim().length()) {
            href = Helper.toHref(this);
        }
        return href;
    }

    public void setHref(final String href) {
        this.href = href;
    }

    public String getBaseUrl() {
        return baseUrl;
    }

    /**
     * Gets the given object type
     * @return a valid given object type.
     */
    public abstract String getObjectType();
}