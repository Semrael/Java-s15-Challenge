package Library.model;

public class Journals extends Publication{
    public Journals(String title, String author, String pubDate) {
        super(title, author, pubDate);
    }

    @Override
    public void display() {
        System.out.println("Journal");
        showDetails();
    }
}
