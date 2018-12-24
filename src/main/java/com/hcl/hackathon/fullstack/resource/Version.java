package com.hcl.hackathon.fullstack.resource;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Optional;

/**
 * Defined resource version
 */
public enum Version {
    V1;

    private static final Logger LOGGER = LoggerFactory.getLogger(Version.class);

    /**
     * Qualified private default class constructor
     */
    private Version() {
        // - Nop
    }

    /**
     * Gets the version normalised name
     * @return a valid version normalized name
     */
    public String getNormalizedName() {
        String name = this.name();
        return 0 != name.trim().length() ? name.trim().toLowerCase() : null;
    }

    /**
     * Gets the version optiona instance matched with the given string name
     * @param name the given verison string litteral
     * @return a valid {@link Optional} value of the given string value
     */
    public static Optional<Version> getVersion(String name) {
        Optional<Version> op = Optional.empty();

        try {
            Version version = Version.valueOf(name);
            op = Optional.of(version);
        }
        catch (IllegalArgumentException iae) {
            LOGGER.error("Error while retrieving version {}", name, iae);
        }
        return op;
    }
}
