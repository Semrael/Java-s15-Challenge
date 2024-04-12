package Library.model;

import java.util.Date;

public class Book {
    private long bookID;
    private String author;
    private String name;
    private double price;
    private boolean status;
    private String edition;
    private Date dateOfPurchase;

    public Book(long bookID, String author, String name, double price, boolean status, String edition, Date dateOfPurchase) {
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
}
