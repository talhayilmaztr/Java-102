package BookSorter;

import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) {
        String bookss[] = new String [10];
        Set<Book> books = new TreeSet<>();

        Book book1 = new Book("Gizemli Adalar", "Elif Şafak", 320, 2021);
        Book book2 = new Book("Kayıp Zaman", "Orhan Pamuk", 450, 2018);
        Book book3 = new Book("Sonsuz Gece", "Ayşe Kulin", 290, 2020);
        Book book4 = new Book("Gökyüzü Yolu", "Hakan Günday", 370, 2019);
        Book book5 = new Book("Savaş ve Barış", "Lev Tolstoy", 800, 2015);

        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book4);
        books.add(book5);

        // Printing books by their natural order
        int i = 0;
        System.out.println("Books sorted by default order (name):");
        for (Book book : books) {
            System.out.println(book.getBook_name() + " - " + book.getPage_number());
            bookss[i] = book.getBook_name();
            i++;
        }
        i=0;

        System.out.println("\n-------------------------------------------------");

        // Sorting books by page number in descending order
        Set<Book> books2 = new TreeSet<>(new OrderByPageComparator().reversed());
        books2.addAll(books);

        // Printing books sorted by page number
        System.out.println("Books sorted by page number:");
        Iterator<Book> iterator = books2.iterator();
        while (iterator.hasNext()) {
            Book book = iterator.next();
            System.out.println(bookss[i] + " - " + book.getPage_number());
            i++;
        }
    }
}
