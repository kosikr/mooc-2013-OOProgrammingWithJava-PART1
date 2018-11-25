/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Rafal
 */
import java.util.ArrayList;

public class Library {
    
    private ArrayList<Book> booksList;
    
    public Library() {
        this.booksList = new ArrayList<Book>();
    }
    
    public void addBook(Book newBook) {
        this.booksList.add(newBook);
        
    }
    
    public void printBooks() {
        for (Book printing : this.booksList) {
            System.out.println(printing);
        }
    }
    
    public ArrayList<Book> searchByTitle(String title) {
        ArrayList<Book> foundTitle = new ArrayList<Book>();
        for (Book ifContain : this.booksList) {
            if (StringUtils.included(ifContain.title(), title)) {
                foundTitle.add(ifContain);
            }
        }
        return foundTitle;
    }
    
    public ArrayList<Book> searchByPublisher(String publisher) {
        ArrayList<Book> foundPublisher = new ArrayList<Book>();
        for (Book ifContain : this.booksList) {
            if (StringUtils.included(ifContain.publisher(), publisher)) {
                foundPublisher.add(ifContain);
            }
        }
        return foundPublisher;
    }
    
    public ArrayList<Book> searchByYear(int year) {
        ArrayList<Book> foundYear = new ArrayList<Book>();
        for (Book ifContain : this.booksList) {
            if (ifContain.year() == year) {
                foundYear.add(ifContain);
            }
        }
        return foundYear;
    }
}
