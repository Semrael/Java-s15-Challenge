package Library.service;

import Library.model.Book;
import Library.model.Reader;


import java.util.ArrayList;
import java.util.List;

public class Librarian {
    private String name;
    private String password;

    public Librarian(String name, String password) {
        this.name = name;
        this.password = password;
    }

    public String getName() {
        return name;
    }

    public String getPassword() {
        return password;
    }

    public void searchBook(String keyword, List<Book> books) {
        List<Book> searchResult = new ArrayList<>();

        for (Book book : books) {
            if (book.getTitle().contains(keyword) || book.getAuthor().getName().contains(keyword)) {
                searchResult.add(book);
            }
        }
        if (!searchResult.isEmpty()) {
            for (Book book : searchResult) {
                System.out.println(book.getTitle() + ": " + book.getAuthor());
            }
        } else {
            System.out.println("Aranan kelime ile eşleşen bir kitap bulunamadı. Farklı kelimeler ile aramayı deneyiniz.");
        }
    }

    public boolean verifyMember(MemberRecord member) {
        return member != null;
    }

    public void issueBook(Book book, Reader reader) {
        if (book != null && reader != null) {
            if (book.isStatus()) {
                if (reader.getBooks().size() < 5) {
                    book.update_status(false);
                    reader.borrow_book(book);
                    System.out.println(book.getTitle() + " Kitabı " + reader.getName() + "'a ödünç verildi.");
                } else {
                    System.out.println(reader.getName() + ": Kitap alma limitini aştı.");
                }
            } else {
                System.out.println("Kitap bulunmuyor.");
            }
        } else {
            System.out.println("Kitap ya da kayıtlı okuyucu bulunamadı.");
        }
    }

    public double calculateFine(MemberRecord member) {
        int noBookIssued = member.getNoBooksIssued();
        return 0.1 * noBookIssued;
    }

    public void createBill(MemberRecord member, double fine) {
        System.out.println(member.getName() + "'ın fatura bedeli: " + fine);
    }

    public void returnBook(Book book, Reader reader) {
        if (book != null && reader != null) {
            if (reader.getBooks().contains(book)) {
                book.update_status(true);
                reader.return_book(book);
                System.out.println(book.getTitle() + " kitabı " + reader.getName() + " tarafından başarıyla iade edildi");



            } else {
                System.out.println("Bu kitap " + reader.getName() + " tarafından ödünç alınmamış.");
            }
        } else {
            System.out.println("Okuyucu ya da kitap bilgisi eksik.");
        }
    }}