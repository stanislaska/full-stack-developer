package com.hcl.hackathon.fullstack;

import com.hcl.hackathon.fullstack.resource.entities.EntityResource;

/**
 * Qualified helper class
 */
public final class Helper {

    /**
     * Qualified private default constructor
     */
    private Helper() throws InstantiationException {
        throw new InstantiationException("This helper class can not be instantiated! Please use any of the " +
                "provied helper methods");
    }

    /**
     * Convert the given resource into auto indexable href resource
     * @param resource the given resource
     * @return a valid href reference that point to the given resource
     * @throws NullPointerException Might throw a {@link NullPointerException} while the given resource is null or while
     *  any other null error occured.
     */
    public static String toHref(EntityResource resource) {
        if (null == resource) {
            throw new NullPointerException("Unexpecting null given resource");
        }
        else {
            return String.format("%s/%s/%s/%s", resource.getBaseUrl(), resource.getVersion().getNormalizedName(),
                resource.getObjectType(), resource.getId());
        }
    }
}