package zajecia.dziewiate;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-02-11.
 */
public class Zajecia9 {
    public static void main(String[] args) {

//        user.firstName = "Jan";
//        user.lastName = "Nowak";
//        user.birthDate = "12.02.2009";
//        User user1 = new User("Jan", "Nowak", "12.02.2008");
//        user1.firstName = "Jan";
//        user1.lastName = "Nowak";
//        user1.birthDate = "12.02.2009";
//        user.print();
//
//        User[] users = new User[2];
//        users[0] = user;
//        users[1] = user1;
//        printUsers(users);


//        User user = new User("Jan", "Nowak", "12.02.2009");
//        Address address = new Address("Poznań", "Poznanska", "30", "90-210", "PL");
//        user.address = address;
//        user.print();

//        address.print();

       //book.print();

        //book1.print();
        //String page = book.getPage(5);
        //System.out.println(page);

        String message = "Lorem Ipsum jest tekstem stosowanym jako przykładowy wypełniacz w przemyśle poligraficznym. Został po raz pierwszy użyty w XV w. przez nieznanego drukarza do wypełnienia tekstem próbnej książki. Pięć wieków później zaczął być używany przemyśle elektronicznym, pozostając praktycznie niezmienionym. Spopularyzował się w latach 60. XX w. wraz z publikacją arkuszy Letrasetu, zawierających fragmenty Lorem Ipsum, a ostatnio z zawierającym różne wersje Lorem Ipsum oprogramowaniem przeznaczonym do realizacji druków na komputerach osobistych, jak Aldus PageMaker";
        String message1 = "Lorem Ipsum jest przykładowy wypełniacz w przemyśle poligraficznym. Został po raz pierwszy użyty w XV w. przez nieznanego drukarza do wypełnienia tekstem próbnej książki. Pięć wieków później zaczął być używany przemyśle elektronicznym, pozostając praktycznie niezmienionym. Spopularyzował się w latach 60. XX w. wraz z publikacją arkuszy Letrasetu, zawierających fragmenty Lorem Ipsum, a ostatnio z zawierającym różne wersje Lorem Ipsum oprogramowaniem przeznaczonym do realizacji druków na komputerach osobistych, jak Aldus PageMaker";
        String message2 = "Lorem Ipsum przemyśle poligraficznym. Został po raz pierwszy użyty w XV w. przez nieznanego drukarza do wypełnienia tekstem próbnej książki. Pięć wieków później zaczął być używany przemyśle elektronicznym, pozostając praktycznie niezmienionym. Spopularyzował się w latach 60. XX w. wraz z publikacją arkuszy Letrasetu, zawierających fragmenty Lorem Ipsum, a ostatnio z zawierającym różne wersje Lorem Ipsum oprogramowaniem przeznaczonym do realizacji druków na komputerach osobistych, jak Aldus PageMaker";
        String message3 = "Lorem Ipsum jest tekstem wypełniacz w przemyśle poligraficznym. Został po raz pierwszy użyty w XV w. przez nieznanego drukarza do wypełnienia tekstem próbnej książki. Pięć wieków później zaczął być używany przemyśle elektronicznym, pozostając praktycznie niezmienionym. Spopularyzował się w latach 60. XX w. wraz z publikacją arkuszy Letrasetu, zawierających fragmenty Lorem Ipsum, a ostatnio z zawierającym różne wersje Lorem Ipsum oprogramowaniem przeznaczonym do realizacji druków na komputerach osobistych, jak Aldus PageMaker";
        BookShelf bookShelf = new BookShelf();

        Author henrykSienkiewicz = new Author("Henryk", "Sienkiewicz");
        Author adamMickiewicz = new Author("Mickiewicz", "Adam");

        Book book = new Book("Krzyzacy", henrykSienkiewicz,2000, message.split(" "));
        book.setCategory("Historyczna");
        book.setDescription("nawet fajna");

        Book book1 = new Book("Pan Wolodyjowski", henrykSienkiewicz,1990, message1.split(" "));
        book1.setCategory("Historyczna");
        book1.setDescription("nawet fajna");

        Book book2 = new Book("Potop", henrykSienkiewicz,2010, message2.split(" "));
        book2.setCategory("Historyczna");
        book2.setDescription("nawet fajna");

        Book book3 = new Book("Pan Tadeusz", adamMickiewicz,1989, message3.split(" "));
        book3.setCategory("Historyczna");
        book3.setDescription("nawet fajna");

        bookShelf.add(book);
        bookShelf.add(book1);
        bookShelf.add(book2);
        bookShelf.add(book3);

        String author = "Sienkiewicz Henryk";
        String author2 = "Mickiewicz Adam";

        ArrayList<Book> booksOf = bookShelf.getBooksOf(author);

//        for (Book b : bookShelf.getBooks()) {
//            b.print();
//        }
//
//        for (Book b : booksOf) {
//            b.print();
//        }
//        int releaseDate = 1990;
//        ArrayList<Book> booksFrom = bookShelf.getBooksFrom(releaseDate);
//
//        for (Book b : booksFrom ) {
//            b.print();
//        }
//        ArrayList<Book> booksSince = bookShelf.getBookSince(releaseDate);
//        for (Book b : booksSince ) {
//            b.print();
//        }
//
//        int numberOfPage = 72;
//        ArrayList<Book> booksLongerThan = bookShelf.getBookLongerThan(numberOfPage);
//        for (Book c : booksLongerThan ) {
//            c.print();
//        }

        String lookingAuthor1 = "Ad";
        ArrayList<Book> lookingAuthor = bookShelf.getBooksOf(lookingAuthor1);
        for (Book d : lookingAuthor) {
            d.print();
        }



    }
//
//    public static void printUsers(User[] users) {
//        for (int i = 0; i < users.length; i++) {
//            users[i].print();
//        }
//    }
}
