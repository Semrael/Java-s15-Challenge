package Library.model;

public class Magazine extends Publication {
    public Magazine(String title, String author, String pubDate) {
        super(title, author, pubDate);
    }

    @Override
    public void display() {
        System.out.println("Magazine");
        showDetails();
    }
}
