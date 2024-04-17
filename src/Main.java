import Library.model.Book;
import Library.model.Reader;
import Library.service.Librarian;
import Library.service.MemberRecord;
import Library.service.MemberType;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
//        Book book1=new Book(001,"Kostas Mourselas","Kızıla Boyalı Saçlar",89.99,true,"20. Baskı","12.12.1222");
//        Book book2=new Book(002,"Falih Rıfkı Atay","Çankaya",122,true,"12. Baskı","12.12.1222");
//        Book book3=new Book(003,"Hüzün Nedeniyle kapalıyız","Kostas Mourselas",34.45,true,"10. Baskı","10,12,1222");
//        Book book4=new Book(004,"Ahmet Ümit","Beyoğlu'nun En Güzel Abisi",120,false,"4..Baskı","06.04.2341");
//        Book book5=new Book(005,"J.R.R.Tolken","Hurinin Çocukları",67,true,"3.Baskı","09.08.2000");
//        book5.display();
        Book book1=new Book(0001,"Kızıla Boyalı Saçlar","Kostas Mourselas","12.12.1222",123,true,"1. Baskı","12-12-1222");
        Book book2=new Book(0002,"Çankaya","Falih Rıfkı Atay","12.12.1222",123,true,"9. Baskı","12-12-1222");
        Book book3=new Book(0003,"Hüzün Nedeniyle kapalıyız","Kostas Mourselas","12.12.3222",123,false,"6. Baskı","12-12-1222");
        Book book4=new Book(0004,"Beyoğlu'nun En Güzel Abisi","Ahmet Ümit","12.12.3222",123,true,"6. Baskı","12-12-1222");
        Book book5=new Book(0005,"Hurinin Çocukları","J.R.R.Tolken","12.12.3222",123,false,"6. Baskı","12-12-1222");
        book5.display();

        System.out.println("********************************");

        Reader reader1=new Reader("Semra Elçelik");
        Reader reader2=new Reader("Nehir Elçelik");

        Librarian librarian=new Librarian("Cihan","12345");

        MemberRecord member1=new MemberRecord(001, MemberType.STAFF,"12-12-1111","Nehir Elçelik","Kayseri","123456345");
        MemberRecord member2=new MemberRecord(002,MemberType.CIVILIAN,"12-12-1223","Semra Elçelik","Kayseri","123456756");

        List<Book> books=new ArrayList<>();
        books.add(book1);
        books.add(book2);
        books.add(book3);
        books.add(book1);
        System.out.println(books);
       librarian.searchBook("Çankaya",books);

       if(librarian.verifyMember(member1)){//ödünç vermek için
           librarian.issueBook(book1,reader1);
       }
       librarian.returnBook(book1,reader1);
       librarian.returnBook(book2,reader2);

      double fine= librarian.calculateFine(member1);
      librarian.createBill(member1,fine);


    }
}