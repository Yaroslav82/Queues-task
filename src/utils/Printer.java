package utils;

import java.util.concurrent.atomic.AtomicInteger;

public class Printer<T> {

    public void print(String title, Iterable<T> iterable) {
        System.out.println(title);
        AtomicInteger counter = new AtomicInteger(1);
        iterable.forEach(el -> System.out.println(counter.getAndIncrement() + ") " + el));
        System.out.println();
    }
}
