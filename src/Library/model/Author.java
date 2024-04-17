package Library.model;

import java.util.ArrayList;
import java.util.List;

public class Author extends Person {
    private String name;
    private List<Book> books;

    public Author(String name){
        super(name);
        this.books=new ArrayList<>();
    }

    public void new_book(Book book){
        books.add(book);
        System.out.println("'"+book.getTitle()+"'"+" kitabınız eklendi.");
    }

    public void show_book(){
        System.out.println(this.name+ "'ın yazdığı kitaplar.");
        for(Book book:books){
            System.out.println(book.getTitle());
        }
    }

    @Override
    public void whoYouAre() {
        super.whoYouAre();
        show_book();
    }
}
