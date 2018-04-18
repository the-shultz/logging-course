package pukteam.course.logging.examples.advance.sort;

import pukteam.course.logging.examples.advance.sort.bubble.BubbleSort;
import pukteam.course.logging.examples.advance.sort.jdk.collection.NativeCollectionBasedSorter;
import pukteam.course.logging.examples.advance.sort.jdk.stream.StreamSortBasedSorter;

import java.util.Collection;

public interface SortCollection {
    enum SORT_ALG {BUBBLE, COLLECTION, STREAM};

    <E extends Comparable<E>> Collection<E> sortACollection(Collection<E> input);

    static SortCollection get(SORT_ALG sortAlg) {
        switch (sortAlg) {
            case BUBBLE:
                return new BubbleSort();
            case COLLECTION:
                return new NativeCollectionBasedSorter();
            case STREAM:
                return new StreamSortBasedSorter();
            default:
                throw new UnsupportedOperationException("Unknown sort algorithm: " + sortAlg);
        }

    }
}
