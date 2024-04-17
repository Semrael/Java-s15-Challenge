package Library.model;

public class StudyBook extends Publication{
    public StudyBook(String title, Author author, String pubDate) {
        super(title, author, pubDate);
    }

    @Override
    public void display() {
        System.out.println("Study Book");
        showDetails();
    }
}
