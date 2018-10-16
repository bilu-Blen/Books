package me.Blen;

public class Books {
    private String title;
    private int ISBN;
    private Author author;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getISBN() {
        return ISBN;
    }

    public void setISBN(int ISBN) {
        this.ISBN = ISBN;
    }

    public Author getAuthor() {
        return author;
    }

    public void setAuthor(Author author) {
        this.author = author;
    }

    public String getAuthorFullName(){
        return author.getFirstName() + " " + author.getLastName();
    }
}
