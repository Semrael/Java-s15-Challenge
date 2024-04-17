package Library.model;

import java.util.Date;
import java.util.Objects;

public class Book extends Publication {
    private long bookID;
    private double price;
    private boolean status;
    private String edition;
    private String dateOfPurchase;
    private String owner;

    public Book(long bookID,String title, String author, String pubDate,double price,boolean status,String edition,String dateOfPurchase) {
        super(title, author, pubDate);
        this.bookID=bookID;
        this.price=price;
        this.status=status;
        this.edition=edition;
        this.dateOfPurchase=dateOfPurchase;
    }


    public long getBookID() {
        return bookID;
    }

    public double getPrice() {
        return price;
    }

    public boolean isStatus() {
        return status;
    }

    public String getEdition() {
        return edition;
    }

    public String getDateOfPurchase() {
        return dateOfPurchase;
    }

    public String getOwner() {
        return owner;
    }

    public void change_owner(String newOwner){
        this.owner=newOwner;
        System.out.println("Sahip değiştirildi.");
    }

    @Override
    public void display() {
        showDetails();
        System.out.println("Book Id: "+ bookID);
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
                ", price=" + price +
                ", status=" + status +
                ", edition='" + edition + '\'' +
                ", dateOfPurchase='" + dateOfPurchase + '\'' +
                ", owner='" + owner + '\'' +
                '}';
    }
}
