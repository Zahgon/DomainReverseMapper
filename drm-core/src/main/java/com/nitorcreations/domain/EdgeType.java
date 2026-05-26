package com.nitorcreations.domain;

public enum EdgeType {

    ONE_TO_ONE,
    MANY_TO_ONE,
    MANY_TO_MANY,
    ONE_TO_MANY,
    EXTENDS,
    INNER_CLASS;

    public static EdgeType resolveEdgeType(EdgeType source, EdgeType target) {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
