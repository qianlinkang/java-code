package code.java.learn.ch8.s2;

import java.util.Collection;

@FunctionalInterface
public interface CalAll<T> {
    int calAll(Collection<T> collection, String predicateStr);
}
