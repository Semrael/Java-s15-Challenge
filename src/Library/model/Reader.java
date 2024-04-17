package Library.model;

import java.util.ArrayList;
import java.util.List;

public class Reader extends Person{
    private List<Book> books;

    public Reader(String name) {
        super(name);
        this.books = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public void purchase_book(Book book){
        if(book != null){
            System.out.println(getName()+ ", "+ book.get_title()+ "kitabını satın aldı.");
        }
        else{
            System.out.println("Kütüphanemizde bu kitap yok.");
        }
    }

    public void borrow_book(Book book){
        if(book != null){
            System.out.println(getName()+", " +book.get_title()+ " kitabını ödünç aldı");
            books.add(book);
        }
        else{
            System.out.println("Kütüphanemizde bu kitap yok.");
        }
    }

    public void return_book(Book book){
        if(books.contains(book)){
            books.remove(book);
            System.out.println(book.get_title()+ "kütüphaneye iade edildi.");
        }
        else{
            System.out.println("Bu kitap bize ait değil.");
        }
    }

    public void show_book(){
        System.out.println(getName()+ "ın kitap listesi");
        for(Book book:books){
            System.out.println(book.get_title());
        }
    }

    @Override
    public void whoYouAre() {
        super.whoYouAre();
        System.out.println("Kitap Listem");
        show_book();
    }
}
