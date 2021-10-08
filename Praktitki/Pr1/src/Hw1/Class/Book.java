package Hw1.Class;
public class Book {
    private String name;
    private int pages;
    private String author;

    public Book(String n, int p, String a) {
        name = n;
        pages = p;
        author= a;
    }
    public Book(String n, int p) {
        name = n;
        pages = p;
        author = "authorless";
    }
    public Book(int p) {
        name = "";
        pages = p;
        author = "authorless";
    }
    public void setPages(int pages) {
        this.pages = pages;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public String getName(String name){
        return name;
    }
    public int getPages() {
        return pages;
    }
    public String getAuthor(String author){
        return author;
    }
    public String toString() {
        return "This is the book named " + this.name + " with " + this.pages + " pages by " + this.author;

    }
}
