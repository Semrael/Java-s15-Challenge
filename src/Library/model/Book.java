package Library.model;

import java.util.Date;
import java.util.Objects;

public class Book {
    private long bookID;
    private String author;
    private String name;
    private double price;
    private boolean status;
    private String edition;
    private String dateOfPurchase;

    public Book(long bookID, String author, String name, double price, boolean status, String edition, String dateOfPurchase) {
        this.bookID = bookID;
        this.author = author;
        this.name = name;
        this.price = price;
        this.status = status;
        this.edition = edition;
        this.dateOfPurchase = dateOfPurchase;
    }

    public String get_title(){
        return this.name;
    }
    public String get_author(){
        return this.author;
    }

    public boolean isStatus() {
        return status;
    }

    public void change_owner(String newOwner){
        //Sahibini  değiştireceğim
    }

    public void display(){
        System.out.println("Book Details.");
        System.out.println("Book Id: "+ bookID);
        System.out.println("Name:"+ name);
        System.out.println("Author:" +author);
        System.out.println("Price"+ price);
        System.out.println("Status:"+ (status?"Available":"Not available"));
        System.out.println("Editoin: "+ edition);
        System.out.println("Date of purchase:"+dateOfPurchase);
    }

    public void update_status(boolean newStatus){
        status=newStatus;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Book book)) return false;
        return bookID == book.bookID;
    }

    @Override
    public int hashCode() {
        return Objects.hash(bookID);
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookID=" + bookID +
                ", author='" + author + '\'' +
                ", name='" + name + '\'' +
                ", price=" + price +
                ", status=" + status +
                ", edition='" + edition + '\'' +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                '}';
    }
}
