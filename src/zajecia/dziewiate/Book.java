package zajecia.dziewiate;

/**
 * Created by RENT on 2017-02-11.
 */
public class Book {

    private String title;
    private Author author;
    private int numberOfPages;
    private int releaseDate;
    private String description;
    private String[] content;
    private String category;

    //konstruktory

    public Book(String title, Author author, int releaseDate, String[] content) {
        this.title = title;
        this.author = author;
        this.releaseDate = releaseDate;
        this.content = content;
        this.numberOfPages = content.length;
    }

    public Book(String title, Author author, int releaseDate, String description, String[] content, String category) {
        this(title, author, releaseDate, content);
        this.description = description;
        this.category = category;
    }


    public void print() {
        System.out.println(
                title +
                "\n" + author + "\nNumber of pages: " +
                numberOfPages + "\nRelease Date: " +
                releaseDate +"\ndescription: \n" + description +
                "\nCategory: " + category + "\n\n");

    }

    public String getPage(int index) {
        int actualIndex = index - 1;
        return (actualIndex >= 1 && actualIndex < this.numberOfPages) ? this.content[index - 1].toString() : "Brak strony";
    }

    public String getTitle() {
        return title;
    }

    public Author getAuthor() {
        return author;
    }

    public int getNumberOfPages() {
        return numberOfPages;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public String getDescription() {
        return description;
    }

    public String[] getContent() {
        return content;
    }

    public String getCategory() {
        return category;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
