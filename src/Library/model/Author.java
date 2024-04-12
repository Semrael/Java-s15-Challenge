package Library.model;

import java.util.ArrayList;
import java.util.List;

public class Author {
    private String name;
    private List<Book> books;

    public Author(String name){
        this.name=name;
        this.books=new ArrayList<>();
    }

    public void new_book(Book book){
        books.add(book);
        System.out.println("'"+book.get_title()+"'"+" kitabınız eklendi.");
    }

    public void show_book(){
        System.out.println(this.name+ "'ın yazdığı kitaplar.");
        for(Book book:books){
            System.out.println(book.get_title());
        }
    }

    public void whoYouAre(){
        System.out.println("Who am I............");
        show_book();
    }
}
