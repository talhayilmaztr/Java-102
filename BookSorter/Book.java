package BookSorter;

public class Book implements Comparable<Book> {
    private String book_name;
    private String author;
    private int page_number;
    private int publication_date;

    @Override
    public int compareTo(Book o) {
        return this.book_name.compareTo(o.book_name);
    }

    public String getBook_name() {
        return book_name;
    }

    public void setBook_name(String book_name) {
        this.book_name = book_name;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getPage_number() {
        return page_number;
    }

    public void setPage_number(int page_number) {
        this.page_number = page_number;
    }

    public int getPublication_date() {
        return publication_date;
    }

    public void setPublication_date(int publication_date) {
        this.publication_date = publication_date;
    }

    public Book(String book_name, String author, int page_number, int publication_date) {
        this.book_name = book_name;
        this.author = author;
        this.page_number = page_number;
        this.publication_date = publication_date;
    }
}
