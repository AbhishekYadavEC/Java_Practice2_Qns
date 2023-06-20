package statics;


import java.io.Console;

public class Book {
    private String boolTitle;
    private String bookAuthor;
    private int numOfPage;

    public Book(String boolTitle, String bookAuthor, int numOfPage) {
        this.boolTitle = boolTitle;
        this.bookAuthor = bookAuthor;
        this.numOfPage = numOfPage;
    }

    public String getBoolTitle() {
        return boolTitle;
    }

    public void setBoolTitle(String boolTitle) {
        this.boolTitle = boolTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public int getNumOfPage() {
        return numOfPage;
    }

    public void setNumOfPage(int numOfPage) {
        this.numOfPage = numOfPage;
    }
}
