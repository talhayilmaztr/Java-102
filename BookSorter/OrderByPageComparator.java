package BookSorter;

import java.util.Comparator;

public class OrderByPageComparator implements Comparator<Book> {

    @Override
    public int compare(Book o1, Book o2) {
        return o2.getPage_number() - o1.getPage_number();
    }
}
