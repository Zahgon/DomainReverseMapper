package com.nitorcreations;

import com.nitorcreations.domain.DomainObject;
import com.nitorcreations.domain.Edge;
import com.nitorcreations.presenters.DefaultGraphvizPresenter;
import com.nitorcreations.presenters.Presenter;
import com.nitorcreations.scanners.FieldScanner;
import com.nitorcreations.scanners.HierarchyScanner;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import java.net.URLClassLoader;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class DomainMapper {

    private static final Logger log = LoggerFactory.getLogger(DomainMapper.class);

    private final FieldScanner fieldScanner;

    private final HierarchyScanner hierarchyScanner;

    private final List<Class<?>> classes;

    private final Presenter presenter = new DefaultGraphvizPresenter();

    DomainMapper(final List<Class<?>> classes) {
        this.classes = classes;
        fieldScanner = new FieldScanner(classes);
        hierarchyScanner = new HierarchyScanner(classes);
    }

    public String describeDomain() throws ClassNotFoundException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public List<Class<?>> getClasses() {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static DomainMapper create(List<String> packages, URLClassLoader classLoader) throws ClassNotFoundException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }

    public static DomainMapper create(final List<String> packages) throws ClassNotFoundException {
        throw new UnsupportedOperationException("STUB: not implemented");
    }
}
