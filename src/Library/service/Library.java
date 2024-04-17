package Library.service;

import Library.model.Book;
import Library.model.Reader;

import java.util.ArrayList;
import java.util.List;

public class Library {
    private List<Book> books;
    private List<Reader> readers;

    public Library() {
        this.books = new ArrayList<>();
        this.readers = new ArrayList<>();
    }

    public List<Book> getBooks() {
        return books;
    }

    public List<Reader> getReaders() {
        return readers;
    }

    public void newBook(Book book) {
        books.add(book);
        System.out.println("Kütüphaneye yeni kitap eklendi: ");
        book.display();
    }

    public void lendBook(Book book, Reader reader) {
        if(!books.contains(book)){
            System.out.println(book.getTitle()+" kitabı kütüphanede yok.");
            return;
        }
        reader.borrow_book(book);

    }

    public void takeBackBook(Book book,Reader reader){
        if(!reader.getBooks().contains(book)){
            System.out.println(book.getTitle()+"bu kitabı ödünç almadınız.");
        }
        reader.return_book(book);
    }
    public void showBook(){
        System.out.println("Kütüphanemizde bulunan kitapların listesi");
        for(Book book:books){
            book.display();
        }
    }
}