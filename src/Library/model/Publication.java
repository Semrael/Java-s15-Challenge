package Library.model;

public abstract class Publication {
    private String title;
    private String author;
    private String pubDate;

    public Publication(String title, String author, String pubDate) {
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
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
}
