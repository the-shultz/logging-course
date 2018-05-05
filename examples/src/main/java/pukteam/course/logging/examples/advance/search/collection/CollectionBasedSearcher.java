package pukteam.course.logging.examples.advance.search.collection;

import pukteam.course.logging.examples.advance.search.SearchInCollection;

import java.util.Collection;

public class CollectionBasedSearcher implements SearchInCollection {
    @Override
    public <E extends Comparable<E>> boolean searchItemInCollection(Collection<E> collection, E item) {
        // TODO: Implement here search based on what Collections class has to offer...
        return false;
    }
}
