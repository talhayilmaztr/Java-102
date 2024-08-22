import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Test {
    public static void main(String[] args) {
        List<Book> bookList = new ArrayList<>();

        bookList.add(new Book("Book A", 150, "Author A", "2001"));
        bookList.add(new Book("Book B", 95, "Author B", "2005"));
        bookList.add(new Book("Book C", 200, "Author C", "2010"));
        bookList.add(new Book("Book D", 75, "Author D", "2015"));
        bookList.add(new Book("Book E", 180, "Author E", "2020"));
        bookList.add(new Book("Book F", 50, "Author F", "2021"));
        bookList.add(new Book("Book G", 300, "Author G", "1999"));
        bookList.add(new Book("Book H", 120, "Author H", "1980"));
        bookList.add(new Book("Book I", 110, "Author I", "1975"));
        bookList.add(new Book("Book J", 90, "Author J", "1960"));

        Map<String, String> bookAuthorMap = bookList.stream()
                .collect(Collectors.toMap(Book::getName, Book::getAuthorName));

        System.out.println("Book Name - Author Name Map:");
        bookAuthorMap.forEach((name, author) -> System.out.println(name + " - " + author));

        List<Book> filteredBooks = bookList.stream()
                .filter(book -> book.getPageCount() > 100)
                .collect(Collectors.toList());

        System.out.println("\nBooks with more than 100 pages:");
        filteredBooks.forEach(book -> System.out.println(book.getName() + " - " + book.getPageCount() + " pages"));
    }
}
