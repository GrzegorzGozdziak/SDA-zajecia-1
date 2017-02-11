package zajecia.dziewiate;

import java.util.ArrayList;

/**
 * Created by RENT on 2017-02-11.
 */
public class BookShelf {
    private ArrayList<Book> books;

    public BookShelf() {
        this.books = new ArrayList<>();
    }

    public ArrayList<Book> getBooks() {
        return books;
    }

    public Book get(int index){
        if (index >=0 && index < books.size()){
            return books.get(index);
        }
        return null;
    }

    public void add(Book book) {
        this.books.add(book);
    }

    public ArrayList<Book> getBooksOf(String author){
        ArrayList<Book> booksTmp = new ArrayList<>();

        for (Book book : books) {
            Author authorOfBook = book.getAuthor();
            boolean searchRequirement = authorOfBook.getFirstName().startsWith(author) ||
                    authorOfBook.getLastName().startsWith(author) ||
                    (authorOfBook.getLastName() + " " + authorOfBook.getFirstName()).startsWith(author) ||
                    authorOfBook.toString().startsWith(author);
            if(searchRequirement) {
                booksTmp.add(book);
            }
//            if(book.getAuthor().equals(author)) {
//                booksTmp.add(book);
//            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBooksFrom(int releaseDate) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : this.books) {
            if(book.getReleaseDate() == releaseDate) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    public ArrayList<Book> getBookSince(int releaseDate) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : this.books) {
            if(book.getReleaseDate() >= releaseDate) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }

    //getBookLongerThan
    public ArrayList<Book> getBookLongerThan(int number) {
        ArrayList<Book> booksTmp = new ArrayList<>();
        for (Book book : this.books) {
            if(book.getNumberOfPages() > number) {
                booksTmp.add(book);
            }
        }
        return booksTmp;
    }



}
