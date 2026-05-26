package com.nitorcreations.scanners;

import java.util.List;

class AbstractScanner {

    final List<Class<?>> classes;

    AbstractScanner(final List<Class<?>> classes) {
        this.classes = classes;
    }

    boolean isDomainClass(final Class<?> clazz) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    boolean isDomainClass(final String name) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String stripClassHeader(final String fullToString) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    String convertFromAsmToComplete(String original) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
