package com.nitorcreations.domain;

import org.apache.commons.lang3.builder.EqualsBuilder;
import org.apache.commons.lang3.builder.HashCodeBuilder;
import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

public class DomainObject {

    public final String packageName;

    public final String className;

    public final String description;

    public DomainObject(String packageName, String className, String description) {
        this.packageName = packageName;
        this.className = className;
        this.description = description;
    }

    public DomainObject(Class<?> clazz, String description) {
        this(clazz.getPackage().getName(), clazz.getSimpleName(), description);
    }

    public DomainObject(Class<?> clazz) {
        this(clazz, null);
    }

    public String getPackageName() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public int hashCode() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public boolean equals(Object obj) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    @Override
    public String toString() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
