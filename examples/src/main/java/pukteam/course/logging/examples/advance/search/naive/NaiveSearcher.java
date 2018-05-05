package pukteam.course.logging.examples.advance.search.naive;

import pukteam.course.logging.examples.advance.search.SearchInCollection;

import java.util.Collection;

public class NaiveSearcher implements SearchInCollection {
    @Override
    public <E extends Comparable<E>> boolean searchItemInCollection(Collection<E> collection, E item) {
        // TODO: Implement naive search method here
        return false;
    }
}
