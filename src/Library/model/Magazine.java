package Library.model;

public class Magazine extends Publication {
    public Magazine(String title,Author author, String pubDate) {
        super(title, author, pubDate);
    }

    @Override
    public void display() {
        System.out.println("Magazine");
        showDetails();
    }
}
