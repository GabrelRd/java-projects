/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aula09;

/**
 *
 * @author gabri
 */
public class Book implements Publication {
    private String title,author,reader;
    private int totalPages,actualPage;
    private boolean openBook;

    public Book(String title, String author, String reader, int totalPages) {
        this.title = title;
        this.author = author;
        this.reader = reader;
        this.totalPages = totalPages;
    }
    
    

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getReader() {
        return reader;
    }

    public void setReader(String reader) {
        this.reader = reader;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getActualPage() {
        return actualPage;
    }

    public void setActualPage(int actualPage) {
        this.actualPage = actualPage;
    }

    public boolean isOpenBook() {
        return openBook;
    }

    public void setOpenBook(boolean openBook) {
        this.openBook = openBook;
    }

    public String detais() {
        return "Book{" + "title=" + title + ", author=" + author + ", reader=" + reader + ", totalPages=" + totalPages + ", actualPage=" + actualPage + ", openBook=" + openBook + '}';
    }

    @Override
    public void open() {
        
    }

    @Override
    public void close() {
    }

    @Override
    public void browse() {
    }

    @Override
    public void skipPage() {
    }

    @Override
    public void backPage() {
    }
    
}
