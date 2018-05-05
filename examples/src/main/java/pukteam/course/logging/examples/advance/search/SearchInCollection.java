package pukteam.course.logging.examples.advance.search;

import pukteam.course.logging.examples.advance.search.binary.BinarySearcher;
import pukteam.course.logging.examples.advance.search.collection.CollectionBasedSearcher;
import pukteam.course.logging.examples.advance.search.naive.NaiveSearcher;
import java.util.Collection;

public interface SearchInCollection {

    enum SEARCH_ALG {BINARY, NAIVE, COLLECTIONS}

    <E extends Comparable<E>> boolean searchItemInCollection(Collection<E> collection, E item);

    static SearchInCollection get(SEARCH_ALG searchAlg) {
        switch (searchAlg) {
            case  BINARY:
                return new BinarySearcher();
            case COLLECTIONS:
                return new CollectionBasedSearcher();
            case NAIVE:
                return new NaiveSearcher();
            default:
                throw new UnsupportedOperationException("Unknown search algorithm: " + searchAlg);
        }

    }

}
