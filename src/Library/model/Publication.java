package Library.model;

public abstract class Publication {
    private String title;
    private Author author;
    private String pubDate;

    public Publication(String title, Author author, String pubDate) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public String getPubDate() {
        return pubDate;
    }
    public abstract void display();
    public void showDetails(){
        System.out.println("Book Details.");
        System.out.println("Title"+getTitle());
        System.out.println("Author"+getAuthor());
        System.out.println("Publication Date:"+getPubDate());
    }

    @Override
    public String toString() {
        return "Publication{" +
                "title='" + title + '\'' +
                ", author='" + author.getName() + '\'' +
                ", pubDate='" + pubDate + '\'' +
                '}';
    }
}
