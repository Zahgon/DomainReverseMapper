package com.nitorcreations.scanners;

import com.nitorcreations.domain.DomainObject;
import com.nitorcreations.domain.Edge;
import com.nitorcreations.domain.EdgeType;
import java.util.ArrayList;
import java.util.List;

public class HierarchyScanner extends AbstractScanner {

    public HierarchyScanner(List<Class<?>> classes) {
        super(classes);
    }

    public List<Edge> getEdges() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
