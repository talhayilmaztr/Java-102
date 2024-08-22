public class Book {
    private String name;
    private int pageCount;
    private String authorName;
    private String publishDate;

    public Book(String name, int pageCount, String authorName, String publishDate) {
        this.name = name;
        this.pageCount = pageCount;
        this.authorName = authorName;
        this.publishDate = publishDate;
    }

    public String getName() {
        return name;
    }

    public int getPageCount() {
        return pageCount;
    }

    public String getAuthorName() {
        return authorName;
    }

    public String getPublishDate() {
        return publishDate;
    }
}
